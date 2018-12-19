package br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.dao

import androidx.room.*
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.entity.MovieEntity

/**
 * @author Wellington Costa on 19/12/2018.
 **/
@Dao interface MovieDao {

    @Insert fun insert(entity: MovieEntity)

    @Update fun update(entity: MovieEntity)

    @Delete fun delete(id: Long)

    @Query("select * from tb_movie")
    fun findAll(): List<MovieEntity>

}