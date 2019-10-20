# generic-app-rest-api
A Generic REST API 


# Docker
See Dockerfiler

mvn install

docker build -f Dockerfile -t docker-spring-vue .

docker run -p 9000:9000 docker-spring-vue

# Docker other commands
docker rename id <newname>
docker ps -a

docker system prune => remove all stopped containers 

Heroku
https://dashboard.heroku.com/apps/generic-rest-api