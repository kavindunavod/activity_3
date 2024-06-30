import scala.io.StdIn

object activity3_1 {

  def func1(str: String) : Unit = {
    val reversed=str.reverse
    println(reversed)

  }

  def main(args: Array[String]): Unit = {

    println("enter the string : ")
    val result=StdIn.readLine()
    func1(result)


  }

}
