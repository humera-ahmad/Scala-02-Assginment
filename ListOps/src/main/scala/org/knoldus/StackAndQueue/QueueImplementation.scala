package org.knoldus.StackAndQueue

class QueueImplementation {
  def displayQueue(list: List[Int]): List[Int]= {
    list
  }
  def frontQueue(list: List[Int]): Int= {
    try {
      val front = list.head
      front
    }
    catch {
      case e: NoSuchElementException => -1
    }
  }
  def enQueue(list: List[Int], element: Int): List[Int]= {
    val enqueue = list :+ element
    enqueue
  }

  def deQueue(list: List[Int]): List[Int]= {
    try {
      val dequeue = list.tail
      dequeue
    }
    catch {
      case  e: UnsupportedOperationException => List()
    }
  }
}
