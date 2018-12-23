package br.com.wellingtoncosta.androidcleanboilerplate.data.mapper

import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.entity.MovieEntity
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.Movie

/**
 * @author Wellington Costa on 23/12/18
 */

fun MovieEntity.toDomain() = Movie(
    this.id,
    this.name,
    this.description,
    this.director,
    this.releaseDate,
    this.favorite,
    this.ownerId
)

fun Movie.toEntity() = MovieEntity(
    this.id,
    this.name,
    this.description,
    this.director,
    this.releaseDate,
    this.favorite,
    this.ownerId
)
