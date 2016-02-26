name := """jurajkabzan_personalwebpage"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.4.0-1",
  "org.webjars.bower" % "bootstrap" % "3.3.6",
  "org.webjars" % "jquery" % "2.2.0",
  "org.webjars.bower" % "bxslider-4" % "4.2.5",
//  "org.webjars" % "fancybox" % "2.1.5",
//  "org.webjars" % "modernizr" % "2.8.3"
  "org.webjars" % "font-awesome" % "4.5.0"
//  "org.webjars.bower" % "pace" % "1.0.2"
)
// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

mappings in Universal ++=
//  (baseDirectory.value / "images_tab" * "*" get) map
//    (x => x -> ("images_tab/" + x.getName))
(baseDirectory.value / "images_tab" ***).get pair relativeTo(baseDirectory.value)