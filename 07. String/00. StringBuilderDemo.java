/**
 * StringBuilderDemo.java
 * 
 * This file explains the complete concept of StringBuilder in Java.
 * 
 * StringBuilder is used to create mutable strings — strings that can be changed 
 * without creating a new object every time. This is efficient for many modifications.
 * 
 * This demo shows how to use key StringBuilder methods with detailed comments.
 */

public class StringBuilderDemo {
    public static void main(String[] args) {      
        // 1. Creating StringBuilder objects
        
        // Empty StringBuilder with default capacity (16 characters)
        StringBuilder sb1 = new StringBuilder();      
        // StringBuilder initialized with a string
        StringBuilder sb2 = new StringBuilder("Hello");
        
        // Print initial values
        System.out.println("Initial sb1 (empty): '" + sb1 + "'");
        System.out.println("Initial sb2: '" + sb2 + "'");

        // 2. Appending strings and characters
        // append() adds text or characters at the end efficiently
        
        sb2.append(" World");    // Append a string
        sb2.append('!');         // Append a character        
        System.out.println("After append: " + sb2);  // Hello World!
        
        // 3. Inserting text at a specific position
        // insert(index, text) adds text at given index, shifting others right
        
        sb2.insert(5, ",");  // Insert a comma after "Hello"     
        System.out.println("After insert: " + sb2);  // Hello, World!
        
        // 4. Deleting part of the string
        // delete(startIndex, endIndex) removes characters from start to end-1
        
        sb2.delete(5, 6);  // Remove the comma we just added      
        System.out.println("After delete: " + sb2);  // Hello World!
        
        // 5. Replacing part of the string
        // replace(startIndex, endIndex, replacement) substitutes substring
        
        sb2.replace(6, 11, "Java");  // Replace "World" with "Java"        
        System.out.println("After replace: " + sb2);  // Hello Java!
        
        // 6. Reversing the entire string
        // reverse() reverses all characters in the StringBuilder
        
        sb2.reverse();        
        System.out.println("After reverse: " + sb2);  // !avaJ olleH
        
        // 7. Converting StringBuilder back to String
        // toString() gives the final immutable string
        
        String finalString = sb2.toString();        
        System.out.println("Final String: " + finalString);  // !avaJ olleH

        // 8. Chaining method calls
        // You can chain methods since they return the StringBuilder object itself
        
        StringBuilder sb3 = new StringBuilder();        
        sb3.append("Java")
           .append(" is ")
           .append("awesome")
           .insert(4, " really")
           .replace(0, 4, "Python");
        
        System.out.println("Chained calls result: " + sb3);  // Python really is awesome
    }
}

/*
Summary:

- StringBuilder is mutable and efficient for modifying strings.
- Use append() to add at the end.
- Use insert() to add at any position.
- Use delete() to remove characters.
- Use replace() to substitute part of the string.
- Use reverse() to reverse the string.
- Use toString() to get the final immutable String.
- Supports method chaining for concise code.

Use StringBuilder when you have many string modifications to save time and memory.
*/
