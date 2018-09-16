package com.example.leona.datetimepickers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import java.time.Month
import java.time.MonthDay
import java.time.Year

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDatePickerDialog(v:View)
    {
        val newFragment=DatePickerFragment()
        newFragment.show(supportFragmentManager,getString(R.string.date_picker))
    }

    fun showTimePickerDialog(v:View)
    {
        val newFragment=TimePickerFragment()
        newFragment.show(supportFragmentManager,getString(R.string.time_picker))
    }


    fun processDatePickerResult(year: Int,month: Int,day: Int)
    {
        val month_string=Integer.toString(month+1)
        val day_string=Integer.toString(day)
        val year_string=Integer.toString(year)

        val date_Message="$month_string/$day_string/$year_string"
        Toast.makeText(this,getString(R.string.date)+date_Message,Toast.LENGTH_SHORT).show()
    }

    fun processTimePickerResult(hourOfDay:Int,minute:Int)
    {
        val hourOfDay_string=Integer.toString(hourOfDay)

        val minute_string=Integer.toString(minute)

        val time_Mesage=hourOfDay_string+":"+minute_string

        Toast.makeText(this,getString(R.string.time)+time_Mesage,Toast.LENGTH_SHORT).show()
    }


}
