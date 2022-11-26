import sbt._

object Dependencies {

  val logging_lib = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
  val test_lib    = "org.scalatest" % "scalatest_2.11" % "2.2.1"

  val core_deps = Seq(logging_lib, test_lib % Test)
}

