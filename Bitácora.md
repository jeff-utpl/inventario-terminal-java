
---

## 📑 `BITÁCORA.md` — decisiones y comandos clave

```markdown
# 🧭 Bitácora técnica del desarrollo

## 💡 Decisiones
- Se optó por estructura modular con carpetas separadas
- Ramas simuladas para emular flujo de colaboración profesional
- Manejo por consola para facilidad de ejecución y control total

## ⚙️ Flujo de trabajo Git
```bash
# Creación de ramas
git checkout -b interfaz
git checkout -b validacion
git checkout -b persistencia

# Fusión progresiva en main
git checkout main
git merge interfaz
git merge validacion
git merge persistencia

# Publicación en GitHub
git push origin main
git push origin interfaz
git push origin validacion
git push origin persistencia
