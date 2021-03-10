package org.knoldus.lastElement

class FindLastElement {
  def LastElement(list: List[Int]): (Int, Int) = {
    var len = 0

    for (element <- list) {
      len += 1
    }
    //list(len-1) returns the last element of list and (len-1) returns the last index
    try {
      (list(len - 1), len - 1)
    }
    catch
      {
        case e: IndexOutOfBoundsException => (-1, -1)
      }
  }
}
