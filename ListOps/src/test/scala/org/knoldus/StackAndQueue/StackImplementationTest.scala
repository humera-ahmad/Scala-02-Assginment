package org.knoldus.StackAndQueue

import org.scalatest.flatspec.AnyFlatSpec

class StackImplementationTest extends  AnyFlatSpec {
  val stackImplementation = new StackImplementation

  "DisplayStack" should "display correct output" in {
    val result = stackImplementation.displayStack(List(1,2,3))
    assertResult(List(3,2,1))(result)
  }

  "StackPush" should "return correct output" in {
    val result = stackImplementation.stackPush(List(1,2,3),4)
    assertResult(List(4,3,2,1))(result)
  }

  "StackPop" should "display correct output" in {
    val result = stackImplementation.stackPop(List(1,2,3,4))
    assertResult((4,List(3,2,1)))(result)
  }

  "StackPop" should "display nothing" in {
    val result = stackImplementation.stackPop(List())
    assertResult((-1,List()))(result)
  }
}
