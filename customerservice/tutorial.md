# How to run rabbitmq in docker
`docker pull rabbitmq`

`docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.13-management`
- -d: Detached mode (run the container in the background).
- --name my-rabbit: Name of the container.
- -p 5672:5672 -p 15672:15672: Publish ports for RabbitMQ (5672 for AMQP, 15672 for management UI).
rabbitmq: Name of the RabbitMQ image.