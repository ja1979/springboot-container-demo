# Spring Boot Container Demo

## Run it locally 
```
./mvnw spring-boot:run
```

```
curl -w "\n" localhost:8080/api
```

## Package it in an image container
```
./mvnw clean package

podman build -t demo .

podman images | grep demo
```

## Run it locally inside a container

```
podman run --name demo -p 30080:8080 demo
```

```
curl -w "\n" localhost:30080/api

podman rm demo
```

## Run it locally inside a container using environment variables
```
podman run --name demo -p 30080:8080 -e APPLICATION_SERVICEURL=http://external.acme.com/ws/customer demo
```

```
curl -w "\n" localhost:30080/api

podman rm demo
```
