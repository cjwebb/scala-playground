name := "Scala Playground"

version := "1.0"

scalaVersion := "2.10.2"

resolvers ++= Seq(
  "Sonatype OSS Releases"  at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "spray" at "http://repo.spray.io/"
)

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.0.4",
  "com.chuusai" % "shapeless" % "2.0.0-M1" cross CrossVersion.full,
  "io.spray" %%  "spray-json" % "1.2.5",
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test",
  "joda-time" % "joda-time" % "2.3",
  "org.joda" % "joda-convert" % "1.3.1"
)
