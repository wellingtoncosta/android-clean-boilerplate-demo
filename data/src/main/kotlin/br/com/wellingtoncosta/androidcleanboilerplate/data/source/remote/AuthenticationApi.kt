package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote

import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.response.UserResponse
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Credentials

/**
 * @author Wellington Costa on 20/12/2018.
 **/
interface AuthenticationApi {

    suspend fun authenticate(credentials: Credentials): UserResponse

}