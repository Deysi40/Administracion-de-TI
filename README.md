# Calculadora Simple en Java

## Descripción
Este es un proyecto simple en Java que implementa una calculadora básica con operaciones de suma y resta. Además, se incluyen pruebas unitarias para validar su correcto funcionamiento.

## Tecnologías utilizadas
- Java 11+
- JUnit 5 (para pruebas unitarias)

## Estructura del proyecto
```
calculadora/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Calculadora.java
│   │   │   ├── Suma.java
│   │   │   ├── Resta.java
│   ├── test/
│   │   ├── java/
│   │   │   ├── CalculadoraTest.java
│   │   │   ├── SumaTest.java
│   │   │   ├── RestaTest.java
├── README.md
├── pom.xml (Si se usa Maven)
```

## Instalación y ejecución
1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/calculadora-java.git
   ```
2. Navega al directorio del proyecto:
   ```bash
   cd calculadora-java
   ```
3. Compila el código fuente:
   ```bash
   javac -d out src/main/java/*.java
   ```
4. Ejecuta la calculadora (ejemplo de uso en consola):
   ```bash
   java -cp out main.java.Calculadora
   ```

## Clases principales
- `Calculadora.java`: Clase principal que gestiona las operaciones.
- `Suma.java`: Implementa la operación de suma.
- `Resta.java`: Implementa la operación de resta.

## Pruebas Unitarias
El proyecto incluye pruebas unitarias utilizando JUnit 5:

- `SumaTest.java`: Verifica la funcionalidad de la suma.
- `RestaTest.java`: Verifica la funcionalidad de la resta.

Para ejecutar las pruebas:
```bash
mvn test  # Si se usa Maven
```
O con Java y JUnit manualmente:
```bash
java -cp .:junit-platform-console-standalone-1.8.1.jar org.junit.platform.console.ConsoleLauncher --select-package test
```



