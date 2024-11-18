## <h1>Application Spring Boot Prometheus Grafana</h1>
***
<table>
  <tr>
    <td><img src="https://miro.medium.com/v2/resize:fit:4800/format:webp/1*dMNxZtLQFVkKjgzwrPChBg.png" alt="drawing" height="280px"/></td>
    <td><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Grafana_logo.svg/768px-Grafana_logo.svg.png?20230113183101" alt="drawing" height="280px"/></td>
  </tr>
</table>

## Informations Générales
***
Mise en place d'un outil de surveillance applicative via prometheus et grafana

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
