package com.example.todoapp.model

import android.os.Parcelable
import androidx.room.Entity
import java.text.DateFormat
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "task_table")
@Parcelize
data class Task(
    val name: String,
    val important: Boolean = false,
    val completed: Boolean = false,
    val created: Long = System.currentTimeMillis()
) : Parcelable {
    val createDateFormat: String
        get() = DateFormat.getDateTimeInstance().format(created);
}