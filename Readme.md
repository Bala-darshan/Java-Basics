# Java Basics – Scanner Input Example

This repository contains a simple Java program (`basic_scanner.java`) that demonstrates how to take user input using the `Scanner` class.

---

## 📄 File Included

- `basic_scanner.java` – Java program that asks for the user's name and prints it.

---

## 🧠 What It Does

The program:
1. Uses the `Scanner` class to get input from the user.
2. Asks the user for their name.
3. Stores the input in a `String` variable.
4. Prints the name back to the console.

This is a basic introduction to:
- User input handling in Java
- Using `Scanner` from `java.util`
- Working with `String` datatype

---

## 💡 Code Snippet

```java
Scanner sc = new Scanner(System.in);
System.out.println("What is your name?");
String name = sc.nextLine();
System.out.println(name);
