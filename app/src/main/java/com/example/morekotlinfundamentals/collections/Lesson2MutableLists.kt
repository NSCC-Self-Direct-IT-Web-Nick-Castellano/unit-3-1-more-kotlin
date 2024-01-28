package com.example.morekotlinfundamentals.collections

// -------------------------------------------------------------------------------------
// A list is an ordered, resizable collection, typically implemented as a resizable array.
// When the array is filled to capacity and you try to insert a new element, the array is
// copied to a new bigger array.
// -------------------------------------------------------------------------------------
// MutableList extends the List interface by defining methods to modify a list, such as
// adding and removing elements.
// -------------------------------------------------------------------------------------


fun main() {

    // mutable lists ------------------------------

    println("Mutable lists:")

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    // add value to the end of the array
    solarSystem.add("Pluto")

    // add value on index position 3, shifting everything else
    solarSystem.add(3, "Theia")

    // change the value of position 3 (4th in the list)
    solarSystem[3] = "Future Moon"

    // print values
    println(solarSystem[3])
    println(solarSystem[9])

    // remove items of mutable list ------------------------------

    println()
    println("Removing items")
    // remove position at index 9
    solarSystem.removeAt(9)

    // remove position with value "Future Moon"
    solarSystem.remove("Future Moon")

    // check if pluto is in solar system array
    // returns true if value is in array, or false if not
    // this works with non mutable list too
    println(solarSystem.contains("Pluto"))

    // the same but with "in" statement, check if value "Future Moon"
    // is in the solar system array. Both should return false
    println("Future Moon" in solarSystem)


}