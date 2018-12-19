package br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.converter

import androidx.room.TypeConverter
import java.util.*

/**
 * @author Wellington Costa on 19/12/2018.
 **/
object DateTypeConverter {

    @JvmStatic @TypeConverter fun toDate(value: Long?): Date? {
        return if(value != null) {
            Date(value)
        } else null
    }

    @JvmStatic @TypeConverter fun toLong(value: Date?): Long? {
        return value?.time
    }

}