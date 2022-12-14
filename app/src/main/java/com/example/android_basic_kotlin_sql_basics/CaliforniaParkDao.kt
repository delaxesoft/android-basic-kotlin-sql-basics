package com.example.android_basic_kotlin_sql_basics

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CaliforniaParkDao {
    @Insert
    suspend fun insertAll(parks: List<CaliforniaPark>)
    @Query("SELECT * FROM park")
    suspend fun getAll(): List<CaliforniaPark>
}
