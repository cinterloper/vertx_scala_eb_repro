package net.iowntheinter.daemon

import io.vertx.lang.scala.ScalaVerticle
import net.iowntheinter.Config.CHANNEL
class Sender extends ScalaVerticle  {

  override def start(): Unit = {
    vertx.setPeriodic(10000, { l =>
      println(s"will attempt to send message on $CHANNEL")
      vertx.eventBus().publish(CHANNEL, Option("Hello from Sender"))

    })
  }


}
