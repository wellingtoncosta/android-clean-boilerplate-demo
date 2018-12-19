package br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author Wellington Costa on 19/12/2018.
 **/
@Entity(tableName = "tb_user") data class UserEntity(
        @PrimaryKey(autoGenerate = true)
        val id: Long?,
        val name: String,
        val email: String
)