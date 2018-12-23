package br.com.wellingtoncosta.androidcleanboilerplate.data.repository

import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runAsyncOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runJobOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.mapper.toDomain
import br.com.wellingtoncosta.androidcleanboilerplate.data.mapper.toEntity
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.cache.AuthenticationCache
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.dao.UserDao
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.AuthenticationApi
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Credentials
import br.com.wellingtoncosta.androidcleanboilerplate.domain.repository.AuthenticationRepository

/**
 * @author Wellington Costa on 20/12/2018.
 **/
class AuthenticationDataRepository(
    private val api: AuthenticationApi,
    private val db: UserDao,
    private val cache: AuthenticationCache
) : AuthenticationRepository {

    override suspend fun login(credentials: Credentials) = runAsyncOnIo {
        val response = api.authenticate(credentials)
        db.insert(response.user.toEntity())
        cache.saveToken(response.token)
        response.user
    }

    override suspend fun logout() = runJobOnIo { cache.clear() }

    override suspend fun getLoggedUser() = runAsyncOnIo {
        cache.getEmailOfLoggedUser()?.let { db.findByEmail(it)?.toDomain() }
    }

}
