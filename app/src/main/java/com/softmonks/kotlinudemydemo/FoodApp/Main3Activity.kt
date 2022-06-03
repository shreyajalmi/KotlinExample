package com.softmonks.kotlinudemydemo.FoodApp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.softmonks.kotlinudemydemo.R
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.food_ticket.view.*

class Main3Activity : AppCompatActivity() {

    var listOfFoods = ArrayList<Food>()
    var adapter:FoodAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //Load food
        listOfFoods.add(Food("Coffee","Morning starts with coffee",R.drawable.coffee_pot))
        listOfFoods.add(Food("Espresso","Morning starts with espresso",R.drawable.espresso))
        listOfFoods.add(Food("French fries","Morning starts with french fries",R.drawable.french_fries))
        listOfFoods.add(Food("Honey","Morning starts with honey",R.drawable.honey))
        listOfFoods.add(Food("Strawberry","Morning starts with strawberry ice cream",R.drawable.strawberry_ice_cream))
        listOfFoods.add(Food("Sugar cubes","Morning starts with sugar cubes",R.drawable.sugar_cubes))
        adapter = FoodAdapter(this,listOfFoods)

        gvListFood.adapter = adapter
    }

    class FoodAdapter: BaseAdapter {

        var listOfFood = ArrayList<Food>()
        var context:Context? = null
        constructor(context:Context,lisOfFood:ArrayList<Food>):super(){
            this.context = context
            this.listOfFood = lisOfFood
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var food = listOfFood[p0]
            var inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var foodView = inflater.inflate(R.layout.food_ticket,null)
            foodView.ivFoodImage.setImageResource(food.image!!)
            foodView.tvName.text = food.name!!
            return foodView
        }

        override fun getItem(p0: Int): Any {
            return listOfFood[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getCount(): Int {
            return listOfFood.size
        }

    }
}
