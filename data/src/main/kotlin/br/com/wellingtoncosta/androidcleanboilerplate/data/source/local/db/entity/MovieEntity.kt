package br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import java.util.*

/**
 * @author Wellington Costa on 19/12/2018.
 **/
@Entity(
        tableName = "tb_movie",
        foreignKeys = [
                ForeignKey(entity = UserEntity::class,
                        parentColumns = ["id"],
                        childColumns = ["ownerId"])
        ],
        indices = [
                Index(value = ["ownerId"])
        ]
)
class MovieEntity(
        @PrimaryKey(autoGenerate = true)
        val id: Long?,
        val name: String,
        val description: String = "",
        val director: String,
        val releaseDate: Date,
        val favorite: Boolean,
        val ownerId: Long
)