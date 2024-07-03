## To start zookeeper
zookeeper-server-start.bat ..\..\config\zookeeper.properties

## To start kafka server
kafka-server-start.bat ..\..\config\server.properties

## Create topic
`kafka-topics.bat --create --topic my-topic --bootstrap-server localhost:9092 --replication-factor 1 --partitions 3
`
`kafka-console-producer.bat --broker-list localhost:9092 --topic my-topic
`
`kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic my-topic --from-beginning`