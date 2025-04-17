package com.shahad.blue_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform