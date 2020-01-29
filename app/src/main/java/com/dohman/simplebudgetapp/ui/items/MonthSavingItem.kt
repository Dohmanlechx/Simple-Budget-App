package com.dohman.simplebudgetapp.ui.items

import android.view.View
import android.widget.TextView
import com.dohman.simplebudgetapp.R
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem
import org.threeten.bp.LocalDate

class MonthSavingItem(
    private val date: LocalDate
) : AbstractItem<MonthSavingItem.ViewHolder>() {

    override val type = R.id.fastadapter_month_saving_item_id
    override val layoutRes = R.layout.two_line_item
    override fun getViewHolder(v: View) = ViewHolder(v)

    class ViewHolder(view: View) : FastAdapter.ViewHolder<MonthSavingItem>(view) {
        private val context = view.context
        private val monthYearTxt = view.findViewById<TextView>(R.id.name)
        private val amountMoneyTxt = view.findViewById<TextView>(R.id.description)

        override fun bindView(item: MonthSavingItem, payloads: MutableList<Any>) {
//            monthYearTxt.text = item.month
//            amountMoneyTxt.text = "1337 kr"
        }

        override fun unbindView(item: MonthSavingItem) {
            monthYearTxt.text = null
            amountMoneyTxt.text = null
        }
    }
}