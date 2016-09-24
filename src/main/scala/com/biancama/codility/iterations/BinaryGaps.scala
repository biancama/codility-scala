package com.biancama.codility.iterations

import scala.annotation.tailrec

/**
  * Created by massimo on 24/09/16.
  */
object BinaryGaps {
  def solution(n: Int): Int = {
    // write your code in Scala 2.11
    @tailrec
    def solution(n: Int, currentGap:Int, app: Int) : Int = {
      if (n == 0) app
      else if (n % 2 == 0 && currentGap >= 0) solution(n/2, currentGap + 1, app)
      else if (n % 2 == 0 && currentGap < 0 ) solution(n/2, currentGap, app)
      else solution(n/2, 0, Math.max(currentGap, app))
    }
    solution(n, -1, 0)
  }
}
