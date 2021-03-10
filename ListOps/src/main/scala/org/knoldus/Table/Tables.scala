package org.knoldus.Table

class Tables {
  def AllTables(list: List[Int]): List[List[Int]] = {
    try {
      val lis = for (value <- list) yield {
        val tableElements = for (element <- 1 until 11) yield {
          value * element
        }
        tableElements.toList
      }
      lis
    }
    catch {
      case  e: IndexOutOfBoundsException => List(List(-1))
    }
  }
}