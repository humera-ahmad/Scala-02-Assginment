package org.knoldus.lastElement

import org.scalatest.flatspec.AnyFlatSpec

class FindLastElementTest extends AnyFlatSpec {
  val findLastElement = new FindLastElement

  "LastElement" should "return 6,5" in {
    val result = findLastElement.LastElement(List(1,4,3,2,2,6))
    assertResult((6,5))(result)
  }

  it should "return -1,-1" in {
    val result = findLastElement.LastElement(List())
    assertResult((-1,-1))(result)
  }
  it should "return -4,0" in {
    val result = findLastElement.LastElement(List(-4))
  }
}
