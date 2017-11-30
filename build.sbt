
name := """play-java-seed"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  guice,
  evolutions,
  javaJdbc,
  javaWs,
  jdbc,
  "org.postgresql" % "postgresql" % "9.4.1209",
  ws
)
