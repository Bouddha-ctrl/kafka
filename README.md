# Kafka
A small implementation of the use case "Log aggregation" using Kafka :
- Two programs produce logs and send them to two topics (Topic per program), "Tuto1" and "Tuto2".
- The server consumes the logs from these two topics, persists them in a centralized database (Arraylist), which can then be manually consumed by a data processing service on demand.
- The server also combines the logs and produces them to the "output" topic, to be consumed in real-time by a data processing service.

Helpfull commande can be found on CommandeLine file.
