package com.b2w.analytics.athena_zeppelin.zeppelin

import java.util.Properties

import org.apache.zeppelin.interpreter.{Interpreter, InterpreterContext, InterpreterResult}

class AthenaInterpreter(properties:Properties) extends  Interpreter(properties) {
  override def open(): Unit = {

  }

  override def close(): Unit = ???

  override def interpret(s: String, interpreterContext: InterpreterContext): InterpreterResult = ???

  override def cancel(interpreterContext: InterpreterContext): Unit = ???

  override def getFormType: Interpreter.FormType = ???

  override def getProgress(interpreterContext: InterpreterContext): Int = ???
}
