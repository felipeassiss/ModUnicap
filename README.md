# UnicapMod ⛏️

[![Minecraft](https://img.shields.io/badge/Minecraft-1.21.1-brightgreen.svg)](https://www.minecraft.net/)
[![Forge](https://img.shields.io/badge/Forge-1.21.1-red.svg)](https://files.minecraftforge.net/)
[![Java](https://img.shields.io/badge/Java-OOP-blue.svg)](https://www.java.com/)

Official repository for the **UnicapMod** project. This Minecraft mod was developed as a practical assignment (2GQ grade) for the **Object-Oriented Programming (OOP)** course, serving as a hands-on approach to exploring theoretical Java concepts.

## 📜 About the Project

**UnicapMod** expands the vanilla Minecraft experience by blending theoretical OOP concepts with practical game design. The project investigates and implements a brand-new mining tier, custom interactive items with unique GUIs, and modified drop mechanics. It also utilizes Forge's data generation system to seamlessly integrate new resources, recipes, and world generation.

The current version demonstrates:
* **New Mineral Resources:** Introduction of Titanium Ore, featuring custom world-generation logic and extraction properties.
* **Advanced Equipment System:** A complete set of Titanium armor and tools, meticulously balanced with attributes designed to surpass base-game endgame materials like Netherite.
* **Custom GUI Items:** Implementation of the "R.A." (Academic Registry / Student ID) item, which triggers a custom Graphical User Interface displaying dynamic player data.
* **Entity Loot Modification:** Demonstration of custom drop mechanics, successfully adding the "Magic Feather" to the vanilla Chicken loot table.

---

## ✨ Key Features

### 💎 Titanium Ore & Processing
* **Generation:** Titanium generates in the deep layers of the Overworld. Its spawn rate and vein size (maximum of 3 blocks per vein) are scaled to mirror the rarity of Diamonds.
* **Extraction:** Mining Titanium requires a **Netherite or Titanium Pickaxe** and drops "Raw Titanium". The breaking time is deliberately balanced: using a Netherite Pickaxe on Titanium feels comparable to mining Obsidian with a Diamond Pickaxe. The Titanium Pickaxe offers the highest efficiency for this task.
* **Refining:** "Raw Titanium" can be smelted in a Furnace or Blast Furnace to produce "Titanium Ingots".

### ⚔️ Titanium Equipment Set
* **Tools:** Sword, Pickaxe, Axe, Shovel, and Hoe crafted from Titanium Ingots. These are designed to exceed Netherite tools in durability, mining speed, and damage.
* **Armor:** A full defensive set (Helmet, Chestplate, Leggings, Boots) crafted from Titanium Ingots, offering unparalleled protection and durability.

### 🎒 Special Items & Custom GUI
* **Magic Feather:** A rare crafting component with a 5% chance to drop from Chickens.
* **R.A. Item (Academic Registry):**
  * **Crafting:** Obtained by combining a *Book and Quill* with a *Magic Feather*.
  * **Interaction:** Right-clicking the item opens a custom GUI.
  * **GUI Display:** Features the player's name, a visual placeholder, a dynamically generated student ID number, and the field "Course: Computer Science" (*Ciência da Computação*).

![UnicapMod GUI Preview](https://github.com/user-attachments/assets/8261dd85-c927-4311-ab41-ae2d8aa95918)

---

## 🛠️ Installation & Usage

1. **Prerequisites:** Ensure you have [Minecraft Forge](https://files.minecraftforge.net/net/minecraftforge/forge/) installed for Minecraft version **1.21.1** (or the exact version the mod was compiled for).
2. **Download:** Grab the latest `.jar` release of UnicapMod from this repository.
3. **Install:** Place the downloaded `.jar` file into your Minecraft `mods` folder (usually found at `%appdata%\.minecraft\mods` on Windows).
4. **Launch:** Open the Minecraft Launcher, select your Forge profile, and hit play. The mod will load automatically!

---

## 🤝 Credits

This project was developed by **Felipe Assis** and **Júlio César**.
