package br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.dao

import androidx.room.*
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.entity.MovieEntity

/**
 * @author Wellington Costa on 19/12/2018.
 **/
@Dao interface MovieDao {

    @Insert fun insert(entity: MovieEntity): Long

    @Update fun update(entity: MovieEntity)

    @Delete fun delete(id: Long)

    @Query("select * from tb_movie")
    fun findAll(): List<MovieEntity>

    @Query("select * from tb_movie where id = :id")
    fun findById(id: Long): MovieEntity?

    @Query("select * from tb_movie where name like :name collate nocase")
    fun findByTitle(name: String): List<MovieEntity>

}