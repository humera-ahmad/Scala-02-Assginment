package org.knoldus.StackAndQueue

object StackQueue_Impl {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1,2,3)

    val implStack = new StackImplementation
    val implQueue = new QueueImplementation

    implStack.DisplayStack(list)
    implStack.StackPush(list,4)
    implStack.StackPop(list)

    implQueue.DisplayQueue(list)
    implQueue.FrontQueue(list)
    implQueue.Enqueue(list,6)
    implQueue.Dequeue(list)
  }
}