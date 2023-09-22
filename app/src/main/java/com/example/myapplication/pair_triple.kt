package com.example.myapplication

 class Function{

     companion object{

         @JvmStatic
         fun main( args: Array<String>){

          // Pair method
             val(company,year) = pair()
             println("($company, $year)")
          // Constructor Pair(first:A,second:B)

          val var1= "Huawei"
          val var2= 3
          val variable =Pair(var1,var2)
          println("variable first value is ${variable.first}")
             println("variable second value is ${variable.second}")
           //OR
          val(first,second) = Pair("Hello", 7)
          println("$first $second")

          // to infix
          val(url:String, name:String) =getWeb()
          println("url:$url and name:$name")
          //toList()
          val list= variable.toList()
          println("list[0]:${list[0]}")
             println("list[1]:${list[1]}")

           //Triple method
             val(iland,trees,bool) = triple()
             println("($iland, $trees, $bool)")
             // Constructor Pair(first:A,second:B,third:C)

             val var4= "Huawei"
             val var5= 2003
             val var6= 'A'
             val variable2 = Triple(var4,var5,var6)
             println("variable first value is ${variable2.first}")
             println("variable second value is ${variable2.second}")
             println("variable third value is ${variable2.third}")
             //OR
             val(one,two,three) = Triple("Huawei",2023,'A')
             println("$one, $two, $three")

             //toList()
             val list2= variable.toList()
             println("list[0]:${list2[0]}")
             println("list[1]:${list2[1]}")
             println("list[2]:${list2[2]}")

         }

         private fun triple(): Triple<String,Int,Boolean>{
             val iland= "Huawei"
             val trees= 300
             val bool = true
            return Triple(iland,trees,bool)
         }
         private fun getWeb() : Pair<String,String>{
             return "https://developer.huawei.com" to "Huawei"
         }
         private fun pair() : Pair<String,Int>{
             val company= "Huawei"
             val year= 2023
             return Pair(company,year)
         }
     }
 }
