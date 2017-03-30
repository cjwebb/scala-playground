name := "Scala Playground"
version := "1.1.0"
scalaVersion := "2.12.1"

resolvers ++=
  Resolver.sonatypeRepo("releases") ::
  Resolver.sonatypeRepo("snapshots") ::
  Nil

libraryDependencies ++=
  "org.scalaz" %% "scalaz-core" % "7.2.10" ::
  "org.typelevel" %% "cats" % "0.9.0" ::
  "com.chuusai" %% "shapeless" % "2.3.2" ::
  "org.scalatest" %% "scalatest" % "3.0.1" % "test" ::
  "joda-time" % "joda-time" % "2.9.7" ::
  "org.joda" % "joda-convert" % "1.8.1" ::
  "com.typesafe.akka" %% "akka-actor" % "2.4.17" ::
  "com.typesafe.akka" %% "akka-http" % "10.0.5" ::
  Nil

