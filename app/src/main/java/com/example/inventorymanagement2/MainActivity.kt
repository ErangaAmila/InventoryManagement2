package com.example.inventorymanagement2

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnSignUp.setOnClickListener {
            // Show a dialog with two options: Donator Sign Up and Volunteer Sign Up
            val dialog = Dialog(this)

            // Set the content view of the dialog to our custom layout
            dialog.setContentView(R.layout.dialog_signup)
            dialog.show()

            // Find the buttons in the dialog layout and set their click listeners
            val btnDonatorSignUp = dialog.findViewById<Button>(R.id.btnDonatorSignUp)
            val btnVolunteerSignUp = dialog.findViewById<Button>(R.id.btnVolunteerSignUp)

            btnDonatorSignUp.setOnClickListener {
                // navigate to the Donator Sign Up activity
                val intent = Intent(this, DonatorSignUpActivity::class.java)
                startActivity(intent)
                // Close the dialog
                dialog.dismiss()
            }

            btnVolunteerSignUp.setOnClickListener {
                // navigate to the Volunteer Sign Up activity
                val intent = Intent(this, VolunteerSignUpActivity::class.java)
                startActivity(intent)
                // Close the dialog
                dialog.dismiss()
            }
        }

        btnLogin.setOnClickListener {
            // navigate to the login activity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}