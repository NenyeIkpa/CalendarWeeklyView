package com.example.calendarview

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDate

class CalenderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
    private val days: ArrayList<LocalDate>? = null
    var parentView: ConstraintLayout = itemView.findViewById(R.id.parentView)
    var dayOfMonth: TextView = itemView.findViewById(R.id.cellDayText)
    private val onItemListener: OnItemListener? = null
    override fun onClick(v: View) {
        onItemListener?.onItemClick(adapterPosition, days!![adapterPosition])
    }

}
