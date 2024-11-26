# **Backend Emssanar - Proyecto de Prueba**

Este proyecto está desarrollado utilizando **Java 21** con **Spring Boot**, gestionado con **Maven** para sus dependencias. A continuación, encontrarás una descripción detallada de la estructura y configuración del sistema.  

---

## **Estructura del Proyecto**

El código fuente está organizado en capas que agrupan responsabilidades específicas:

### **1. Configuración General**
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
1. **ClienteController**  
   - gestiona la api de los clientes.  
2. **productoController**  
   - gestiona la api de los productos.  


---

### **3. Modelos de Datos (Entities/Models)**
- **Descripción:**  
  Contiene las entidades que representan los datos del dominio, como la clase `Afiliado`.  

#### Detalles del Modelo `producto`  
Los atributos mapeados incluyen:  
● id: Identificador único del producto (tipo: Long).
● nombre: Nombre del producto (tipo: String).
● descripcion: Descripción del producto (tipo: String).
● precio: Precio del producto (tipo: Double).
● cantidadDisponible: Cantidad disponible en inventario
(tipo: Integer).
● foto: URL o ruta de la foto del producto (tipo: String).


#### Detalles del Modelo `cliente`  
Los atributos mapeados incluyen:  
● id: Identificador único del cliente (tipo: Long).
● nombre: Nombre del cliente (tipo: String).
● apellido: Apellido del cliente (tipo: String).
● correoElectronico: Correo electrónico del cliente
(tipo: String).
● telefono: Número de teléfono del cliente (tipo: String).
---

### **4. Repositorios (Data Access Layer)**  
- **Descripción:**  
  Define las interfaces para la interacción con la base de datos utilizando JPA.

---

## **Configuración del Sistema**

El proyecto utiliza una base de datos en memoria **H2**, ideal para pruebas rápidas.  

### Propiedades de Configuración  
```properties
spring.datasource.url=jdbc:h2:mem:emssanar
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=emssanar
spring.datasource.password=1234
