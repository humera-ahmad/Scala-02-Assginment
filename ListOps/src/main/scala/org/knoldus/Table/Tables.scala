package org.knoldus.Table

class Tables {
  def allTables(list: List[Int]): List[List[Int]] = {
    val lis = for (value <- list) yield {
      val tableElements = for (element <- 1 until 11) yield {
        value * element
      }
      tableElements.toList
    }
    lis
  }
}
