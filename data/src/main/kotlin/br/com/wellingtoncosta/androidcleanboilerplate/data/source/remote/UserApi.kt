package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote

import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Credentials
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.User
import com.github.kittinunf.result.Result

/**
 * @author Wellington Costa on 18/12/2018.
 **/
interface UserApi {

    suspend fun save(user: User): Result<User, Exception>

    suspend fun authenticate(credentials: Credentials): Result<User, Exception>

}