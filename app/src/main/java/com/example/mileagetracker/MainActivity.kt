package com.example.mileagetracker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var scoreEditText: EditText
    private lateinit var btnSave: Button

    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.editTextOdometer)
        emailEditText = findViewById(R.id.editTextDate)
        ageEditText = findViewById(R.id.editTextVolume)
        scoreEditText = findViewById(R.id.editTextPrice)
        btnSave = findViewById(R.id.btnSave)

        databaseHelper = DatabaseHelper(this)

        btnSave.setOnClickListener {
            saveData()
        }
    }

    private fun saveData() {
        val name = nameEditText.text.toString().trim()
        val email = emailEditText.text.toString().trim()
        val age = ageEditText.text.toString().toIntOrNull() ?: 0
        val score = scoreEditText.text.toString().toDoubleOrNull() ?: 0.0
        val duration = Toast.LENGTH_SHORT
        var text = "Data failed to save"

        if (name.isNotEmpty() && email.isNotEmpty()) {
            val rowId = databaseHelper.insertData(name, email, age, score)
            if (rowId > -1)
                text = "Data saved successfully"
            val toast = Toast.makeText(this, text, duration) // in Activity
            toast.show()
        } else {
            // Show an error message indicating that name and email are required
        }
    }
}
