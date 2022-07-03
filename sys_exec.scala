import scala.language.postfixOps
import sys.process._

object sys_exec extends App {
  println("This will send the output of 'ls -l' to the Scala terminal")
  println("Use this framework to execute system commands with Scala")

  val sysexec = "ls -l" !

  println(sysexec)

  println("")
  println("To use commands requiring a pipe, use the '#|' operator:\n")

  val pipe = "ps auxw" #| "grep http" !

  println(pipe)

}
