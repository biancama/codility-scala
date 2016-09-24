package com.biancama.codility.iterations

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by massimo on 24/09/16.
  */
class BinaryGapsTest extends FlatSpec with Matchers{

  "number 9 (1001) " should " have 2 gaps" in {
    val t = BinaryGaps.solution(9)
    t shouldBe 2
  }

  "number 529 (1000010001) " should " have 4 gaps" in {
    val t = BinaryGaps.solution(529)
    t shouldBe 4
  }

  "number 20 (10100) " should " have 1 gaps" in {
    val t = BinaryGaps.solution(20)
    t shouldBe 1
  }

  "number 15 (1111) " should " have 0 gaps" in {
    val t = BinaryGaps.solution(15)
    t shouldBe 0
  }

  "number 51712 (110010100000000) " should " have 2 gaps" in {
    val t = BinaryGaps.solution(51712)
    t shouldBe 2
  }

  "number 16 (10000) " should " have 0 gaps" in {
    val t = BinaryGaps.solution(16)
    t shouldBe 0
  }

  "number 1024 (10000000000) " should " have 0 gaps" in {
    val t = BinaryGaps.solution(1024)
    t shouldBe 0
  }

}
