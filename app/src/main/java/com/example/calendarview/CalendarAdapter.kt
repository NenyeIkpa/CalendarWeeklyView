package com.example.calendarview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDate

class CalendarAdapter(private val days: ArrayList<LocalDate?>, private val onItemListener: OnItemListener)
    : RecyclerView.Adapter<CalenderViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalenderViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.calendar_cell, parent, false)
        val layoutParams = ViewGroup.LayoutParams(view.layoutParams)

        if (days.size > 15) {
            layoutParams.height = (parent.height * 1.666).toInt()
        }else {
            layoutParams.height = parent.height
        }
        return CalenderViewHolder(view)
    }

    override fun onBindViewHolder(holder: CalenderViewHolder, position: Int) {
        val currentDate = days[position]
        holder.dayOfMonth.text = currentDate?.dayOfMonth.toString()
        if (currentDate == selectedDate) {
            holder.parentView.setBackgroundResource(R.color.green)
        }
    }

    override fun getItemCount(): Int {
       return days.size
    }
}

interface OnItemListener{
    fun onItemClick(position: Int, date: LocalDate)
}
