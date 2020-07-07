ThisBuild / version := "0.1.0"
ThisBuild / organization := "org.scala-sbt.rt"
ThisBuild / description := "Exports the contents of the Java 9 . JEP-220 runtime image to a JAR for compatibility with older tools."
ThisBuild / homepage := Some(url("https://github.com/sbt/java9-rt-export"))
ThisBuild / startYear := Some(2017)
ThisBuild / licenses := List("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/sbt/java9-rt-export"),
    "scm:git@github.com:sbt/java9-rt-export.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "eed3si9n",
    name  = "Eugene Yokota",
    email = "@eed3si9n",
    url   = url("http://eed3si9n.com")
  )
)
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true

lazy val root = (project in file("."))
  .settings(
    name := "java9-rt-export",
    autoScalaLibrary := false,
    crossPaths := false,
    scalafmtOnCompile := true,
    Compile / mainClass := Some("sbt.rt.java9rtexport.Export"),
  )

