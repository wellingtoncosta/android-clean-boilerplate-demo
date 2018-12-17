package br.com.wellingtoncosta.androidcleanboilerplate.domain.model

import java.util.*

/**
 * @author Wellington Costa on 17/12/2018.
 **/
data class Book(
        val id: Long?,
        val title: String,
        val author: String,
        val releaseDate: Date
)