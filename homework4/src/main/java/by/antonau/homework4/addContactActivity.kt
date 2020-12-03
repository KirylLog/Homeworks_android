package by.antonau.homework4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox


class addContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contact)

   //     var mCheckPhoneNumber = (CheckBox) findViewById (R.id.checkPhoneNumber);
    //    var mCheckEmail = (CheckBox) findViewById (R.id.checkEmail);

    }


    fun backToMainActivity(view: View) {
        val backToMainActivityIntent = Intent(this, MainActivity::class.java)
        startActivity(backToMainActivityIntent)
    }

}