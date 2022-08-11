package com.example.forest

import android.content.Context
import android.database.sqlite.SQLiteDatabase

import android.database.sqlite.SQLiteOpenHelper


class DBSQLiteHelper(context: Context?) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(sqLiteDatabase: SQLiteDatabase) {
        sqLiteDatabase.execSQL(DBContract.LumberT.CREATE_TABLE)
    }

    override fun onUpgrade(sqLiteDatabase: SQLiteDatabase, i: Int, i1: Int) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + DBContract.LumberT.TABLE_NAME)
        onCreate(sqLiteDatabase)
    }

    companion object {
        private const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "sample_database"
    }
}