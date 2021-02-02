package com.example.starwarsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val filmsList: ArrayList<Films>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_movies, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(filmsList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return filmsList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(films: Films) {
            val item_title = itemView.findViewById(R.id.item_title) as TextView
            val item_date_production = itemView.findViewById(R.id.item_date_production) as TextView
            val item_director_name = itemView.findViewById(R.id.item_director_name) as TextView
            val item_producer_name = itemView.findViewById(R.id.item_producer_name) as TextView
            val item_description = itemView.findViewById(R.id.item_description) as TextView
            item_title.text = films.title
            item_date_production.text = films.release_date
            item_director_name.text = films.release_date
            item_producer_name.text = films.producer
            item_description.text = films.opening_crawl
        }
    }
}