# spring-cloud-stream-pocs
Pruebas de concepto para aprender a trabajar con Spring Cloud Stream.

He probado Spring Cloud Streams con Rabbit MQ y Apache Kafka.

Para trabajar con Rabbit MQ he trabajado con una versión dockerizada, para ello hay que ejecutar en la consola
``docker-compose -f docker-compose-rabbitmq.yml  up -d``

Accedes a la consola de RabbitMQ en ``http://192.168.99.100:15672/``

Para trabajar con Kafka, ejecular el siguiente comando en la consola ``docker-compose -f docker-compose-kafka.yml up -d``

Accedes a la consola de Kafka Manager en ``http://192.168.99.100:9000/``

El producer es un controlador REST que postea un JSON en el canal de salida y el consumer consume el mensaje.
