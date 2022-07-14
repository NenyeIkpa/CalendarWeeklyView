package com.example.calendarview

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDate

class CalenderViewHolder(itemView: View, private val onItemListener: OnItemListener, private val days: ArrayList<LocalDate>) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
    var parentView: ConstraintLayout = itemView.findViewById(R.id.parentView)
    var dayOfMonth: TextView = itemView.findViewById(R.id.cellDayText)
    override fun onClick(v: View) {
        onItemListener.onItemClick(adapterPosition, days[adapterPosition])
    }

}
