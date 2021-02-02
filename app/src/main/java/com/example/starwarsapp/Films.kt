package com.example.starwarsapp

import java.util.*

data class Films(
        val episode_id:Int=0,
        val title:String?=null,
        var opening_crawl: String? = null,
        var director: String? = null,
        var producer: String? = null,
        var release_date: String? = null,
)
