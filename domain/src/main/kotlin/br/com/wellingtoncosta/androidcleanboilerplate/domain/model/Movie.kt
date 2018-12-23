package br.com.wellingtoncosta.androidcleanboilerplate.domain.model

import kotlinx.serialization.Serializable
import java.util.*

/**
 * @author Wellington Costa on 17/12/2018.
 **/
@Serializable data class Movie(
        val id: Long?,
        val name: String,
        val description: String = "",
        val director: String,
        val releaseDate: Date,
        val favorite: Boolean,
        val ownerId: Long
)