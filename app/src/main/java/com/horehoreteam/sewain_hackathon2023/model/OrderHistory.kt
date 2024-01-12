package com.horehoreteam.sewain_hackathon2023.model

data class OrderHistory(
    val orderId:String,
    val imgUrl:String,
    val userName:String,
    val serviceName:String,
    val price:String,
    val status:String
)