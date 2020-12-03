package by.antonau.homework4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addContact(view: View) {
        val addContactIntent = Intent(this, addContactActivity :: class.java)
        startActivity(addContactIntent)
    }
}