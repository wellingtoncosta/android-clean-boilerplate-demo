package br.com.wellingtoncosta.androidcleanboilerplate.domain.repository

import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Credentials
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.User
import com.github.kittinunf.result.Result

/**
 * @author Wellington Costa on 17/12/2018.
 **/
interface AuthenticationRepository {

    suspend fun login(credentials: Credentials): Result<User, Exception>

    suspend fun logout(): Result<Unit, Exception>

    suspend fun getLoggedUser(): Result<User, Exception>

}