$ sbt
[info] welcome to sbt 1.3.13 (Ubuntu Java 11.0.8)
[info] loading global plugins from /home/g/.sbt/1.0/plugins
[info] loading settings for project scala_eb_repro-build from assembly.sbt ...
[info] loading project definition from /home/g/ext_code/scala_eb_repro/project
[info] loading settings for project scala_eb_repro from build.sbt ...
[info] set current project to scala_eb_repro (in build file:/home/g/ext_code/scala_eb_repro/)
[info] sbt server started at local:///home/g/.sbt/1.0/server/a9e339a040d0ac421d00/sock
sbt:scala_eb_repro> fgRun
[info] Compiling 4 Scala sources to /home/g/ext_code/scala_eb_repro/engine/target/classes ...
[info] running net.iowntheinter.daemon.Entrypoint 
will listen on SOME_CHAN
evaluation spawned
scala:net.iowntheinter.daemon.Sender verticle deployed, id is ad75eab4-27e4-4c02-86d4-a9a776f17d0b
scala:net.iowntheinter.daemon.Reciever verticle deployed, id is 7703d560-1259-49a8-a91f-9550d3ce6b22
will attempt to send message on SOME_CHAN
will attempt to send message on SOME_CHAN
