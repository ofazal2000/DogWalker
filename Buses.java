/*
 *
 * Write the Buses program inside the main method
 * according to the assignment description.
 * 
 * To compile:
 *        javac Buses.java
 * To execute:
 *        java Buses 7302
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */

public class Buses {
    public static void main(String[] args) {

        int busNum = Integer.parseInt(args[0]);

        if (busNum < 0) {
            System.out.println("error");
        } else {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                sum += busNum % 10; 
                busNum /= 10;
            }
            if (sum % 2 == 0) {
                System.out.println("LX");
            } else {
                System.out.println("H");
            }
        }
    }
}
