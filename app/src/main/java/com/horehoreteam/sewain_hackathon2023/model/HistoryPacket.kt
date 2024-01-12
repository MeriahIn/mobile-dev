package com.horehoreteam.sewain_hackathon2023.model

data class HistoryPacket(
    val time: String,
    val requestItems: List<ItemHistoryPacket>
)

data class ItemHistoryPacket(
    val imageUrl: String,
    val requestId: String,
    val userName: String,
    val packetName: String,
    val contact: String,
    val submittedCaterings: List<SubmittedItem>,
    val submittedWardrobes: List<SubmittedItem>,
    val submittedDecoration: List<SubmittedItem>
)
data class SubmittedItem(
    val serviceName: String,
    val isAccepted: Boolean
)