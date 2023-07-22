package com.example.mileagetracker

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : Activity()
{

	private lateinit var odometerEditText: EditText
	private lateinit var dateEditText: EditText
	private lateinit var volumeEditText: EditText
	private lateinit var priceEditText: EditText
	private lateinit var btnSave: Button

	private lateinit var databaseHelper: DatabaseHelper

	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		odometerEditText = findViewById(R.id.editTextOdometer)
		dateEditText = findViewById(R.id.editTextDate)
		volumeEditText = findViewById(R.id.editTextVolume)
		priceEditText = findViewById(R.id.editTextPrice)
		btnSave = findViewById(R.id.btnSave)

		databaseHelper = DatabaseHelper(this)

		btnSave.setOnClickListener {
			saveData()
		}
	}

	private fun saveData()
	{
		val odometer = odometerEditText.text.toString().toIntOrNull() ?: 0
		val date = dateEditText.text.toString().trim()
		val volume = volumeEditText.text.toString().toDoubleOrNull() ?: 0.0
		val price = priceEditText.text.toString().toDoubleOrNull() ?: 0.0
		val duration = Toast.LENGTH_SHORT
		var text = "Data failed to save"

		if(odometer > 0 && date.isNotEmpty() && volume > 0 && price > 0)
		{
			val rowId = databaseHelper.insertData(odometer, date, volume, price)
			if(rowId > -1)
				text = "Data saved successfully"
		}
		else
		{
			text = "Invalid entry... try again."
		}
		val toast = Toast.makeText(this, text, duration)
		toast.show()
	}
}
