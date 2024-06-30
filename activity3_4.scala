import scala.io.StdIn
object activity3_4 {

  def func1(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum


  }

  def main(args: Array[String]): Unit = {

    println("how many numbers do you want to give :")
    val num = StdIn.readLine().toInt


    val str_arr = new Array[Int](num)
    for (i <- 0 until num) {
      println("enter the numbers " + i + 1 + " ")
      str_arr(i) = StdIn.readLine().toInt

    }


    val list1: List[Int] = str_arr.toList
    val sum_even=func1(list1)
    println("sum of the even number is : " + sum_even)


  }

}
