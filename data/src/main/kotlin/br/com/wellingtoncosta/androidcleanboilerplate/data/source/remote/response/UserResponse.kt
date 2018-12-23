package br.com.wellingtoncosta.androidcleanboilerplate.data.source.remote.response

import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.User

/**
 * @author Wellington Costa on 23/12/18
 */
data class UserResponse(
    val user: User,
    val token: String
)