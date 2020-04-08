
./mvnw spring-boot:run

curl localhost:8080/api

./mvnw clean package

docker build -t demo:0.0.1-SNAPSHOT .

docker run --name demo -p 38080:8080 demo:0.0.1-SNAPSHOT

curl localhost:8080/api

docker rm demo

docker run --name demo -p 38080:8080 -e APPLICATION_URL=hhtp://dummy.com demo:0.0.1-SNAPSHOT

curl localhost:8080/api
