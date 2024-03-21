package org.vic

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println( "Hello World 2!" )
    println( "Hello World 3!" )
    println( "Hello World 3!" )
    println( "Hello World 3!" )
    println("concat arguments = " + foo(args))
  }

}
