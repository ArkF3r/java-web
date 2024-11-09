**Run web service**:

Once project is compiled, you can start the service using this command:

    ```bash
    java --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.lang.reflect=ALL-UNNAMED -jar PATH/compiled_jar.jar
    ```

This start web service and you will see next lines on the console:

```plaintext
	Publicando Servicio Web de producto...
	Servicio Web de producto iniciado en http://localhost:8000/
	La direccion del wsdl es: http://localhost:8000/?wsdl
```

**Access to WSDL**:

Open your web explorer and visit the next URL to access to WSDL from this web service:

```plaintext
	http://localhost:8000/?wsdl
```
