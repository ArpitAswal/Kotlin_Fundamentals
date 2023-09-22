package com.example.myapplication

import android.annotation.SuppressLint

class Conditional{

    companion object{

        @SuppressLint("SuspiciousIndentation")
        @JvmStatic
        fun main(args: Array<String>){
            val num =50
        // 1st way  if else
            if(num>100){
                println("No is Greater")
            }
            else{
                println("No is Smaller")
            }
        // 2nd way if else
           var msg = ""
           msg = if(num>100) "No is Greater" else "No is Smaller"
            println(msg)

        // if else if ladder
         if( num > 100){
             println("num is greater than 100")
         }
         else if( num == 50){
             println("num is equal to 50")
         }
         else{
             println("num is smaller than 50")
         }

        // when statement in replace of switch case
            when(num){
                50->{
                  println("num is 50")
                }
                100->{
                    println("num is 100")
                }
            }
          // when statement with range
           when(num){
               1->println("num is less than 50")
               in 40..50 -> println("num is in range")
               else -> println("num is greater than 50")
           }

          // For loop

          for( i in 41..50)
              print("i:$i ")
           println()
          for( i in 50 downTo 41)
              print("i:$i ")
            println()
          for(i in 10..50 step 10)
              print("i:$i ")
            println()
         //For each loop
         var arr = ArrayList<Int>()
            arr.add(1)
            arr.add(2)
            arr.add(3)
            arr.add(4)
            arr.add(5)

            for(i in arr)
                print("i:$i ")
             println()

          // while loop
          var value =10
          while(value<100){
              print("num:$value ")
              value+=10
          }
           println()

          // do-while loop
           do{
               print("num:$value ")
               value-=10
           }while(value>50)

           //print indexes and element at same time
           val fruit = arrayOf("Apple","Mango","Grapes")
            for((index,element) in fruit.withIndex())
                println("fruit at $index is $element")

            // repeat loop
            repeat(2){
                println("repeat loop")
            }
        }
    }
}