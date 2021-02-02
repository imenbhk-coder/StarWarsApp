package com.example.starwarsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PeopleActivity : AppCompatActivity() {
    var titles:ArrayList<String> = ArrayList();
    var dateproduction:ArrayList<String> = ArrayList();
    var directornames:ArrayList<String> = ArrayList();
    var producernames:ArrayList<String> = ArrayList();
    var descriptions:ArrayList<String> = ArrayList();

    lateinit var adapter: CustomAdapter
    lateinit var list_movies: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people)

        //Initializing RecyclerView
        list_movies=findViewById(R.id.list_movies)

        //creating an arraylist to store users using the data class user
        val films = ArrayList<Films>()

        //adding some dummy data to the list
        films.add(Films(1, "Ranchi Jharkhand", "lll","ldldld","kdkdkd","kdkdkdkdkdkd"))
        adapter= CustomAdapter(films)

        //Set up recyclerview with Vertical LayoutManager and the adapter

        list_movies.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        list_movies.adapter = adapter

        // Notify the adapter for data change.
        adapter.notifyDataSetChanged()
    }
}