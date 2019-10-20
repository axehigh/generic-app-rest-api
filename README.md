# spring-boot-vue


# Docker
See Dockerfiler

mvn install

docker build -f Dockerfile -t docker-spring-vue .

docker run -p 9000:9000 docker-spring-vue

# Docker other commands
docker rename id <newname>
docker ps -a

docker system prune => remove all stopped containers 