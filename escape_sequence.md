In Java, escape sequences are special character combinations used in string literals and character literals to represent certain characters that cannot be directly typed. Each escape sequence starts with a backslash (`\`). Here’s a list of Java escape sequences:

| Escape Sequence | Description                                             |
| --------------- | ------------------------------------------------------- |
| `\b`            | Backspace                                               |
| `\t`            | Tab                                                     |
| `\n`            | Newline (Line Feed)                                     |
| `\r`            | Carriage Return                                         |
| `\f`            | Form Feed                                               |
| `\'`            | Single Quote (used in character literals)               |
| `\"`            | Double Quote (used in string literals)                  |
| `\\`            | Backslash                                               |
| `\uXXXX`        | Unicode character (where `XXXX` is a hexadecimal value) |

### Example:

```java
public class EscapeSequenceExample {
    public static void main(String[] args) {
        System.out.println("Hello\tWorld!");  // Inserts a tab
        System.out.println("Hello\nWorld!");  // Inserts a new line
        System.out.println("She said, \"Java is awesome!\""); // Prints double quotes
        System.out.println("Backslash: \\");  // Prints a backslash
    }
}
```
