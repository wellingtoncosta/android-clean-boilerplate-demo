package br.com.wellingtoncosta.androidcleanboilerplate.data.mapper

import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.entity.UserEntity
import br.com.wellingtoncosta.androidcleanboilerplate.domain.model.User

/**
 * @author Wellington Costa on 20/12/2018.
 **/

fun User.toEntity() = UserEntity(this.id, this.name, this.email)