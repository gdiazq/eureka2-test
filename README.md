# Proyecto Eureka Semana 2

- Conocer el concepto tras la arquitectura de microservicios
- Entender conceptos como servidor de nombres y API Gateway, y como se aplican en la arquitectura de microservicios
- Entender la importancia de los test unitarios
- Analizar el concepto de cobertura de código y cómo aplicarlo a un proyecto práctico

## Que se evaluara

- Agrega al pom.xml las dependencias que necesites para implementar pruebas unitarias en tu proyecto Spring Boot. Si ya están incorporadas, omite este paso.
- Crea una clase que contenga un conjunto de pruebas que permita validar las siguientes operaciones: suma, resta, multiplicación, división y módulo.
- Crea una clase de tipo Spring Boot Test que contenga al menos dos pruebas unitarias que validen los repositorios del proyecto.
- Crea una clase de tipo Spring Boot Test que contenga al menos dos pruebas unitarias que validen los servicios del proyecto.
- Crea una clase de tipo Sprint Boot Test que contenga al menos dos pruebas unitarias que validen los controladores del proyecto.

## Alcances

Respecto de la entrega algunos alcances:
- Debes publicar el ejercicio en un repositorio GitHub
- Si seleccionas realizar el ejercicio 1, puedes usar el mismo repositorio anterior, cuidando que la primera entrega quede en una rama independiente.
- Si seleccionas realizar el ejercicio 2, se recomienda que partas desde un repositorio vacío.
- El repositorio debe tener un README que señale los pasos para descargar, compilar y ejecutar la solución
- Se recomienda indicar en el README las URL que permitan acceder a los endpoints, junto a datos de ejemplos que permitan ejecutarlos.

## Requisitos

- Java 21 o superior
- Maven 3.x
- Spring Boot 3.x
- Mockito
- Junit5
- Docker

## Instalacion 

- Clonar repositorio:
```bash
git clone https://github.com/gdiazq/eureka1.git 
```

- Instalar Docker Desktop [https://docs.docker.com/desktop/install/windows-install/]

- Ingresar a la carpeta del proyecto

- Ejecutar el contenedor docker mediante comando con  
```bash
docker-compose up -d
```

- Compilar el proyecto
```bash
mvn clean install 
```

- Ejecutar la aplicacion
```bash
mvn spring-boot:run
```

## Ejecucion de los endpoints

Se recomienda instalar postman, thunderbird como extension para vscode o utilizar el comand curl para linux

- Listar todos los customer

```bash
GET localhost:8080/customer
```

- Listar todos los project

```bash
GET localhost:8080/project
```

- Buscar cliente por id

```bash
GET localhost:8080/customer/{id}
```
Ejemplo: localhost:8080/customer/1

- Crear nuevo cliente
```bash
POST localhost:8080/customer
```
Ejemplo: localhost:8080/customer
```json
{
    "nombre": "Cliente F",
    "casa_matriz": "Casa Matriz F"
}
```

- Eliminar cliente por id
```bash
DELETE localhost:8080/customer/{id}
```
Ejemplo: localhost:8080/customer/6

## Para ejecutar las pruebas

Para ejecutar las pruebas uno debe iniciar el contenedor del docker y despues iniciar el proyecto, despues ir carpeta a carpeta de los test para poder ejecutar haciando click derecho e ir a la parte de Run Test

## Datos de ejemplo

No son necesarios ya que si se genera el docker con docker-compose la base de datos ya tendra datos en BBDD, aunque se usaron estos datos
```sql
INSERT INTO clientes (nombre, casa_matriz)
VALUES
    ('Cliente A', 'Casa Matriz A'),
    ('Cliente B', 'Casa Matriz B'),
    ('Cliente C', 'Casa Matriz C'),
    ('Cliente D', 'Casa Matriz D'),
    ('Cliente E', 'Casa Matriz E');

INSERT INTO proyectos (cliente_id, nombre)
VALUES
    (1, 'Proyecto Alpha'),
    (2, 'Proyecto Beta'),
    (3, 'Proyecto Gamma'),
    (4, 'Proyecto Delta'),
    (5, 'Proyecto Epsilon');
```