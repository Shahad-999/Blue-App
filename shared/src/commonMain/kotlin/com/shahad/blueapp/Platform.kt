package com.shahad.blueapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform