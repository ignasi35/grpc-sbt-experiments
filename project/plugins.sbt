
// VALID SETUP
libraryDependencies += "com.trueaccord.scalapb" %% "compilerplugin-shaded" % "0.6.0"
addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.11")
addSbtPlugin("com.lightbend.lagom" % "lagom-sbt-plugin" % "1.4.0-SNAPSHOT")


// INVALID SETUP
//addSbtPlugin("com.lightbend.lagom" % "lagom-sbt-plugin" % "1.4.0-SNAPSHOT")
//addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.11")
//libraryDependencies += "com.trueaccord.scalapb" %% "compilerplugin" % "0.6.0"
//
//addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")
