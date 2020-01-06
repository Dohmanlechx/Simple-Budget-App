package com.dohman.simplebudgetapp.ui.items

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import com.dohman.simplebudgetapp.R
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem

class AnnualSavingItem(
    private val moneySaved: Int
) : AbstractItem<AnnualSavingItem.ViewHolder>() {

    override val type = R.id.fastadapter_annual_saving_item_id
    override val layoutRes = R.layout.view_annual_saving
    override fun getViewHolder(v: View) = ViewHolder(v)

    class ViewHolder(view: View) : FastAdapter.ViewHolder<AnnualSavingItem>(view) {
        private val context = view.context
        private val amount = view.findViewById<AppCompatTextView>(R.id.txt_year_annual_saving_amount)

        override fun bindView(item: AnnualSavingItem, payloads: MutableList<Any>) {
            amount.text = String.format(context.getString(R.string.this_year_annual_saving_amount), item.moneySaved)
        }

        override fun unbindView(item: AnnualSavingItem) {
            amount.text = null
        }
    }
}