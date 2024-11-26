# **Backend Emssanar - Proyecto de Prueba**

Este proyecto está desarrollado utilizando **Java 21** con **Spring Boot**, gestionado con **Maven** para sus dependencias. A continuación, encontrarás una descripción detallada de la estructura y configuración del sistema.  

---

## **Estructura del Proyecto**

El código fuente está organizado en diferentes paquetes que agrupan responsabilidades específicas:

### **1. Configuración General**
- **Ubicación:**  
  `src/main/java/com/backend/emssanar/backend/config`
- **Descripción:**  
  Contiene configuraciones fundamentales para la aplicación, como ajustes de CORS que permiten recibir solicitudes desde la URL:  
  `http://localhost:4200`.

---

### **2. Controladores (Controllers)**
- **Ubicación:**  
  `src/main/java/com/backend/emssanar/backend/controller`  
- **Descripción:**  
  Las clases de este paquete manejan las solicitudes HTTP, gestionan la lógica empresarial y controlan excepciones.

#### Principales Controladores:  
1. **AfiliadoController**  
   - Gestiona las operaciones CRUD de los afiliados.  
2. **ControladorDeExcepciones**  
   - Centraliza el manejo de errores en la aplicación, proporcionando respuestas adecuadas.  
3. **RecursoNoEncontradoException**  
   - Define una excepción personalizada para casos donde un recurso no está disponible.

---

### **3. Modelos de Datos (Entities/Models)**
- **Ubicación:**  
  `src/main/java/com/backend/emssanar/backend/models`
- **Descripción:**  
  Contiene las entidades que representan los datos del dominio, como la clase `Afiliado`.  

#### Detalles del Modelo `Afiliado`  
Los atributos mapeados incluyen:  
- **id (Long):** Identificador único.  
- **nombre (String):** Nombre completo.  
- **fechaNacimiento (String):** Fecha de nacimiento.  
- **direccion (String):** Dirección del afiliado.  
- **telefono (String):** Número de contacto.  
- **genero (String):** Género.  

---

### **4. Repositorios (Data Access Layer)**  
- **Ubicación:**  
  `src/main/java/com/backend/emssanar/backend/repository`  
- **Descripción:**  
  Define las interfaces para la interacción con la base de datos utilizando JPA.

---

## **Configuración del Sistema**

El proyecto utiliza una base de datos en memoria **H2**, ideal para pruebas rápidas.  

### Propiedades de Configuración  
```properties
spring.datasource.url=jdbc:h2:mem:emssanardb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=emssanar
spring.datasource.password=password
spring.h2.console.enabled=true
