package com.rtjvm.scala.oop.filesystem

import com.rtjvm.scala.oop.commands.Command
import com.rtjvm.scala.oop.files.Directory

object Filesystem extends App {

  val root = Directory.ROOT

  io.Source.stdin.getLines().foldLeft(State(root, root))((currentState, newLine) => {
    currentState.show
    Command.from(newLine).apply(currentState)
  })

//  var state = State(root, root)
//  val scanner = new Scanner(System.in)
//
//  while(true) {
//    state.show
//    val input = scanner.nextLine()
//    state = Command.from(input).apply(state)
//
//  }
}
