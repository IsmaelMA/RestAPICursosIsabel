# Rest API Spring Boot

Este proyecto es una Rest API desarrollada en Spring Boot y ha sido creado como parte de la formación "Master Java" impartida por Isabel Ares.

## Descripción del Proyecto

Este proyecto es una API REST que proporciona servicios para gestionar cursos. Los cursos tienen información como código, nombre, duración en horas y precio. La API permite realizar operaciones como crear nuevos cursos, listar cursos existentes, buscar cursos por código y actualizar la duración de un curso.

## Tecnologías Utilizadas

- Spring Boot
- Java
- RESTful API
- Maven

## Configuración del Proyecto

Asegúrate de tener instalado Java y Maven en tu sistema antes de ejecutar el proyecto.

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/tuusuario/rest-api-spring-boot.git


2. Navega al directorio del proyecto:
   ```bash
      cd rest-api-spring-boot

3.  Ejecuta la aplicación Spring Boot:
     ```bash
     mvn spring-boot:run

 La API estará disponible en http://localhost:puerto donde puerto es el puerto en el que se ejecuta la aplicación Spring Boot.

 ## Uso de la API

Puedes utilizar herramientas como Postman para interactuar con la API. A continuación, se proporcionan algunos ejemplos de endpoints disponibles:

- **Crear un nuevo curso**:
POST /api/cursos](http://localhost:8080/alta)](http://localhost:8080/alta)
Body:
{
"codigoCurso": 101,
"nombreCurso": "Curso de Ejemplo",
"horasDuracion": 50,
"precioCurso": 1000
}

- **Listar todos los cursos**:
 http://localhost:8080/listar

- **Buscar un curso por código**:
  http://localhost:8080/buscar?codigo=x

- **Actualizar la duración de un curso**:
    http://localhost:8080/actualizarduracion?codigo=x&horas=y

     


   
