// this seems to enforce the protobuf-java version
libraryDependencies += "com.google.protobuf" % "protobuf-java" % "3.2.0"
// this evits "0.5.47" which is the version used in lagom's `scaladsl-api` but it works ok
libraryDependencies += "com.trueaccord.scalapb" %% "compilerplugin" % "0.6.0"

addSbtPlugin("com.lightbend.lagom" % "lagom-sbt-plugin" % "1.4.0-SNAPSHOT")
addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.8")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")
