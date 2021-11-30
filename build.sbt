import Dependencies._

ThisBuild / scalaVersion     := "2.13.7"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "zio-http-clean-test",
    libraryDependencies ++= Seq(
      // main dependencies
      "dev.zio" %% "zio"   % "1.0.12",
      "io.d11"  %% "zhttp" % "1.0.0.0-RC17"
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
