package org.knoldus.StackAndQueue

class QueueImplementation {
  def DisplayQueue(list: List[Int]): List[Int]= {
    list
  }
  def FrontQueue(list: List[Int]): Int= {
    try {
      val front = list.head
      front
    }
    catch {
      case e: NoSuchElementException => printf("Not found"); -1
    }
  }
  def Enqueue(list: List[Int], element: Int): List[Int]= {
    val enqueue = list :+ element
    enqueue
  }

  def Dequeue(list: List[Int]): List[Int]= {
    try {
      val dequeue = list.tail
      dequeue
    }
    catch {
      case  e: UnsupportedOperationException => println("Nothing found");List()
    }
  }
}
