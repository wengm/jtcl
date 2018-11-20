// Your profile name of the sonatype account. The default is the same with the organization value
sonatypeProfileName := "com.github.dronox"

// To sync with Maven central, you need to supply the following information:
publishMavenStyle := true

// Where is the source code hosted
import xerial.sbt.Sonatype._
sonatypeProjectHosting := Some(GitHubHosting("dronox", "jtcl", "dustin.peterson@dronox.de"))
