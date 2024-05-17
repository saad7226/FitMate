package com.example.fitmate

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fitmate.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity2 : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        auth = Firebase.auth

        val loginBut:Button=findViewById(R.id.button3)
        val signUpBut:TextView=findViewById(R.id.signup)
        val mail:EditText=findViewById(R.id.email)
        val pas:EditText=findViewById(R.id.pass)


        signUpBut.setOnClickListener{
            startActivity(Intent(this,MainActivity3::class.java))
        }


        loginBut.setOnClickListener {
            val emailStr = mail.text.toString()
            val passwordStr = pas.text.toString()

            if (emailStr.isEmpty() || passwordStr.isEmpty()) {
                Toast.makeText(this, "Fill all the fields", Toast.LENGTH_SHORT).show()
            } else {
                auth.signInWithEmailAndPassword(emailStr, passwordStr)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            val user = auth.currentUser
                            updateUI(user)
                            startActivity(Intent(this, WorkOutsActivity::class.java))
                        } else {
                            Toast.makeText(this, "Authentication failed", Toast.LENGTH_SHORT).show()
                            updateUI(null)
                        }
                    }
            }





        }
    }

    private fun updateUI(currentUser: FirebaseUser?) {
        if (currentUser != null) {
            Toast.makeText(this, "Welcome ${currentUser.displayName}", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please Sign in", Toast.LENGTH_SHORT).show()
        }
    }

}