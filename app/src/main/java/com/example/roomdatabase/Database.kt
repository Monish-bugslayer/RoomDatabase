package com.example.roomdatabase

import androidx.room.RoomDatabase


@androidx.room.Database(entities = [User::class], version = 1)
abstract class Database:RoomDatabase() {
    abstract fun userDao():UserDao
}