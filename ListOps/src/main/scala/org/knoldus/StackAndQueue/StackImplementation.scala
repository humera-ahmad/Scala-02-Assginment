package org.knoldus.StackAndQueue

class StackImplementation {
  def displayStack(list: List[Int]): List[Int]= {
    list.reverse
  }

  def stackPush(list: List[Int], element: Int): List[Int]= {
    val pushed = element :: list.reverse

    pushed
  }

  def stackPop(list: List[Int]): (Int,List[Int])= {
    try{
    val popped = list.reverse.head
    val stackAfterPop = list.reverse.tail

    (popped,stackAfterPop)
  }
    catch {
      case e: NoSuchElementException => (-1,List())
    }
  }
}
