name := "scala-shopping-cart"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val scalatestV = "2.2.4"
  Seq(
    "org.scalatest" %% "scalatest" % scalatestV % "test"
  )
}
