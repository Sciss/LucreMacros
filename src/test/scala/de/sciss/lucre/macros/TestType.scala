package de.sciss.lucre.macros

object TestType extends App {
//  object Bar
//  @mkCompanion class Bar

  // @mkCompanion object Baz

  @mkCompanion class Baz

  // implicitly[Foo[Bar]]
  // implicitly[Foo[Baz]]
  println("Done.")

  // @mkCompanion class Bar
}
