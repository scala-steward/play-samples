enablePlugins(BuildInfoPlugin)
val playGrpcV = "0.12.1"
buildInfoKeys := Seq[BuildInfoKey]("playGrpcVersion" -> playGrpcV)
buildInfoPackage := "play.java.grpc.sample"

resolvers ++= Resolver.sonatypeOssRepos("snapshots")
addSbtPlugin("org.playframework" % "sbt-plugin" % "3.1.0-d1f1b9f8-SNAPSHOT")

addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.10.7")

// #grpc_sbt_plugin
// project/plugins.sbt
addSbtPlugin("org.apache.pekko" % "pekko-grpc-sbt-plugin" % "1.0.2")
libraryDependencies += "org.playframework" %% "play-grpc-generators" % playGrpcV
// #grpc_sbt_plugin
