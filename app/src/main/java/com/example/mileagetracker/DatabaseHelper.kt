package com.example.mileagetracker

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION)
{

	companion object
	{
		private const val DATABASE_NAME = "my_database.db"
		private const val DATABASE_VERSION = 1
		private const val TABLE_NAME = "my_table"
		private const val COLUMN_NAME = "name"
		private const val COLUMN_EMAIL = "email"
		private const val COLUMN_AGE = "age"
		private const val COLUMN_SCORE = "score"
	}

	override fun onCreate(db: SQLiteDatabase)
	{
		val createTableQuery = "CREATE TABLE $TABLE_NAME (" + "_id INTEGER PRIMARY KEY AUTOINCREMENT, " + "$COLUMN_NAME TEXT, " + "$COLUMN_EMAIL TEXT, " + "$COLUMN_AGE INTEGER, " + "$COLUMN_SCORE REAL" + ");"

		db.execSQL(createTableQuery)
	}

	override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int)
	{
		db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
		onCreate(db)
	}

	fun insertData(name: String, email: String, age: Int, score: Double): Long
	{
		val values = ContentValues()
		values.put(COLUMN_NAME, name)
		values.put(COLUMN_EMAIL, email)
		values.put(COLUMN_AGE, age)
		values.put(COLUMN_SCORE, score)

		val db = writableDatabase
		return db.insert(TABLE_NAME, null, values)
	}
}
