import sbt.Keys.libraryDependencies

lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .settings(
    name := "play",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.15",
    libraryDependencies += guice
  )

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-java" % "3.0.6",
  "org.freemarker" % "freemarker" % "2.3.31"
)
