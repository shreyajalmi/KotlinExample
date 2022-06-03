package com.softmonks.kotlinudemydemo.ZooApp

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.softmonks.kotlinudemydemo.R
import kotlinx.android.synthetic.main.activity_animal_info.view.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.animal_ticket.view.*
import kotlinx.android.synthetic.main.animal_ticket.view.ivAnimalImage
import kotlinx.android.synthetic.main.animal_ticket.view.tvDescription
import kotlinx.android.synthetic.main.animal_ticket.view.tvName

class Main2Activity : AppCompatActivity() {

    var listOfAnimals = ArrayList<Animal>()
    var adapter:AnimalsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //load animals
        listOfAnimals.add(Animal("Baboon","Baboon is on tree",R.drawable.baboon,false))
        listOfAnimals.add(Animal("Panda","Panda is on tree",R.drawable.panda,true))
        listOfAnimals.add(Animal("Bull Dog","Bull dog is in house",R.drawable.bull_dog,false))
        listOfAnimals.add(Animal("Baboon","Baboon is on tree",R.drawable.baboon,false))
        listOfAnimals.add(Animal("Panda","Panda is on tree",R.drawable.panda,true))
        listOfAnimals.add(Animal("Bull Dog","Bull dog is in house",R.drawable.bull_dog,false))

        adapter = AnimalsAdapter(this, listOfAnimals)
        tvListAnimal.adapter = adapter

    }

    fun delete(index:Int){
        listOfAnimals.removeAt(index)
        adapter!!.notifyDataSetChanged()
    }

    fun add(index: Int){
        listOfAnimals.add(listOfAnimals[index])
        adapter!!.notifyDataSetChanged()
    }

    inner class AnimalsAdapter:BaseAdapter{

        var listOfAnimals = ArrayList<Animal>()
        var context: Context? = null

        constructor(context:Context,listOfAnimals: ArrayList<Animal>):super(){
            this.context = context
            this.listOfAnimals = listOfAnimals
        }

        override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
            val animal = listOfAnimals[position]

            var inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var myView:View
            if (animal.isKiller){
                myView = inflater.inflate(R.layout.animal_killer_ticket, null)
            }
            else {
                myView = inflater.inflate(R.layout.animal_ticket, null)
            }

            myView.tvName.text = animal.name!!
            myView.tvDescription.text = animal.description!!
            myView.ivAnimalImage.setImageResource(animal.image!!)
            myView.LinearRow.setOnClickListener {
                val intent = Intent(context,AnimalInfo::class.java)
                intent.putExtra("name",animal.name!!)
                intent.putExtra("description",animal.description!!)
                intent.putExtra("image",animal.image!!)
                context!!.startActivity(intent)
            }

            myView.LinearRow.setOnLongClickListener{
                //delete(position)
                add(position)
                return@setOnLongClickListener true
            }

            return myView
        }

        override fun getItem(position: Int): Any {
            return listOfAnimals.get(position)
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return listOfAnimals.size
        }

    }
}
