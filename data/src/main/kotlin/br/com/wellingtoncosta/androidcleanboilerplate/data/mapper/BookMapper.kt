package br.com.wellingtoncosta.androidcleanboilerplate.data.mapper

import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.entity.BookEntity
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Book

/**
 * @author Wellington Costa on 23/12/18
 */

fun Book.toEntity() = BookEntity(
    this.id,
    this.title,
    this.author,
    this.releaseDate,
    this.favorite,
    this.ownerId
)

fun BookEntity.toDomain() = Book(
    this.id,
    this.title,
    this.author,
    this.releaseDate,
    this.favorite,
    this.ownerId
)