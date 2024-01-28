package com.example.morekotlinfundamentals

class Quiz3 : Quiz2() {
//    // ugly way to print the questions,
//    // print all lines
//    fun printQuiz() {
//        println(question1.questionText)
//        println(question1.answer)
//        println(question1.difficulty)
//        println()
//        println(question2.questionText)
//        println(question2.answer)
//        println(question2.difficulty)
//        println()
//        println(question3.questionText)
//        println(question3.answer)
//        println(question3.difficulty)
//        println()
//    }

    // ordered way to print the values. Object by Object, questions, use "it" to
    // print the question properties. Scope functions
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

fun main() {
    // option 1, create the quiz object and use the declare method
    val quiz = Quiz3()
    quiz.printQuiz()

    // option 2, use the apply method so you can just apply the
    // method directly from the quiz with generics, without
    // declaring object quiz
    Quiz3().apply {
        printQuiz()
    }
}