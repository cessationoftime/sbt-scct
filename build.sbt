sbtPlugin := true

name := "scct-plugin"

organization := "ch.craven"

version := "0.2.1-SNAPSHOT"

publishMavenStyle := true

publishTo <<= (version) { version: String =>
  val repo = "http://192.168.0.7:8080/archiva/repository/"
  if (version.trim.endsWith("SNAPSHOT"))
    Some("Repository Archiva Managed snapshots Repository" at repo + "snapshots/")
  else
    Some("Repository Archiva Managed internal Repository" at repo + "internal/")
}

credentials += Credentials("Repository Archiva Managed internal Repository", "192.168.0.7", "xxx", "xxx")

credentials += Credentials("Repository Archiva Managed snapshots Repository", "192.168.0.7", "xxx", "xxx")

