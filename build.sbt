lazy val baseSettings = Seq(
  scalaVersion := "2.13.6"
)

lazy val root = (project in file("."))
  .settings(baseSettings)
  .settings(name := "site")
