package br.com.wellingtoncosta.androidcleanboilerplate.domain.model

import kotlinx.serialization.Serializable

/**
 * @author Wellington Costa on 17/12/2018.
 **/
@Serializable data class Credentials(val email: String, val password: String)