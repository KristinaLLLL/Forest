package com.example.forest

import android.provider.BaseColumns

class DBContract {
    object LumberT : BaseColumns {
        const val TABLE_NAME = "lumber"
        const val COLUMN_DATE = "date"
        const val COLUMN_height = "height"
        const val COLUMN_width = "width"
        const val COLUMN_length = "length"
        const val COLUMN_quantity = "quantity"
        const val COLUMN_found = "found"
        const val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + " (" +
                BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_DATE + " INTEGER, " +
                COLUMN_height + " INTEGER, " +
                COLUMN_width + " INTEGER, " +
                COLUMN_length + " REAL, " +
                COLUMN_quantity + " INTEGER, " +
                COLUMN_found + " TEXT" + ")"
    }
}