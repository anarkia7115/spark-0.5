resolvers ++= Seq(
  "sbt-idea-repo" at "http://mpeltonen.github.com/maven/",
  Classpaths.typesafeResolver,
  Resolver.url("sbt-plugin-releases", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns), 
  Resolver.url("bintray-sbt-plugins", new URL("http://dl.bintray.com/sbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
)

//resolvers += Resolver.url("bintray-sbt-plugins", new URL("https://dl.bintray.com/eed3si9n/sbt-plugins/"))(Resolver.ivyStylePatterns)
//resolvers += Resolver.bintrayIvyRepo("com.eed3si9n", "sbt-plugins")

//addSbtPlugin("com.jsuereth" % "xsbt-gpg-plugin" % "0.6")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse" % "2.1.0-RC1")

//addSbtPlugin("com.eed3si9n" %% "sbt-assembly" % "0.9.3")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.8.7")


