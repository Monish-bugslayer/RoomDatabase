package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val db= Room.databaseBuilder(
            applicationContext,
            Database::class.java,
            "UserDetails").build()
        val userDao=db.userDao()

    }
}