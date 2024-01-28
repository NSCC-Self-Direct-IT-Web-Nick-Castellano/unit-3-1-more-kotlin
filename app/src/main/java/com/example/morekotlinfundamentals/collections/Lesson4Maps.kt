package com.example.morekotlinfundamentals.collections

// -------------------------------------------------------------------------------------
// A Map is a collection consisting of keys and values. It's called a map because unique
// keys are mapped to other values. A key and its accompanying value are often called a
// key-value pair.
// -------------------------------------------------------------------------------------


fun main() {
    // maps ------------------------------------------------------
    // create the map, the value is how many moons each planet (key) has
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    // print the map size (amount of key-value pairs)
    println(solarSystem.size)

    // add a new value (it doesn't exist in the map yet, so it will create
    // another pair
    solarSystem["Pluto"] = 5

    // print new size
    println(solarSystem.size)

    // print the value of pluto
    println(solarSystem["Pluto"])

    // if you get the value of a non existing key in the map, you get null
    println(solarSystem.get("Theia"))

    // remove values -------------------------------------------

    // remove pluto from map
    solarSystem.remove("Pluto")

    // get the new size
    println(solarSystem.size)

    // change the value of Jupiter
    solarSystem["Jupiter"] = 78

    // get the new value of Jupiter
    println(solarSystem["Jupiter"])


}