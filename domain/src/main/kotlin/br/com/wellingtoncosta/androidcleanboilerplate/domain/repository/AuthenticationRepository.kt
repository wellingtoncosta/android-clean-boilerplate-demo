package br.com.wellingtoncosta.androidcleanboilerplate.domain.repository

import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Credentials
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.User

/**
 * @author Wellington Costa on 17/12/2018.
 **/
interface AuthenticationRepository {

    suspend fun login(credentials: Credentials): User

    suspend fun logout()

    suspend fun getLoggedUser(): User?

}