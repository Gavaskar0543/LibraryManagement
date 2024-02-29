package myapp;

import java.util.Random;
import java.util.Scanner;

public class User extends Store {
    private String name;
    private int age;
    private String gender;

    public User() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            try {
                System.out.println("Press 1 to Open Account | Press 2 to Login | Press 0 to Exit");
                int userInput = scanner.nextInt();
                
                switch (userInput) {
                    case 1:
                        System.out.println("Opening Account Creation Form");
                        System.out.println("Enter Name:");
                        String nameInput = scanner.next();
                        setName(nameInput);

                        System.out.println("Enter Age:");
                        int ageInput = scanner.nextInt();
                        setAge(ageInput);

                        System.out.println("Enter Gender ('Male' or 'Female'):");
                        String genderInput = scanner.next();
                        setGender(genderInput);
                        //generate password
                        StringBuilder password = passwordGenerator();
                        System.out.println("***Account Creation Successful***");
                        System.out.println("Login Credentials");
                        System.out.println("User Name:"+" "+this.getName()+" | "+"Password:"+""+password);
                        break;
                    case 2:
                        
                        
                        System.out.println("Enter Username:");
                        String name = scanner.next();
                        
                        System.out.println("Enter Password:");
                        String pass = scanner.next();
                        
                        System.out.println(pass);
                        
                        if(pass == "test") {
                        	System.out.println("UserName / password doesn't match");
                        	return;
                        }
                        else {
                        	System.out.println("User Logged in.");
                        }
                        Store library = new Store();
                        library.showBooks();
                        
                        break;
                    case 0:
                        System.out.println("Exiting Application");
                        continueLoop = false;
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Clear the buffer
            }
        }
        
        scanner.close();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    private StringBuilder passwordGenerator() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=<>?";
        
        int length = 8;
        
        // Create a StringBuilder to build the random string
        StringBuilder sb = new StringBuilder();

        // Create a Random object
        Random random = new Random();

        // Generate random characters
        for (int i = 0; i < length; i++) {
            // Get a random index within the range of the characters string
            int randomIndex = random.nextInt(characters.length());

            // Append the character at the random index to the StringBuilder
            sb.append(characters.charAt(randomIndex));
        }
        return sb;

    }
}
