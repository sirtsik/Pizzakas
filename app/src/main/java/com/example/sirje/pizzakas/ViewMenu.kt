package com.example.sirje.pizzakas

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v4.content.ContextCompat.getDrawable
import android.support.v4.content.res.ResourcesCompat.getDrawable
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.example.sirje.pizzakas.R.drawable.pepperoni
import kotlinx.android.synthetic.main.activity_view_menu.*
import java.util.*


class ViewMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_menu)
        setSupportActionBar(toolbar)

        val listView = findViewById<ListView>(R.id.menu_listview)
        listView.adapter = PizzaOrderingAdapter(this)
    }

    private class PizzaOrderingAdapter(context: Context) : BaseAdapter() {
        private val mContext: Context

        var pepperoniPizza = PizzaObject("Pepperoni", "Pepperoni, Mozarella", R.drawable.pepperoni)
        var mafiosoPizza = PizzaObject("Mafioso", "Salami, Bacon, Onion", R.drawable.mafioso)
        var hawaiiPizza = PizzaObject("Hawaii", "Ham, Pineapple, Mozarella", R.drawable.hawaii)
        var fruttidimarePizza = PizzaObject("Frutti Di Mare", "Mixed seafood, mozarella", R.drawable.fruttidimare)
        var vegetarianaPizza = PizzaObject("Vegetariana", "Mushrooms, Bellpepper, Olives", R.drawable.vegetariana)
        val listOfPizzaObjects = listOf<PizzaObject>(pepperoniPizza, mafiosoPizza, hawaiiPizza, fruttidimarePizza, vegetarianaPizza)

        init {
            mContext = context
        }

        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.row_main, viewGroup, false)

            val pizzaNames = rowMain.findViewById<TextView>(R.id.name_of_pizza)
            pizzaNames.text = listOfPizzaObjects.get(position).getPizzaName().toString()

            val toppings = rowMain.findViewById<TextView>(R.id.toppings)
            toppings.text = "Toppings: " +  listOfPizzaObjects.get(position).getPizzaComponents().toString()

            val pizzaPics = rowMain.findViewById<ImageView>(R.id.image_of_pizza)
            pizzaPics.setImageResource(listOfPizzaObjects.get(position).getPizzaPicture())

            return rowMain
        }

        override fun getItem(position: Int): Any {
            return "TEST STRING"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return listOfPizzaObjects.size
        }

    }

}

