# Kafka-Note
## A descriptive note for learning and practicing Apache Kafka.  
Read and learn more about **[Kafka](https://www.notion.so/noble-glasses-ed8/Apache-Kafka-2035054cd2c780039f2ed793ab1dda0b?source=copy_link)**.    

## Steps of using Kafka as a project:
Step 1: First download **Zookeeper** and **Kafka** using **Docker** with the following commands.
```bash
docker run -d --name zookeeper \
  -p 2181:2181 \
  -e ZOOKEEPER_CLIENT_PORT=2181 \
  -e ZOOKEEPER_TICK_TIME=2000 \
  confluentinc/cp-zookeeper:7.5.0
