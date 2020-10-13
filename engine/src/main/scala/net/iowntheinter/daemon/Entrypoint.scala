package net.iowntheinter.daemon

import io.vertx.lang.scala.VertxExecutionContext
import io.vertx.scala.core._

import scala.util.{Failure, Success}

//class Entrypoint {
//
//}
object Entrypoint {
  val vertx = Vertx.vertx()

  implicit val ec = VertxExecutionContext(vertx.getOrCreateContext())

  def main(args: Array[String]): Unit = {
    List("scala:net.iowntheinter.daemon.Sender", "scala:net.iowntheinter.daemon.Reciever").foreach(member =>
      vertx.deployVerticleFuture(member) onComplete {
        case Success(id) =>
          println(s"${member} verticle deployed, id is ${id}")
        case Failure(exception) =>
          println("error deploying twitter verticle", exception)
          sys.exit(-1)
      })
  }
}
