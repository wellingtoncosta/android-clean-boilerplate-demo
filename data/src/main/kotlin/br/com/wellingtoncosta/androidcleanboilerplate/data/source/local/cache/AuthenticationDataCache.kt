package br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.cache

import android.content.SharedPreferences
import androidx.core.content.edit
import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runAsyncOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runJobOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.cache.AuthenticationCache.Companion.TOKEN_KEY
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.cache.AuthenticationCache.Companion.USER_EMAIL_KEY

/**
 * @author Wellington Costa on 19/12/2018.
 **/
class AuthenticationDataCache(
        private val prefs: SharedPreferences
) : AuthenticationCache {

    override suspend fun saveToken(token: String) = runJobOnIo {
        prefs.edit { putString(TOKEN_KEY, token) }
    }

    override suspend fun getToken(): String? = runAsyncOnIo {
        prefs.getString(TOKEN_KEY, null)
    }

    override suspend fun saveEmailOfLoggedUser(email: String) = runJobOnIo {
        prefs.edit { putString(USER_EMAIL_KEY, email) }
    }

    override suspend fun getEmailOfLoggedUser(): String? = runAsyncOnIo {
        prefs.getString(USER_EMAIL_KEY, null)
    }

    override suspend fun clear() = runJobOnIo {
        prefs.edit {
            putString(TOKEN_KEY, null)
            putString(USER_EMAIL_KEY, null)
        }
    }

}