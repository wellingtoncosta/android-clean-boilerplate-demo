package br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.converter.DateTypeConverter
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.dao.BookDao
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.dao.MovieDao
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.dao.UserDao
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.entity.BookEntity
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.entity.MovieEntity
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.entity.UserEntity

/**
 * @author Wellington Costa on 19/12/2018.
 **/
@Database(
        entities = [
            BookEntity::class,
            MovieEntity::class,
            UserEntity::class
        ],
        version = AppDatabase.VERSION,
        exportSchema = false
)
@TypeConverters(value = [DateTypeConverter::class])
abstract class AppDatabase : RoomDatabase() {

    abstract fun bookDao(): BookDao

    abstract fun movieDao(): MovieDao

    abstract fun userDao(): UserDao

    companion object {
        const val VERSION = 1
    }

}