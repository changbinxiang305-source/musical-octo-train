package com.flashim.protocol

data class Message(
    val id: String = System.currentTimeMillis().toString(),
    val text: String,
    val sender: String = "",
    val timestamp: Long = System.currentTimeMillis()
)
