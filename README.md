# Kafka-Note
## A descriptive note for learning and practicing Apache Kafka.  
Read and learn more about **[Kafka](https://www.notion.so/noble-glasses-ed8/Apache-Kafka-2035054cd2c780039f2ed793ab1dda0b?source=copy_link)**.    

## Steps of using Kafka as a project:
Step 1: First download **Zookeeper** and **Kafka** using **Docker** with the following commands.
```bash
docker run -d --name zookeeper -p 2181:2181 -e ZOOKEEPER_CLIENT_PORT=2181 -e ZOOKEEPER_TICK_TIME=2000 confluentinc/cp-zookeeper:7.5.0
docker run -d --name kafka -p 9092:9092 -e KAFKA_BROKER_ID=1 -e KAFKA_ZOOKEEPER_CONNECT=zookeeper:2181 -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 -e KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR=1 --link zookeeper confluentinc/cp-kafka:7.5.0

```
Step 2: The following commands are pretty common: 

# 🛠️ Create a Kafka topic named 'my-topic' with 3 partitions and replication factor 1
```bash
kafka-topics --create --topic my-topic --bootstrap-server localhost:9092 --partitions 3 --replication-factor 1
```

# 📋 List all existing topics
```bash
kafka-topics --list --bootstrap-server localhost:9092
```

# ❌ Delete the topic 'my-topic'
```bash
kafka-topics --delete --bootstrap-server localhost:9092 --topic my-topic
```

# 🧪 Start a console producer to send messages to 'my-topic'
```bash
kafka-console-producer --topic my-topic --bootstrap-server localhost:9092
```

# 👂 Start a console consumer to read messages from 'my-topic' from the beginning
```bash
kafka-console-consumer --topic my-topic --bootstrap-server localhost:9092 --from-beginning
```

# 👥 Start a console consumer as part of a group (enables load balancing across consumers)
```bash
kafka-console-consumer --topic my-topic --bootstrap-server localhost:9092 --group my-group --from-beginning
```

# 🔍 Start a consumer and display the partition number of each message (useful for debugging)
```bash
kafka-console-consumer --topic my-topic --bootstrap-server localhost:9092 --from-beginning --property print.partition=true
```

# 📦 Describe topic details including partitions and replication
```bash
kafka-topics --describe --bootstrap-server localhost:9092 --topic my-topic
```
