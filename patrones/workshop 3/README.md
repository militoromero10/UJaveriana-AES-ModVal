<h1 align="center">Welcome to Workshop 3👋</h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-0.1.0-blue.svg?cacheSeconds=2592000" />
  <a href="https://unlicense.org" target="_blank">
    <img alt="License: unlicense" src="https://img.shields.io/badge/License-unlicense-yellow.svg" />
  </a>
</p>

> A Pipes & Filters challenge.

## Relevant technologies and tools

### ⚡️ [Micronaut](https://micronaut.io/)

> Version 4.3.0

### 📦️️ [Gradle](https://gradle.org/)

> Version 8.0

### ♻️ [Lombok](https://projectlombok.org/)

> Version 1.18.30

## Install
Run next command in both projects twitter-consumer-app and twitter-stream-app

```sh
./gradlew clean build jibDockerBuild

```




## How to run containers

- Step 1: Create a network.
    - ```sh  
      docker network create --subnet=172.18.0.0/16 patterns_network
      ```
- Step 2: Run containers.
    - RabbitMQ
      ```sh  
      docker run --net patterns_network --ip 172.18.0.50 -d --hostname rabbitmq --name some-rabbit -p 8081:15672 -p 5672:5672 rabbitmq:3-management
      ```
    - MariaDB
      ```sh  
      docker run --net patterns_network --ip 172.18.0.51  --detach --name some-mariadb -p 3306:3306  --env MARIADB_USER=patterns --env MARIADB_PASSWORD=patterns --env MARIADB_DATABASE=patterns-twitter --env MARIADB_ROOT_PASSWORD=patterns  mariadb:latest
      ```
    - Publisher app
      ```sh  
      docker run --net patterns_network --ip 172.18.0.53 -d -p 8080:8080 gcr.io/patterns/jib-twitter-stram-app:latest 
      ```
    - Consumer app
      ```sh  
      docker run --net patterns_network --ip 172.18.0.54 -d -p 8082:8082 gcr.io/patterns/jib-twitter-consumer-app:latest  
      ```
## How to test Pipes & filters
- Step 1: Use this link:
  - http://localhost:8080/books/1491950358
- Step 2: Check result.
  - http://localhost:8082/analytics
- Step 3: Optional, check saved object.
  - http://localhost:8082/analytics/1

    

## Show your support

Give a ⭐️ if this project helped you!

## 📝 License


This project is [unlicense](https://unlicense.org) licensed.

***
_This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_
