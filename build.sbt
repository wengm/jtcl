name := "jtcl"
organization := "com.github.dronox"
version := "2.9.0"

// Compiler Options
scalaVersion := "2.12.6"
scalacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-unchecked",
  "-deprecation",
  "-Xfuture",
  "-Yno-adapted-args",
  "-feature",
)

// Publishing Options
publishArtifact in (Compile, packageDoc) in ThisBuild := false

// Library Dependencies
libraryDependencies += "org.codehaus.janino" % "janino" % "3.0.11"
