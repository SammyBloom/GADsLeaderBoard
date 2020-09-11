package com.example.gadsleaderboard.models


data class Record(
    var hours: Int,
    var score: Int,
    var name: String,
    var country: String,
    var badgeUrl: String
)