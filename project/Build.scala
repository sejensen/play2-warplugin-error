import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "war-test"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "com.github.play2war" %% "play2-war-core" % "0.3.1"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      resolvers += "Play2war plugins release" at "http://repository-play-war.forge.cloudbees.com/release/"
    )

}
