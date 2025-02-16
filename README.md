# springboot_apachekafka

1. Download Apache Kafka
	URL- https://kafka.apache.org/downloads
	
2. Extract the zip file and copy into folder

3. Open Powershell and move to Kafka Folder
	PS C:\WINDOWS\system32> cd C:\Kafka\kafka_2.13-3.9.0\
	
4. Set JDK Path as- $env:JAVA_HOME="C:\Program Files\Java\jdk-17"

5. Commands to start Zookeeper and Kafka :
 .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
 .\bin\windows\kafka-server-start.bat .\config\server.properties

6. Go to https://www.kafkatool.com/
   - offsetexplorer_64bit download and install it

7. Open offsetexplorer software
   - cluster name- local kafka
   - Bootstrap Server- localhost:9092
   - kafka cluster version- 3.1
   then create topic[right click and then create] 
   Next go to partition and add data as message key, value
   ex- key- message, value- Welcome to Full Stack Java Developer, Pune 
   go to properties instead of byte Array select String type 
   and run/ retrieve message using play icon
  
8. Create Spring Boot Application for Producer & Consumer

-------------------------------------------------------------------
Apache Kafka Notes-

What is Apache Kafka
Apache Kafka is a distributed event streaming platform designed for handling real-time data feeds. It is used for high-throughput, fault-tolerant, and scalable data streaming and messaging. Kafka is commonly used in event-driven architectures, microservices, log processing, and real-time analytics.

It was initially thought of as a message queue and open-sourced by LinkedIn in 2011. Its community evolved Kafka to provide key capabilities:
Publish and Subscribe to streams of records, like a message queue.
Storage system so messages can be consumed asynchronously. Kafka writes data to a scalable disk structure and replicates for fault-tolerance. Producers can wait for write acknowledgments.
Stream processing with Kafka Streams API, enables complex aggregations or joins of input streams onto an output stream of processed data.

Traditional messaging models are queue and publish-subscribe. In a queue, each record goes to one consumer. In publish-subscribe, the record is received by all consumers.

Key Components of Kafka:
1. Producer – Publishes (writes) data to Kafka topics.
2. Broker – Kafka server that stores and manages messages.
3. Topic – A category to which records are sent by producers and read by consumers.
4. Partition – A topic is split into partitions to allow parallel processing.
5. Consumer – Reads data from Kafka topics.
6. Zookeeper – Manages Kafka cluster metadata and configurations

Key Features of Kafka:
1. High Throughput & Low Latency – Handles millions of messages per second.
2. Scalability – Can scale horizontally by adding more brokers.
3. Fault Tolerance – Ensures data durability using replication.
4. Persistence & Durability – Uses disk storage for reliable message retention.
5. Real-time Processing – Works with stream processing frameworks like Kafka Streams and Apache Flink.

Common Use Cases:
Log Aggregation (e.g., collecting logs from multiple sources)
Event-driven Microservices (e.g., asynchronous communication between services)
Real-time Analytics (e.g., monitoring user activity on a website)
Messaging Queue Replacement (e.g., replacing traditional message brokers like RabbitMQ)

Pros of Kafka
Loose coupling — Neither service knows about each other regarding data update matters.

Durability — Guarantees that the message will be delivered even if the consumer service is down. Whenever the consumer gets up again, all messages will be there.

Scalability — Since the messages get stored in a bucket, there is no need to wait for responses. We create asynchronous communication between all services.

Flexibility — The sender of a message has no idea who is going to consume it. Meaning you can easily add new consumers (new functionality) with less work.


Cons of Kafka
Semantics — The developer needs to have a deep understanding of the message flow as its strict requirements. Complex fallback approaches may take place.