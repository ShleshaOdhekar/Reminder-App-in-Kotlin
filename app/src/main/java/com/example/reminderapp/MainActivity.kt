package com.example.reminderapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_show.setOnClickListener {
            val now = Calendar.getInstance()
            val year = now.get(Calendar.YEAR)
            val month = now.get(Calendar.MONTH)
            val day = now.get(Calendar.DAY_OF_MONTH)
            val datePicker= DatePickerDialog( this, DatePickerDialog.OnDateSetListener {view: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
                dateText.setText( "" + year + "/" +"" + month + "/" +"" + dayOfMonth )
            },
               year, month, day)
            datePicker.show()
        }

    }
}
