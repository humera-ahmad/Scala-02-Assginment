package org.knoldus.StackAndQueue

class StackImplementation {
  def DisplayStack(list: List[Int]): List[Int]= {
    list.reverse
  }

  def StackPush(list: List[Int], element: Int): List[Int]= {
    val pushed = element :: list.reverse

    pushed
  }

  def StackPop(list: List[Int]): (Int,List[Int])= {
    try{
    val popped = list.reverse.head
    val stackAfterPop = list.reverse.tail

    (popped,stackAfterPop)
  }
    catch {
      case e: NoSuchElementException => println("Not found");(-1,List())
    }
  }
}