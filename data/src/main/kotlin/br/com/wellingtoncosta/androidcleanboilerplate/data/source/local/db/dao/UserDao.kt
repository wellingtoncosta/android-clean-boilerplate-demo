package br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.wellingtoncosta.androidcleanboilerplate.data.source.local.db.entity.UserEntity

/**
 * @author Wellington Costa on 19/12/2018.
 **/
@Dao interface UserDao {

    @Insert fun insert(entity: UserEntity)

    @Update fun update(entity: UserEntity)

    @Query("select * from tb_user where email = :email")
    fun findByEmail(email: String): UserEntity?

}