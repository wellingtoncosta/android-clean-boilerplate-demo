package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.fuel

import br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.UserApi
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Credentials
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.User

/**
 * @author Wellington Costa on 18/12/2018.
 **/
class UserFuelApi : UserApi {

    override suspend fun save(user: User): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun authenticate(credentials: Credentials): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}