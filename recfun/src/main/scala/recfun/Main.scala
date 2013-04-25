package recfun
import common._

object Main {
  def main(args: Array[String]) {
    //    println("Pascal's Triangle")
    //    for (row <- 0 to 10) {
    //      for (col <- 0 to row)
    //        print(pascal(col, row) + " ")
    //      println()
    //    }

    print("\n" +
      countChange(1, List(2)))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def b(chars: List[Char], o: Int, c: Int): Boolean = {
      if (c > o) return false
      if (!chars.isEmpty) {
        if (chars.head == '(') b(chars.tail, o + 1, c) else if (chars.head == ')') b(chars.tail, o, c + 1) else b(chars.tail, o, c)
      } else return true
    }
    b(chars, 0, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    val coinsS = coins.sortWith((x, y) => x > y)
    print(coinsS)

    def cc(m: Int, c: List[Int]): Int = {
      if (m < 0) return 0
      if (m == 0) return 1
      if (c.isEmpty) 0 else { // !c.isEmty && m>0
        //println("buscando cambio de " + m + " con " + c.head)
        if (m - c.head >= 0) { cc(m - c.head, c) + cc(m, c.tail) } else cc(m, c.tail)
      }

    }

    cc(money, coinsS)
  }
}
