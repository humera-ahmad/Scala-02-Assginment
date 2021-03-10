package org.knoldus.StackAndQueue

import org.scalatest.flatspec.AnyFlatSpec

class QueueImplementationTest extends AnyFlatSpec {
  val queueImplementation = new QueueImplementation

  "DisplayQueue" should "display correct output" in {
    val result = queueImplementation.DisplayQueue(List(1,2,3))
    assertResult(List(1,2,3))(result)
  }

  "Front Queue" should "return correct output" in {
    val result = queueImplementation.FrontQueue(List(1,2,3))
    assertResult(1)(result)
  }

  "Front Queue" should "display nothing" in {
    val result = queueImplementation.FrontQueue(List())
    assertResult(-1)(result)
  }

  "EnQueue" should "display correct output" in {
    val result = queueImplementation.Enqueue(List(1,2,3),6)
    assertResult(List(1,2,3,6))(result)
  }

  "DeQueue" should "display correct output" in {
    val result = queueImplementation.Dequeue(List(1,2,3))
    assertResult(List(2,3))(result)
  }

  "DeQueue" should "display nothing" in {
    val result = queueImplementation.Dequeue(List())
    assertResult(List())(result)
  }
}
