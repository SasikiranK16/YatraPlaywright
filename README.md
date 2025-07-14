# 🛫 Yatra Automation Project

## 📌 Project Overview

This project is a **Playwright-based test automation** solution developed for interacting with the [Yatra](https://www.yatra.com/) flight booking site. The focus is on automating the **departure date calendar**, handling both visible months, and extracting **lowest fare details** with clean and dynamic implementation.

---

## 🔧 Technologies Used

- 💻 **Java**
- 🌐 **Playwright**
- 🧪 **TestNG** *(if applicable)*
- 🛠️ **Maven / Gradle**
- 🌍 Web UI: Yatra.com

---

## 🎯 Core Highlights

- ✅ **No hardcoded values** – everything built dynamically
- ♻️ **Reusable methods** – each function can be invoked independently
- 📅 Handles:
  - **Current month**
  - **Next month**
  - **Both calendar views**
- 💰 Extracts and filters all fare options
- 📉 Selects and interacts with the **lowest available fare**

---

## 🚀 Functional Flow

1. **Launch Yatra site**
2. **Click on Departure Date** input
3. **Calendar pop-up** appears with current and next months
4. Collect all **fare WebElements** dynamically
5. Use **Stream API** to:
   - Convert fare text to integers
   - Filter duplicates if needed
   - Identify the **lowest fare**
6. **Click or print** the lowest fare element

---

## ⚙️ Design Philosophy

- 🔄 Fully dynamic — handles changes in fare count or structure
- 🔍 Built with maintainability in mind
- ♻️ All code written in **modular and reusable** methods
- ❌ No reliance on static text or hardcoded locators

---
