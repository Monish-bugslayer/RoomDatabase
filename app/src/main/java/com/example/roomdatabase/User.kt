package com.example.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val uid:Int,
    @ColumnInfo val firstName:String,
    @ColumnInfo val lastName:String
    )