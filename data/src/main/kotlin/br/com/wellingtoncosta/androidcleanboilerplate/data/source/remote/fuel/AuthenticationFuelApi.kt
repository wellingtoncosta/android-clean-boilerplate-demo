package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.fuel

import awaitStringResult
import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runAsyncOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.AuthenticationApi
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Credentials
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.User
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.result.map
import com.github.kittinunf.result.mapError
import kotlinx.serialization.json.JSON

/**
 * @author Wellington Costa on 20/12/2018.
 **/
class AuthenticationFuelApi : AuthenticationApi {

    override suspend fun authenticate(credentials: Credentials) = runAsyncOnIo {
        Fuel.post("/api/movies")
                .jsonBody(JSON.stringify(Credentials.serializer(), credentials))
                .awaitStringResult()
                .map { data -> JSON.parse(User.serializer(), data) }
                .mapError { error -> error.exception }
    }

}