package com.softmonks.kotlinudemydemo.FindAge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softmonks.kotlinudemydemo.R
import kotlinx.android.synthetic.main.activity_find_age.*
import java.util.*

class FindAge : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_age)

        buttonFindAge.text = "Find age"

        buttonFindAge.setOnClickListener {
            //fire when button is clicked
            val yearOfBirth:Int = textYearOfBirth.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val myAge = currentYear - yearOfBirth
            tvShowAge.text = myAge.toString()
        }
    }
}
