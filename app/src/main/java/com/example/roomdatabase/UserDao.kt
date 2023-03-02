package com.example.roomdatabase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll():List<User>
    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds:IntArray):List<User>
    @Query("SELECT * FROM first_name LIKE :first AND + last_name :last LIMIT 1")
    fun findByName(firstName:String,lastName:String):User
    @Insert
    fun insertAll(vararg users:User)
    @Delete
    fun delete(user:User)
}