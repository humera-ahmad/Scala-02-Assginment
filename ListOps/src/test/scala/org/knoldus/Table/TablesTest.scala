package org.knoldus.Table

import org.scalatest.flatspec.AnyFlatSpec

class TablesTest extends AnyFlatSpec {
  val tables= new Tables

  "Table" should "return the correct output" in{
    val result = tables.allTables(List(12, 3, 4, 8))
    val expected = List(List(12, 24, 36, 48, 60, 72, 84, 96, 108, 120),
      List(3, 6, 9, 12, 15, 18, 21, 24, 27, 30),
      List(4, 8, 12, 16, 20, 24, 28, 32, 36, 40),
      List(8, 16, 24, 32, 40, 48, 56, 64, 72, 80))
    assertResult(expected)(result)
  }

  it should "return -1 as no input is given" in{
    val result = tables.allTables(List())
    val expected = List()
    assertResult(expected)(result)
  }

}
