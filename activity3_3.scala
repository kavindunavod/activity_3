import scala.io.StdIn
import scala.math.BigDecimal
object activity3_3 {

  def average1(num1: Int, num2: Int): Double = {
    val avg= (num1+num2)/2.0
    val roundedAvg = BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
     return roundedAvg
  }

  def main(args: Array[String]): Unit = {
    println("enter the first number: ")
    val result1=StdIn.readLine().toInt

    println("enter the first number: ")
    val result2=StdIn.readLine().toInt

    val avg= average1(result1, result2)
    println("average of that two number is : " + avg)



  }

}
