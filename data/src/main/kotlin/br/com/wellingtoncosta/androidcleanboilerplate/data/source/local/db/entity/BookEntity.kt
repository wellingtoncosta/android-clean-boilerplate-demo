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
        tableName = "tb_book",
        foreignKeys = [
                ForeignKey(entity = UserEntity::class,
                        parentColumns = ["id"],
                        childColumns = ["ownerId"])
        ],
        indices = [
                Index(value = ["ownerId"])
        ]
)
data class BookEntity(
        @PrimaryKey(autoGenerate = true)
        val id: Long?,
        val title: String,
        val author: String,
        val releaseDate: Date,
        val favorite: Boolean,
        val ownerId: Long
)