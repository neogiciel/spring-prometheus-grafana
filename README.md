## <h1>Application Spring Boot Prometheus Grafana</h1>
***
<table>
  <tr>
    <td><img src="https://blog.mossroy.fr/wp-content/uploads/2019/09/spring-boot-logo.png" alt="drawing" height="280px"/></td>
    <td><img src="[https://cdn.icon-icons.com/icons2/2699/PNG/512/rabbitmq_logo_icon_170812.png](https://commons.wikimedia.org/wiki/File:Grafana_logo.svg)" alt="drawing" height="280px"/></td>
  </tr>
</table>

## Informations Générales
***
Mise en place d'une  broker Rabbit MQ permettan la gestion de message Asynchrone

## Technologies
***
Technologies utilisées:
* Java 17 
* Maven 3.9.2
* Spring-boot: 3.2
## Instalation
***
Deploiement des serveurs prometheus et grafana se font via le docker-compose disponible dans le dossier docker

$ mvn  clean
$ mvn spring-boot:run
```
Le service est accessible sur http://localhost:8080

## FAQs
***

**Tester le scrapping du service**<br>
http://localhost:8080/actuator/prometheus

**Tester le server prometheus**<br>
http://localhost:9090

**Logiciel grafana**<br>
http://localhost:3000

**Mettre source au sein de grafana**<br> 
http://prometheus:9090

**Serveur Prometheus**<br>
Le seveur est accessible via http://localhost:5672
