package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote

import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Credentials
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.User
import com.github.kittinunf.result.Result

/**
 * @author Wellington Costa on 20/12/2018.
 **/
interface AuthenticationApi {

    suspend fun authenticate(credentials: Credentials): Result<User, Exception>

}