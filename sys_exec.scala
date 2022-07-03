import scala.language.postfixOps
import sys.process._

object sys_exec extends App {
  println("This will send the output of 'ls -l' to the Scala terminal")
  println("Use this framework to execute system commands with Scala\n")

  val sysexec = "ls -l" !

  println(sysexec)

}
