# spring-webflux-sample
This is a sample application which has a spring webflux listener and nginx config which is sitting in front of this server. 

java application can be start using the following command 

java  -Dserver.port=3000 -jar testReceiverFlux-0.0.1-SNAPSHOT.jar 

And nginx config is placed in config.d and restarted.


wrk benchmark command used for testing is

wrk -t2 -c100 -d30s --latency -s post.lua http://162.31.13.124:9080/reqToRespApi


first few runs it works fine but later nginx starts giving 502 and java app gives 

 curl http://localhost:3000/test
curl: (56) Recv failure: Connection reset by peer
