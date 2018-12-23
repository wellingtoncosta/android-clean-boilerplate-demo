package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.fuel

import awaitStringResponse
import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runAsyncOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.AuthenticationApi
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.constant.Endpoints.LOGIN_ENDPOINT
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.constant.Http.AUTHORIZATION
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.response.UserResponse
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Credentials
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.User
import com.github.kittinunf.fuel.Fuel
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.serialization.json.JSON

/**
 * @author Wellington Costa on 20/12/2018.
 **/
class AuthenticationFuelApi : AuthenticationApi {

    override suspend fun authenticate(credentials: Credentials) = runAsyncOnIo {
        Fuel.post(LOGIN_ENDPOINT)
            .jsonBody(JSON.stringify(Credentials.serializer(), credentials))
            .awaitStringResponse(scope = IO)
            .let {
                UserResponse(
                    user = JSON.parse(User.serializer(), it.third.get()),
                    token = it.second.headers[AUTHORIZATION]?.get(0) ?: ""
                )
            }
    }

}
