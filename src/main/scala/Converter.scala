import scala.annotation.tailrec

object Converter {
  def run(n: Int): String = {
    nToRomanNumber(n)
  }

  def nToRomanNumber(n: Int): String = {
    @tailrec
    def helper(number: Int, romanString: String = ""): String = {
      val convertedGroup = number match {
        case a if number >= 1000 => (1000, "M", a)
        case b if number >= 900 => (900, "CM", b)
        case c if number >= 500 => (500, "D", c)
        case d if number >= 400 => (400, "CD", d)
        case e if number >= 100 => (100, "C", e)
        case f if number >= 90 => (90, "XC", f)
        case g if number >= 50 => (50, "L", g)
        case h if number >= 40 => (40, "XL", h)
        case i if number >= 10 => (10, "X", i)
        case j if number >= 9 => (9, "IX", j)
        case k if number >= 5 => (5, "V", k)
        case l if number >= 4 => (4, "IV", l)
        case m if number >= 1 => (1, "I", m)
        case n if number == 0 => (0, "", n)
      }
      if (number == 0) romanString
      else helper(number - convertedGroup._1, romanString ++ convertedGroup._2 )
    }
    helper(n)
  }

//  def splitNumber(n:Int): Vector[Int] = {
//    val numbersSplit = n.toString.map(_.asDigit).reverse
//    //println(numbersSplit)
//    @tailrec
//    def splitHelper(numbers: Vector[Int], converted: Vector[Int] = Vector(), rep: Int = 1): Vector[Int] = {
//      if (numbers.isEmpty) converted
//      else splitHelper(numbers.tail, converted ++ Vector(numbers.head * rep), rep * 10)
//    }
//    splitHelper(numbersSplit.toVector)
//  }


}

