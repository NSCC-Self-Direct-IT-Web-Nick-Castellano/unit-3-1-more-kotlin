package com.example.morekotlinfundamentals.higherorderfunctions

fun main() {

    // filter the values to only return the cookies that have true as soft
    // baked field, meaning the cookie is soft baked
    val softBakedMenu = cookies.filter {
        it.softBaked
    }

    // the title for soft baked cookies
    println("Soft cookies:")

    // display each of the cookies that are soft baked
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }


}
