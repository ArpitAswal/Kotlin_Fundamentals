package com.example.myapplication

class Hello{

    companion object{

        @JvmStatic
        fun main(args: Array<String>){
            println("Hello World!")
            printMessage()
        }

        private fun printMessage(){
            println("This is my first Kotlin program")

        }
    }
}