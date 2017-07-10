name := "sbt-emr-spark"



scalaVersion := "2.10.6"

sbtPlugin := true

val awsVersion = "1.11.160"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-emr" % awsVersion,
  "com.amazonaws" % "aws-java-sdk-s3" % awsVersion,
  "com.github.pathikrit" %% "better-files" % "2.14.0",
  "com.github.eirslett" %% "sbt-slf4j" % "0.1",
  "com.typesafe.play" %% "play-json" % "2.4.8",
  "org.slf4s" %% "slf4s-api" % "1.7.12"
)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")

publishMavenStyle := false

organization := "com.kailuowang"

bintrayOrganization := Some("kailuowang")

publishArtifact in Test := false

pomIncludeRepository := { _ => false }


homepage := Some(url("https://github.com/kailuowang/sbt-emr-spark"))

licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

description := "sbt plugin for automating spark job on EMR cluster"
