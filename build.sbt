name := "sandbox"

version := "1.0"
fork in run := true
connectInput := true

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.1.1"
libraryDependencies += "org.mockito" % "mockito-core" % "2.23.4" % Test
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test