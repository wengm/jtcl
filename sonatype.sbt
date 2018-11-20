// Your profile name of the sonatype account. The default is the same with the organization value
sonatypeProfileName := "com.github.dronox"

// To sync with Maven central, you need to supply the following information:
publishMavenStyle := true

licenses := Seq("Custom Licenses" -> url("http://jtcl-project.github.io/jtcl/licenses.html"))

// Where is the source code hosted
import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("dronox", "jtcl", "dustin.peterson@dronox.de"))

publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)
