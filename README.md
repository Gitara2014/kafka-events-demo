# kafka-events-demo

Two Java Spring-Boot services communicate via Kafka.

The producer periodically sends Timestamp event to Kafka.

The consumers listen for Timestamp events and prints those to console.

```shell
mvn clean package

# Start Kafka. In project root Kafka and Zookeeper will be started using docker-compose.yml
sudo docker-compose up

#start producer
java -jar producer/target/*.jar

#start consumer
java -jar consumer/target/*.jar
```

Producer 
```log
2022-02-01 01:27:35.833  INFO 1046527 --- [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Cluster ID: OW2mG14dR82g_m_lLDQY8w
2022-02-01 01:27:35.917  INFO 1046527 --- [   scheduling-1] c.b.e.producer.config.KafkaProducer      : Sent 2022-02-01T01:27:35.772596767+01:00[Europe/Berlin]
2022-02-01 01:27:45.772  INFO 1046527 --- [   scheduling-1] c.b.e.producer.config.KafkaProducer      : Sent 2022-02-01T01:27:45.772312008+01:00[Europe/Berlin]
2022-02-01 01:27:55.773  INFO 1046527 --- [   scheduling-1] c.b.e.producer.config.KafkaProducer      : Sent 2022-02-01T01:27:55.772360151+01:00[Europe/Berlin]
```

Consumer
```log
2022-02-01 01:27:47.077  INFO 1046575 --- [ntainer#0-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : kafka_demo_group: partitions assigned: [timestampTopic-0]
2022-02-01 01:27:55.862  INFO 1046575 --- [ntainer#0-0-C-1] c.b.e.consumer.config.KafkaConsumer      : Time is: 2022-02-01T00:27:55.772360151Z[UTC]
2022-02-01 01:28:05.782  INFO 1046575 --- [ntainer#0-0-C-1] c.b.e.consumer.config.KafkaConsumer      : Time is: 2022-02-01T00:28:05.772340238Z[UTC]
2022-02-01 01:28:15.782  INFO 1046575 --- [ntainer#0-0-C-1] c.b.e.consumer.config.KafkaConsumer      : Time is: 2022-02-01T00:28:15.772438756Z[UTC]
2022-02-01 01:28:25.783  INFO 1046575 --- [ntainer#0-0-C-1] c.b.e.consumer.config.KafkaConsumer      : Time is: 2022-02-01T00:28:25.772408576Z[UTC]
2022-02-01 01:28:35.784  INFO 1046575 --- [ntainer#0-0-C-1] c.b.e.consumer.config.KafkaConsumer      : Time is: 2022-02-01T00:28:35.772366575Z[UTC]

```

### Reference Documentation
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#boot-features-kafka)


