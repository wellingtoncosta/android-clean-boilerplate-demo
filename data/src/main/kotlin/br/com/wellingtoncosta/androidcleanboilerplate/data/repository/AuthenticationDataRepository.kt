package br.com.wellingtoncosta.androidcleanboilerplate.data.repository

import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.cache.AuthenticationCache
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.dao.UserDao
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.AuthenticationApi
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Credentials
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.User
import br.com.wellingtoncosta.androidcleanboilerplate.domain.repository.AuthenticationRepository
import com.github.kittinunf.result.Result

/**
 * @author Wellington Costa on 20/12/2018.
 **/
class AuthenticationDataRepository(
    private val api: AuthenticationApi,
    private val db: UserDao,
    private val cache: AuthenticationCache
) : AuthenticationRepository {

    override suspend fun login(credentials: Credentials): Result<User, Exception> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun logout(): Result<Unit, Exception> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getLoggedUser(): Result<User, Exception> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}