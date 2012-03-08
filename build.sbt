sbtPlugin := true

name := "scct-plugin"

organization := "ch.craven"

version := "0.2"

scalaVersion := "2.9.1"

publishMavenStyle := true

publishTo := Some(Resolver.file("Local Maven Repository", Path.userHome / ".m2" / "repository" asFile))

