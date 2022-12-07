# Sigie alumni

## Configurar local environment

- Crear un archivo `application-dev.properties`

```bash
# (copiar archivo de ejemplo)
cp .\src\main\resources\example.application-dev.properties .\src\main\resources\application-dev.properties
```
- Agregue las credenciales de su base de datos

    - Debe cambiar `<host>`, `<port>`, `<db_name>`, `<db_user>` y `<db_pass>` por sus valores correspondientes.

- Configurar perfil activo como `dev` en "Edit configuration"