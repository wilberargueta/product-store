# Product Store

Servicio Rest para consulta de productos.
---
## Documentación

### Puerto
> PORT: 8001

### Archivo de configuración
> PATH: application.yml

### Documentación de Swagger UI
> URL: **/swagger-ui/index.html**

### EndPoints

> METHOD POST:  **/api/v1/items-availability/query**
> REQUEST:
```javascript
 {
            "brand": "",
            "country": "SV",
            "department": "",
            "store": "",
            "style": "",
            "upc": ""
 }
 ```