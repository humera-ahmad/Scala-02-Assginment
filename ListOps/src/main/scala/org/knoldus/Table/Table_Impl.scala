package org.knoldus.Table

object Table_Impl {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1,2,3)

    val tables=new Tables

    tables.AllTables(list)
  }
}
