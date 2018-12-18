package br.com.wellingtoncosta.androidcleanboilerplate.domain.model

import kotlinx.serialization.Serializable

/**
 * @author Wellington Costa on 17/12/2018.
 **/
@Serializable data class User(val id: Long?, val name: String, val email: String, val password: String)