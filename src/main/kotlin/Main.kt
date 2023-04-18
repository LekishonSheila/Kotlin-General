fun main() {
    var initial = 1
    var final = 100
    while (initial < final){
        if (printPrimeNumber(initial))
            print(initial.toString() + " ")
        ++initial
    }
    var car= Car("Subaru","Legacy","White",30)
    car.carry(50)

    car.identity()

    val parkingFees = car.calculateParkingFees(4)
    println("Parking fees: $parkingFees")

    var bus = Bus("Nissan", "typec456","red",80)
    bus.maxTripFare(arrayOf(400.0,350.50,600.40,500.0,750.0))
    println(bus.maxTripFare(arrayOf(400.0,350.50,600.40,500.0,750.0)))

    println(bus.calculateParkingFees(2))

}
//Write a program in kotlin to print numbers between 1 and 100
fun printPrimeNumber(num: Int): Boolean {
    var flag = true
    for (i in 2..num / 2) {
        if (num % i == 0) {
            flag = false
            break
        }
    }
    return  flag
}

//inheritance
open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people: Int){
        if(people <= capacity) {
            println("Carrying $people passengers ")

        } else{
            var overCapacity=people-capacity
            println("over capacity by $overCapacity people")
        }
    }
    fun identity() {
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours: Int): Int {
        return hours * 20
    }

}
class Bus(make:String, model:String, color:String, capacity:Int):Car(make, model, color, capacity) {
    fun maxTripFare(fare: Array<Double>): Double {
        return fare.max()
    }

    override fun calculateParkingFees(hours: Int): Int {
        var parkingFees = hours * capacity
        return parkingFees
    }
}



