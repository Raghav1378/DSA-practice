# /\*

# 📘 README: Strings and StringBuilder in Java

## 🔹 STRING OVERVIEW

1. A String in Java is a sequence of characters enclosed in double quotes.
   Example: String s = "Hello";

2. Strings are IMMUTABLE.
   ➤ Once created, their content cannot be changed.
   ➤ Every modification (concat, replace, etc.) creates a new object.

3. Common String Functions:

   - length() → returns length
   - charAt(i) → get character at position i
   - substring(start, end) → get part of string
   - indexOf(ch) → index of character
   - equals(s2) → compare two strings (case-sensitive)
   - equalsIgnoreCase(s2) → compare ignoring case
   - toUpperCase() / toLowerCase()
   - trim() → remove spaces at start and end
   - split(" ") → split into array
   - replace("a","b") → replace characters

4. When to use String:
   ➤ When you only need to READ, CHECK, or COMPARE strings
   ➤ Examples: palindrome check, counting, comparisons, etc.

---

## 🔹 STRINGBUILDER OVERVIEW

1. StringBuilder is a mutable (modifiable) sequence of characters.
   Example: StringBuilder sb = new StringBuilder("Hello");

2. You can modify it directly without creating new objects (more memory-efficient).

3. Common StringBuilder Functions:

   - append(str) → add to the end
   - insert(i, str) → insert at position i
   - replace(start, end, str) → replace a part
   - delete(start, end) → delete a part
   - deleteCharAt(i) → delete one character
   - reverse() → reverse the string
   - setCharAt(i, ch) → change a specific character
   - length() → get length

4. When to use StringBuilder:
   ➤ When you need to MODIFY a string frequently
   ➤ Examples: removing duplicates, reversing, building long strings, etc.

---

## 🔹 CODE EXAMPLES

\*/

public class String_vs_StringBuilder {

    public static void main(String[] args) {

        // =====================================
        // 1️⃣ String Basic Operations
        // =====================================
        System.out.println("=== String Examples ===");
        String s = "  Hello Java  ";
        System.out.println("Original: '" + s + "'");
        System.out.println("Length: " + s.length());
        System.out.println("Trimmed: '" + s.trim() + "'");
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Character at index 2: " + s.charAt(2));
        System.out.println("Substring(2,7): " + s.substring(2, 7));
        System.out.println("Replace 'l' with 'x': " + s.replace("l", "x"));
        System.out.println("Split Example:");
        String[] parts = s.trim().split(" ");
        for (String p : parts) {
            System.out.println(p);
        }

        // =====================================
        // 2️⃣ String Palindrome Check
        // =====================================
        System.out.println("\n=== Palindrome Check ===");
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        // =====================================
        // 3️⃣ StringBuilder Basic Operations
        // =====================================
        System.out.println("\n=== StringBuilder Examples ===");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(2, "YY");
        System.out.println("After insert: " + sb);

        sb.replace(1, 3, "AA");
        System.out.println("After replace: " + sb);

        sb.delete(1, 3);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sb.reverse(); // reverse back
        sb.setCharAt(0, 'Y');
        System.out.println("After setCharAt: " + sb);

        // =====================================
        // 4️⃣ Remove Duplicates Using Only StringBuilder
        // =====================================
        System.out.println("\n=== Remove Duplicates (Only StringBuilder) ===");
        StringBuilder dup = new StringBuilder("programming");

        for (int i = 0; i < dup.length(); i++) {
            char ch = dup.charAt(i);
            for (int j = i + 1; j < dup.length(); j++) {
                if (dup.charAt(j) == ch) {
                    dup.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.println("Without duplicates: " + dup);

        // =====================================
        // 5️⃣ Frequency of a Character
        // =====================================
        System.out.println("\n=== Frequency of a Character ===");
        String text = "hello";
        char target = 'l';
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Frequency of '" + target + "' = " + count);

        // =====================================
        // 6️⃣ When to Use What (Summary)
        // =====================================
        System.out.println("\n=== Quick Summary ===");
        System.out.println("Use String → when reading, comparing, checking (immutable).");
        System.out.println("Use StringBuilder → when modifying text repeatedly (mutable).");
    }

}

# /\*

# ✅ OUTPUT SAMPLE (for reference)

=== String Examples ===
Original: ' Hello Java '
Length: 13
Trimmed: 'Hello Java'
Uppercase: HELLO JAVA
Character at index 2: H
Substring(2,7): Hello
Replace 'l' with 'x': Hexxo Java  
Split Example:
Hello
Java

=== Palindrome Check ===
madam is a Palindrome

=== StringBuilder Examples ===
After append: Hello World
After insert: HeYYllo World
After replace: HAAlo World
After delete: Hlo World
After reverse: dlroW olH
After setCharAt: Ylo World

=== Remove Duplicates (Only StringBuilder) ===
Without duplicates: progamin

=== Frequency of a Character ===
Frequency of 'l' = 2

=== Quick Summary ===
Use String → when reading, comparing, checking (immutable).
Use StringBuilder → when modifying text repeatedly (mutable).
========================================================
\*/
