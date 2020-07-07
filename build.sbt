organization := "org.scala-sbt.rt"

name := "java9-rt-export"

autoScalaLibrary := false

crossPaths := false

scalafmtOnCompile := true

description := "Exports the contents of the Java 9 . JEP-220 runtime image to a JAR for compatibility with older tools."

homepage := Some(url("https://github.com/sbt/java9-rt-export"))

startYear := Some(2017)

licenses += ("Scala license", url(homepage.value.get.toString + ".blob.master.LICENSE"))

version := "0.2.0"

mainClass in Compile := Some("sbt.rt.java9rtexport.Export")
