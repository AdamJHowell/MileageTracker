package com.example.mileagetracker

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION)
{
	companion object
	{
		private const val DATABASE_NAME = "mileage-tracker.db"
		private const val DATABASE_VERSION = 1
		private const val TABLE_NAME = "fill-up-records"
		private const val COLUMN_ODOMETER = "odometer"
		private const val COLUMN_DATE = "date"
		private const val COLUMN_VOLUME = "volume"
		private const val COLUMN_PRICE = "price"
	}

	override fun onCreate(db: SQLiteDatabase)
	{
		val createTableQuery =
			"CREATE TABLE $TABLE_NAME (_id INTEGER PRIMARY KEY AUTOINCREMENT, $COLUMN_ODOMETER INTEGER, $COLUMN_DATE TEXT, $COLUMN_VOLUME REAL, $COLUMN_PRICE REAL);"

		db.execSQL(createTableQuery)
	}

	override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int)
	{
		db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
		onCreate(db)
	}

	fun insertData(odometer: Int, date: String, volume: Double, price: Double): Long
	{
		val values = ContentValues()
		values.put(COLUMN_ODOMETER, odometer)
		values.put(COLUMN_DATE, date)
		values.put(COLUMN_VOLUME, volume)
		values.put(COLUMN_PRICE, price)

		val db = writableDatabase
		return db.insert(TABLE_NAME, null, values)
	}
}
