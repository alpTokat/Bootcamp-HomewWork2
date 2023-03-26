package com.nexis.homework2.homework2

class Odev2 {

    fun question1(degree: Int): Double {
        return degree * 1.8 + 32
    }

    fun question2(shortEdge:Int, longEdge:Int): Int {
        return (shortEdge * 2) + (longEdge *2)
    }

    fun question3(number:Int):Int{
        var factorial = 1
        for(it in 2..number){
            factorial *= it
        }
        return factorial
    }

    fun question4(word:String): Int {
        var aCount = 0
        for(char in word){
            if(char == 'a' || char == 'A'){
                aCount += 1
            }
        }
        return aCount
    }

    fun question5(edgeCount:Int):Int{
        return (edgeCount-2) * 180
    }

    fun question6(workDay:Int):Int{
        //160 saatten fazlası mesai sayılacaktır. -> günde 8 saat çalışma -> normal çalışma - 10tl -> mesai çalışma - 20tl

        // 45 gün çalış
        // 45 * 8 -> 384
        // 386 - 160 -> 226
        // 160 *10 -> 1600
        // 226 * 20 -> 4520 // yani işlemler uymamaktadır. normalde 45 gün çalışmaya bir işçi 4800 lira maaş almalıydı.

        var salary = 0

        var workTime = workDay * 8


        while (workTime != 0){
            if(workTime > 240){
                salary += 160 * 10
                salary +=  80 * 20
                workTime -= 240
            }else{
                if(workTime <= 160){
                    salary += workTime * 10
                    workTime = 0
                }
                else{
                    salary += 160 * 10
                    workTime -=160
                    salary += workTime * 20
                    workTime = 0
                }
            }
        }
        return salary
    }


    fun question7(kota:Int): Int{
        var fee = 0
        if(kota > 50){
            fee += 100
            fee += (kota-50) * 4
        }else{
            fee += 100
        }
        return fee
    }
}