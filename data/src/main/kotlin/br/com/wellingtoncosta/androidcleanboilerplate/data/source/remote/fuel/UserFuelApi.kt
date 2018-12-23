package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.fuel

import awaitStringResult
import br.com.wellingtoncosta.androidcleanboilerplate.data.extension.runAsyncOnIo
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.UserApi
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.User
import com.github.kittinunf.fuel.Fuel
import kotlinx.serialization.json.JSON

/**
 * @author Wellington Costa on 18/12/2018.
 **/
class UserFuelApi : UserApi {

    override suspend fun save(user: User) = runAsyncOnIo {
        Fuel.post("/api/movies")
            .jsonBody(JSON.stringify(User.serializer(), user))
            .awaitStringResult().get()
            .let { JSON.parse(User.serializer(), it) }
    }

}