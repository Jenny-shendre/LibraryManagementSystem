/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding some books to the library
        library.addBook(new Book("Java Programming", "John Doe"));
        library.addBook(new Book("Python Basics", "Jane Smith"));
        library.addBook(new Book("Data Structures", "Alice Johnson"));

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Display Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.displayAvailableBooks();
                    break;
                case 2:
                  
                  System.out.print("Enter the title of the book you want to borrow: ");
                  scanner.nextLine(); // Consume newline character
                  String title = scanner.nextLine();
                  library.borrowBook(title);
                 break;

                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
