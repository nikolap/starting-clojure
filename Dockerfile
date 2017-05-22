FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/starting-clojure.jar /starting-clojure/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/starting-clojure/app.jar"]
