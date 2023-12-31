package com.example.tokoikanhias.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "ikan_table")
data class Ikan (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val type: String,
    val address: String,
    val latitude: Double?,
    val longitude: Double?


) : Parcelable
