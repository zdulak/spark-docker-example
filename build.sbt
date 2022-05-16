ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.15"

organization := "damian"

lazy val root = (project in file("."))
  .settings(
    name := "spark-docker-example"
  )

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.2.1"

//enablePlugins(DockerPlugin)
//
//docker / dockerfile := {
//  val jarFile: File = (Compile / packageBin / sbt.Keys.`package`).value
//  val classpath = (Compile / managedClasspath).value
//  val mainclass = (Compile / packageBin / mainClass).value.getOrElse(sys.error("Expected exactly one main class"))
//  val jarTarget = s"/app/${jarFile.getName}"
//  // Make a colon separated classpath with the JAR file
//  val classpathString = classpath.files.map("/app/" + _.getName)
//    .mkString(":") + ":" + jarTarget
//  new Dockerfile {
//    // Base image
//    from("openjdk:11-jre")
//    // Add all files on the classpath
//    add(classpath.files, "/app/")
//    // Add the JAR file
//    add(jarFile, jarTarget)
//    // On launch run Java with the classpath and the main class
//    entryPoint("java", "-cp", classpathString, mainclass)
//  }
//}
//
//docker / imageNames := Seq(
//  // Sets the latest tag
//  ImageName(s"${organization.value}/${name.value}:latest"),
//
//  // Sets a name with a tag that contains the project version
//  ImageName(
//    namespace = Some(organization.value),
//    repository = name.value,
//    tag = Some("v" + version.value)
//  )
//)