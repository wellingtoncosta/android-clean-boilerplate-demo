package br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.cache

/**
 * @author Wellington Costa on 18/12/18
 */
interface AuthenticationCache {

    suspend fun saveToken(token: String)

    suspend fun getToken(): String?

    suspend fun saveEmailOfLoggedUser(email: String)

    suspend fun getEmailOfLoggedUser(): String?

    suspend fun clear()

    companion object {
        const val TOKEN_KEY = "TOKEN_KEY"
        const val USER_EMAIL_KEY = "USER_EMAIL_KEY"
    }

}