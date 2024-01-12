package com.horehoreteam.sewain_hackathon2023.model

data class RequestPacket(
    val time:String,
    val requestItems:List<ItemRequestPacket>
)

data class ItemRequestPacket(
    val imageUrl:String,
    val requestId:String,
    val userName:String,
    val packetName:String,
    val contact:String,
    val submittedCaterings:List<String>,
    val submittedWardrobes:List<String>,
    val submittedDecoration:List<String>
)


