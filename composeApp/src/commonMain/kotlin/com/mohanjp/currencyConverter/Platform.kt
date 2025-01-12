package com.mohanjp.currencyConverter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform