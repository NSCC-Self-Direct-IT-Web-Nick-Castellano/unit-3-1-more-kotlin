package com.example.morekotlinfundamentals.collections

// -------------------------------------------------------------------------------------
// A list is an ordered, resizable collection, typically implemented as a resizable array.
// When the array is filled to capacity and you try to insert a new element, the array is
// copied to a new bigger array.
// -------------------------------------------------------------------------------------
// List is an interface that defines properties and methods related to a read-only ordered
// collection of items.
// -------------------------------------------------------------------------------------


fun main() {

    // non-mutable lists ------------------------------

    println("Non-mutable lists:")
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    // print the size of list
    println(solarSystem.size)

    // print the value on position 2 (3rd in the list)
    println(solarSystem[2])

    // you can also do it this way
    println(solarSystem.get(3))

    // get the index from a value on the array
    // keep into account that it prints the first element on the list that
    // matches the parameter
    println(solarSystem.indexOf("Earth"))

    // because pluto is not in the array, it will return -1 (this is the default return
    // value if index of value is not found)
    println(solarSystem.indexOf("Pluto"))

    for (planet in solarSystem) {
        println(planet)
    }


}