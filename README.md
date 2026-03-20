# 📱 Proyecto Android MVVM

Aplicación Android nativa desarrollada en Android Studio utilizando Kotlin, siguiendo el patrón de arquitectura MVVM.

---

## 🚀 Descripción

Esta aplicación permite visualizar una lista de elementos, acceder a su detalle y completar un formulario de contacto. Además, incluye una pantalla de bienvenida (Splash) y navegación entre múltiples vistas.

---

## 🧠 Arquitectura

Se implementó el patrón **MVVM (Model - View - ViewModel)**:

- **Model:** Clase `Item`
- **View:** Activities y layouts XML
- **ViewModel:** Manejo de datos con LiveData

Esto permite una correcta separación de responsabilidades y un código más limpio y escalable.

---

## 🛠️ Tecnologías utilizadas

- Kotlin
- Android Studio
- ViewBinding
- RecyclerView
- LiveData
- ViewModel
- Coroutines

---

## 📱 Funcionalidades

- ✨ Pantalla Splash con imagen
- 📋 Lista de elementos con RecyclerView
- 📄 Pantalla de detalle
- 📝 Formulario de contacto
- 🔄 Navegación entre pantallas con Intents

---

## ⚡ Programación Asíncrona

Se implementaron **Coroutines** para ejecutar tareas en segundo plano utilizando:

- `lifecycleScope.launch`
- `delay()`

Esto permite mantener la aplicación fluida sin bloquear la interfaz.

---

## 🎨 Interfaz de Usuario

- Uso de ConstraintLayout y LinearLayout
- Incorporación de imágenes y recursos visuales
- Diseño simple, limpio y funcional

---

## 📦 APK

Se generó correctamente el APK de depuración desde Android Studio.

---

## 🔁 Control de versiones

Se utilizó Git y GitHub para el control de versiones del proyecto:

- Inicialización de repositorio
- Commits
- Push a repositorio remoto

---

---

## 📌 Conclusión

La aplicación cumple con todos los requisitos solicitados, aplicando buenas prácticas de desarrollo Android, arquitectura MVVM y una interfaz funcional.

---

Desarrollado por Nini
