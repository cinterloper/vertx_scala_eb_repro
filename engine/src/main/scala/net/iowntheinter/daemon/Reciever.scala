package net.iowntheinter.daemon

import io.vertx.core.Handler
import io.vertx.lang.scala.ScalaVerticle
import io.vertx.scala.core.eventbus
import net.iowntheinter.Config.CHANNEL

class Reciever extends ScalaVerticle {

  override def start(): Unit = {
    println(s"will listen on ${CHANNEL}")
    println("evaluation spawned")
       vertx.eventBus().consumer(CHANNEL, new Handler[eventbus.Message[AnyVal]] {
      override def handle(event: eventbus.Message[AnyVal]): Unit = { event: AnyVal =>
        println(s"got ${event}")
      }
    })
  }


}
