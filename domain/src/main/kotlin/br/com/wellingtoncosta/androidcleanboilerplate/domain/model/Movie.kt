package br.com.wellingtoncosta.androidcleanboilerplate.domain.model

import java.util.*

/**
 * @author Wellington Costa on 17/12/2018.
 **/
data class Movie(
        val id: Long?,
        val name: String,
        val description: String = "",
        val director: String,
        val releaseDate: Date,
        val favorite: Boolean
)