organization := "eu.gruchala"

name := "guicy-scala"

version := "1.0-SNAPSHOT"

scalaVersion := "2.9.0-1"

// Add a single test dependency
libraryDependencies += "org.specs2" %% "specs2" % "1.4" % "test"

// Add multiple compile dependencies
libraryDependencies ++= Seq(
	"com.google.inject" % "guice" % "3.0",
	"com.google.inject.extensions" % "guice-assistedinject" % "3.0"
)

// Use the name and version to define the jar name
// I get error know: error: reassignment to val
//jarName <<= (name, version) {
//       ^
//jarName <<= (name, version) {
//	(name: String, version: String) => name + "-" + version + ".jar"
//}

// add a maven-style repository
//resolvers += "name" at "url"

// add a sequence of maven-style repositories
//resolvers ++= Seq("name" at "url",
//                  "Local Maven Repository" at "file://$M2_REPO")