import scala.io.StdIn
object activity3_2 {

  def func1(Strings: List[String]): Unit = {

    val filter = Strings.filter(_.length > 5)
    println("string which greater than length 5 are : " + filter)

  }

  def main(args: Array[String]): Unit = {

    println("how many string do you want to give :")
    val num=StdIn.readLine().toInt


    val str_arr=new Array[String](num)
    for(i<-0 until num)
      {
          println("enter the string " + i+1 + " ")
          str_arr(i)=StdIn.readLine().toString

      }
    val list1: List[String]= str_arr.toList
    func1(list1)

  }

}
