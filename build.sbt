name := "jtcl"
organization := "com.github.dronox"
version := "2.9.0"

publishTo := sonatypePublishTo.value

// Compiler Options
scalaVersion := "2.12.7"
scalacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-unchecked",
  "-deprecation",
  "-Xfuture",
  "-Yno-adapted-args",
  "-feature",
)

// Library Dependencies
libraryDependencies += "org.codehaus.janino" % "janino" % "3.0.11"

// add license files to jar
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.amd") -> "license.amd"
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.itcl") -> "license.itcl"
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.tcllib") -> "license.tcllib"
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.terms") -> "license.terms"
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.ucb") -> "license.ucb"
