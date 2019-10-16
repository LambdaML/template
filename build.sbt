name := "coderpads"

version := "0.1"

scalaVersion := "2.12.10"

libraryDependencies ++= Seq (
  "com.chuusai"     %% "shapeless"                    % "2.3.2",
  "org.scalacheck"  %% "scalacheck"                   % "1.13.4",
  "org.scalactic"   %% "scalactic"                    % "3.0.1",
  "org.scalamock"   %% "scalamock-scalatest-support"  % "3.5.0",
  "org.scalatest"   %% "scalatest"                    % "3.0.1",
  "org.scalaz"      %% "scalaz-core"                  % "7.2.12",
  "org.typelevel"   %% "cats"                         % "0.9.0",
  "com.google.guava" % "guava" % "28.1-jre",
//  "org.junit.jupiter" % "junit-jupiter-api" % "5.5.2" % Test,
  "org.junit" % "junit" % "5.3.1" % Test,
  "org.jmock" % "jmock-junit5" % "2.11.0" % Test,


)


resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "http://oss.sonatype.org/content/repositories/releases"
)
