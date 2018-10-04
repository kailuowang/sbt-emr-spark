name := "sbt-emr-spark"



scalaVersion := "2.12.7"

sbtPlugin := true

val awsVersion = "1.11.421"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-emr" % awsVersion,
  "com.amazonaws" % "aws-java-sdk-s3" % awsVersion,
  "com.github.pathikrit" %% "better-files" % "3.6.0",
  "com.typesafe.play" %% "play-json" % "2.6.10"
)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.8")

publishMavenStyle := false

organization := "com.kailuowang"

bintrayOrganization := Some("kailuowang")

publishArtifact in Test := false

pomIncludeRepository := { _ => false }


homepage := Some(url("https://github.com/kailuowang/sbt-emr-spark"))

licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

description := "sbt plugin for automating spark job on EMR cluster"
