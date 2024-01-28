package com.example.morekotlinfundamentals.higherorderfunctions

fun main() {

    // use cookies to group cookies of wheter they are soft baked or not
    val groupedMenu = cookies.groupBy { it.softBaked }

    // divide all the cookies in soft baked and not soft baked cookies
    // just like if you made 2 filters, but prettier, it looks the same because
    // there are only two options. But imagine if you had a menu of many
    // different dessert types, or group by cookie color or flavour, it can become too
    // many filters. This can be called very easily without even have to initialize
    // different variable. If you have a store, you can easily apply different groupings
    // on demand, fast, clean and easy
    val softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    // print the values
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    println()

    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }

}