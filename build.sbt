name := """www.kabzanj.net"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.5.0",
  "org.webjars" % "bootstrap" % "3.1.1-2",
  "org.webjars" % "jquery" % "2.2.2",
  "org.webjars.bower" % "bxslider-4" % "4.2.5",
  "org.webjars" % "font-awesome" % "4.5.0",
  "org.webjars" % "jquery-easing" % "1.3-2"
)
// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

mappings in Universal ++=
//  (baseDirectory.value / "images_tab" * "*" get) map
//    (x => x -> ("images_tab/" + x.getName))
(baseDirectory.value / "images_tab" ***).get pair relativeTo(baseDirectory.value)

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }
