# 🛒 Carrito de Compras - Código Spaghetti

## 📌 Descripción

Este proyecto consiste en un sistema de carrito de compras desarrollado en Java utilizando el enfoque de **código spaghetti**.
Toda la lógica del sistema se encuentra en un solo archivo, sin separación de responsabilidades.

El objetivo es mostrar cómo funciona un sistema básico sin aplicar arquitectura estructurada.

---

## ⚙️ Tecnologías utilizadas

* Java
* Consola (CLI)

---

## 🚀 Funcionalidades

* Agregar productos
* Listar productos
* Editar productos
* Eliminar productos
* Calcular total
* Aplicar descuento (10% si supera cierto valor)
* Checkout (simulación de pago)
* Vaciar carrito

---

## 🧠 Estructura del proyecto

Todo el sistema está contenido en un solo archivo:

App.java

Incluye:

* Clase principal
* Clase Product
* Lógica del carrito
* Interacción con el usuario

---

## ▶️ Cómo ejecutar

### 1. Compilar

```bash
javac App.java
```

### 2. Ejecutar

```bash
java App
```

---

## 🖥️ Uso

Al ejecutar el programa, aparecerá un menú:

```
1. Agregar
2. Listar
3. Editar
4. Eliminar
5. Total
6. Pagar
7. Vaciar carrito
8. Salir
```

El usuario interactúa ingresando números en consola.

---

## ⚠️ Limitaciones

* Código no organizado
* Difícil de mantener
* No escalable
* Lógica repetida
* No separa responsabilidades

---

## 🎯 Propósito del proyecto

Este proyecto tiene un enfoque educativo, para entender la lógica básica antes de aplicar arquitecturas más avanzadas.

---

## 📊 Conclusión

El código spaghetti permite implementar soluciones rápidas y simples, pero no es recomendable para proyectos reales debido a su falta de estructura.

---
