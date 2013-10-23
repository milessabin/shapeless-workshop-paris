scalaVersion := "2.10.2"

resolvers ++= Seq(
  "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  "com.chuusai"    %% "shapeless"   % "2.0.0-M1" cross CrossVersion.full
  //"com.chuusai"    %% "shapeless"   % "1.2.4"
)
