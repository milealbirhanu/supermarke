# 🛒 Supermarke

A console-based supermarket shopping cart application built in Java, demonstrating object-oriented programming concepts including inheritance, polymorphism, and encapsulation.

---



```
supermarke-main/
├── Product.java             # Base class for all products
├── FoodProduct.java         # Extends Product (food items)
├── ElectronicProduct.java   # Extends Product (electronics)
├── Cart.java                # Shopping cart logic
└── Main.java                # Entry point & user menu
```

---



- Add **food products** (banana, apple, bread, coconut) with randomized prices
- Add **electronic products** (phone, laptop, TV, headphones) with warranty info
- Automatic **20% discount** on food items expiring in 5 days or fewer 🔥
- View your **cart** and **total price** in Ethiopian Birr (ETB)
- Personalized greeting using the shopper's name

---

## 🚀 Getting Started



- Java JDK 8 or higher



```bash
javac *.java
```

\

```bash
java Main
```

---



```
Enter your name: Mileal

===== MENU =====
1. Add Food Product
2. Add Electronic Product
3. Show Cart
4. Show Total
5. Exit
Choose: 1

FOOD WE HAVE:
banana
apple
bread
coconut
Enter food name: apple
Added: apple (Food) - 24.0 birr | 3 days left
```

---



| Class | Description |
|---|---|
| `Product` | Base class with name, price, and expiry. Applies discount if `daysToExpire <= 5` |
| `FoodProduct` | Extends `Product`; adds a category field |
| `ElectronicProduct` | Extends `Product`; adds warranty in months |
| `Cart` | Holds a list of products; calculates and displays totals |
| `Main` | Handles user input and drives the menu loop |

---



| Product | Base Price (ETB) | Warranty |
|---|---|---|
| Banana | 20 – 40 | — |
| Apple | 10 – 30 | — |
| Bread | 5 – 15 | — |
| Coconut | 30 – 60 | — |
| Phone | 15,000 | 12 months |
| Laptop | 50,000 | 24 months |
| TV | 30,000 | 18 months |
| Headphones | 2,000 | 6 months |

> Food prices are randomized on each run. Items with ≤ 5 days to expiry receive a **20% discount**.

---

## 🛠️ Built With

- Java (Core OOP — inheritance, polymorphism, encapsulation)
- `java.util.Scanner` for console input
- `java.util.ArrayList` for cart management

---

## 👤 Author

**Mileal Birhanu**  
GitHub: [@milealbirhanu](https://github.com/milealbirhanu) 


**Mana Tekie**  
GitHub: 
