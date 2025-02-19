In line 11:

```java
String[] choices = { "rock", "paper", "scissors" };
```

we use square brackets (`[]`) to define an **array** in Java.

### Explanation:

1. **Arrays in Java**: The square brackets (`[]`) indicate that `choices` is an array that can store multiple values.
2. **Storing multiple options**: Since we need three choices (`rock`, `paper`, and `scissors`), an array is the best way to group them.
3. **Efficient access**: The array allows us to access any of the three choices using an index (`choices[index]`).
4. **Random selection**: The `Random` class (line 14) generates an index between 0 and 2, allowing the program to pick a random choice for the computer.
5. **Memory allocation**: The array helps store multiple strings efficiently in memory as a single entity.
6. **Better readability**: Instead of using multiple variables (e.g., `String choice1 = "rock";`, `String choice2 = "paper";`), an array keeps the code cleaner.
7. **Easy expansion**: If we want to add more choices in the future (e.g., "lizard", "spock"), we can simply extend the array.
8. **Loop-friendly**: Arrays are useful if we need to loop through all the choices.
9. **Type safety**: The array ensures that only `String` values are stored, preventing accidental type mismatches.
10.   **Direct initialization**: Using `{ "rock", "paper", "scissors" }`, we can assign values directly without calling `new String[3]`.
11.   **Code simplicity**: The array simplifies logic when comparing user input and computer choice.

This is why we use `String[] choices` with square brackets in line 11. 🚀
