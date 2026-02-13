# Sistema Solar - Proyecto POO

Proyecto de Programación Orientada a Objetos que simula el sistema solar.

## Grupo 8

- GAMBOA ROMAN ESTEBAN EDUARDO
- JIMENEZ MESEN EVER DANIEL
- MUÑOZ CANO SEBASTIAN

---

## Estructura del Proyecto

src/
└── com.mycompany.sistemasolar/
├── Planeta.java
├── CuerpoCeleste.java
├── PlanetaRocoso.java
├── PlanetaGaseoso.java
└── SistemaSolar.java

Copy

---

## Conceptos de POO Aplicados

### Interfaz
- Define los métodos que todos los planetas deben tener
- Archivo: `Planeta.java`

### Clase Abstracta
- Tiene atributos comunes (nombre, tamaño, distancia)
- Tiene métodos para comparar planetas
- Archivo: `CuerpoCeleste.java`

### Herencia
- `PlanetaRocoso` extiende `CuerpoCeleste`
- `PlanetaGaseoso` extiende `CuerpoCeleste`

### Polimorfismo
- Cada tipo de planeta implementa `mostrarInfo()` diferente
- Método `calcularAnio()` usa la distancia al sol

### Colecciones
- ArrayList de planetas
- Métodos para ordenar y buscar

---

## Funciones del Sistema

1. **Mostrar todos los planetas** - Lista completa
2. **Buscar planeta** - Por nombre
3. **Comparar dos planetas** - Tamaño, distancia, lunas
4. **Ordenar por tamaño** - De mayor a menor
5. **Ordenar por distancia** - Del más cercano al más lejano
6. **Planeta más grande** - Encuentra el de mayor tamaño
7. **Planeta más lejano** - Encuentra el más distante del Sol

---

## Planetas Incluidos

### Rocosos
- Mercurio
- Venus
- Tierra
- Marte

### Gaseosos
- Júpiter
- Saturno
- Urano
- Neptuno

---

## Cómo Ejecutar

1. Abrir el proyecto en NetBeans
2. Ejecutar `SistemaSolar.java`
3. Usar el menú para explorar el sistema solar

---

## Notas

- El cálculo del año usa la Ley de Kepler (distancia^1.5)
- Las distancias están en UA (Unidades Astronómicas)
- Los tamaños están en kilómetros

---

**Fecha:** Febrero 2026  
**Curso:** Programación Orientada a Objetos  
**Grupo:** 8
