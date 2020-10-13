import sbt.Keys.{autoScalaLibrary, _}
import sbt._
import sbtassembly.AssemblyPlugin.defaultShellScript

import xsbti.compile

ThisBuild / organization := "net.iowntheinter"
ThisBuild / scalaVersion := "2.12.10"
ThisBuild / version := "0.1-snapshot"
Compile / compileOrder := CompileOrder.JavaThenScala




lazy val engine = (project in file("engine"))
  .settings(
    name := "example",
    description := "example",
    crossPaths := false,
    autoScalaLibrary := false,
    mainClass in assembly := Some("net.iowntheinter.daemon.Entrypoint"),
    libraryDependencies := List(
      "org.scala-lang" % "scala-library" % "2.12.10",
      "io.vertx" % "vertx-lang-scala-stack_2.12" % "3.9.1",
      "io.vertx" % "vertx-lang-scala-parent_2.12" % "3.9.1",

    )

  )
  .enablePlugins(AssemblyPlugin)


