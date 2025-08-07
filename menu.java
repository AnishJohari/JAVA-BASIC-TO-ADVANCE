import java.util.Scanner;

public class menu {
    public static void main(String args[]) {
        String[] array_name = new String[5];
        int[] array_section = new int[5];
        int[] array_roll_no = new int[5];
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n********** MENU **********");
            System.out.println("1. ADD DATA");
            System.out.println("2. UPDATE DATA");
            System.out.println("3. SHOW DATA");
            System.out.println("4. REMOVE DATA");
            System.out.println("5. EXIT");
            System.out.println("***************************");
            System.out.print("ENTER YOUR CHOICE: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume the leftover newline

            if (choice == 1) {
                for (int i = 0; i < 5; i++) {
                    System.out.print("ENTER NAME: ");
                    array_name[i] = input.nextLine();
                    System.out.print("ENTER SECTION: ");
                    array_section[i] = input.nextInt();
                    System.out.print("ENTER ROLL NUMBER: ");
                    array_roll_no[i] = input.nextInt();
                    input.nextLine(); // Consume leftover newline
                }

            } else if (choice == 2) {
                System.out.print("ENTER ROLL NUMBER TO UPDATE: ");
                int updation = input.nextInt();
                input.nextLine();

                boolean found = false;
                for (int i = 0; i < 5; i++) {
                    if (array_roll_no[i] == updation) {
                        found = true;
                        System.out.print("ENTER 1 FOR NAME, 2 FOR SECTION, 3 FOR ROLL NUMBER: ");
                        int update = input.nextInt();
                        input.nextLine();

                        if (update == 1) {
                            System.out.print("ENTER NEW NAME: ");
                            array_name[i] = input.nextLine();
                        } else if (update == 2) {
                            int new_section;
                            while (true) {
                                System.out.print("ENTER NEW SECTION (1-12): ");
                                new_section = input.nextInt();
                                if (new_section >= 1 && new_section <= 12) {
                                    array_section[i] = new_section;
                                    break;
                                } else {
                                    System.out.println("INVALID SECTION. TRY AGAIN.");
                                }
                            }
                        } else if (update == 3) {
                            System.out.print("ENTER NEW ROLL NUMBER: ");
                            array_roll_no[i] = input.nextInt();
                        } else {
                            System.out.println("INVALID OPTION.");
                        }
                        break;
                    }
                }

                if (!found) {
                    System.out.println("STUDENT NOT FOUND.");
                }

            } else if (choice == 3) {
                System.out.print("ENTER ROLL NUMBER TO VIEW DATA: ");
                int roll = input.nextInt();
                boolean found = false;
                for (int i = 0; i < 5; i++) {
                    if (array_roll_no[i] == roll) {
                        System.out.println("ROLL: " + array_roll_no[i]);
                        System.out.println("NAME: " + array_name[i]);
                        System.out.println("SECTION: " + array_section[i]);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("STUDENT NOT FOUND.");
                }

            } else if (choice == 4) {
                System.out.print("ENTER ROLL NUMBER TO DELETE: ");
                int del = input.nextInt();
                boolean found = false;
                for (int i = 0; i < 5; i++) {
                    if (array_roll_no[i] == del) {
                        array_name[i] = "";
                        array_section[i] = 0;
                        array_roll_no[i] = 0;
                        System.out.println("STUDENT DATA DELETED.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("STUDENT NOT FOUND.");
                }

            } else if (choice == 5) {
                System.out.println("EXITING...");
                break;

            } else {
                System.out.println("INVALID CHOICE. TRY AGAIN.");
            }
        }

        input.close();
    }
}
