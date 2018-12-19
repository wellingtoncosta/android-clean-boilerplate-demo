package br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.dao

import androidx.room.*
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.entity.BookEntity

/**
 * @author Wellington Costa on 19/12/2018.
 **/
@Dao interface BookDao {

    @Insert fun insert(entity: BookEntity)

    @Update fun update(entity: BookEntity)

    @Delete fun delete(id: Long)

    @Query("select * from tb_book")
    fun findAll(): List<BookEntity>

}