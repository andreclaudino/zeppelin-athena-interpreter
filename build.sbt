name := "zeppelin_athena_interepreter"

version := "0.1"

scalaVersion := "2.12.6"

// Runtime dependencies
libraryDependencies ++= Seq(
  "org.apache.zeppelin" % "zeppelin-interpreter" % "0.7.3" % "provided",

)

// Test Dependencies
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "org.easymock" % "easymock" % "3.6" % "test"
)