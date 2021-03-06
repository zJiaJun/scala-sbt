package com.github.zjiajun.cookbook.ch2

/**
  * @author zhujiajun
  * @since 2017/9/15
  */
object StringConvertNumber_2_1 extends App {

  val a = BigInt("1")
  println(a)

  val b = BigDecimal("3.13459")
  println(b)

  val c = Integer.parseInt("100", 2)
  println(c)

  def toInt(s: String): Option[Int] =
    try {
      Some(s.toInt)
    } catch {
      case e: NumberFormatException => None
    }
}
