package PhoneApp;

import java.util.Scanner;

public class PhoneApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 -> For English");
        System.out.println("Press 2 -> For Yoruba");
        System.out.println("Press 3 -> For Igbo");
        System.out.println("Press 4 -> For Hausa");

        int lang = input.nextInt();

        switch (lang) {
            case 1 -> System.out.println("English");
            case 2 -> System.out.println("Yoruba");
            case 3 -> System.out.println("Igbo");
            case 4 -> System.out.println("Hausa");
        }
        System.out.println("");


        String[] phoneMenu = {"Press 1 -> Phone book","Press 2 -> Messages ","Press 3 -> Chat", "Press 4 -> Call register", "Press 5 -> Tones", "Press 6 -> Settings",
                "Press 7 -> Call divert", "Press 8 -> Games","Press 9 -> Calculator","Press 10 -> Reminder","Press 11 -> Clock",
                "Press 12 -> Profiles","Press 13 -> Sim services"};
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],phoneMenu[3],phoneMenu[4],
                phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);

        for (int count = 0; count < 2; count--) {
            int menu = input.nextInt();
            System.out.println("");


            switch (menu) {
                case 1 -> {
                    String[] phoneBook = {"Press 1 -> Search","Press 2 -> Service Nos","Press 3 -> Add name","Press 4 -> Erase",
                            "Press 5 -> Edit","Press 6 -> Assign tone","Press 7 -> Send b'card","Press 8 -> Options","Press 9 -> Speed dials",
                            "Press 10 -> Voice tags","Press 11 -> Back"};
                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",phoneBook[0],phoneBook[1],phoneBook[2],phoneBook[3],phoneBook[4],
                            phoneBook[5],phoneBook[6],phoneBook[7],phoneBook[8],phoneBook[9],phoneBook[10]);


                    int enter = input.nextInt();
                    switch (enter) {
                        case 1 -> {
                            System.out.println("Search");
                            System.out.println("Press 1 -> Back");

                            int search = input.nextInt();
                            switch (search){
                                case 1 ->{
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",phoneBook[0],phoneBook[1],phoneBook[2],phoneBook[3],phoneBook[4],
                                            phoneBook[5],phoneBook[6],phoneBook[7],phoneBook[8],phoneBook[9],phoneBook[10]);
                                    int entered = input.nextInt();
                                    switch (entered){
                                        case 1 -> {
                                            System.out.println("Search");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Service Nos");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Add name");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Erase");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Edit");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Assign tone");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Send b'card");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Type of view");
                                            System.out.println("Memory status");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Speed dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Voice dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                    }
                                }
                            }

                        }
                        case 2 -> {
                            System.out.println("Service Nos");
                            System.out.println("Press 1 -> Back");

                            int search = input.nextInt();
                            switch (search){
                                case 1 ->{
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",phoneBook[0],phoneBook[1],phoneBook[2],phoneBook[3],phoneBook[4],
                                            phoneBook[5],phoneBook[6],phoneBook[7],phoneBook[8],phoneBook[9],phoneBook[10]);
                                    int entered = input.nextInt();
                                    switch (entered){
                                        case 1 -> {
                                            System.out.println("Search");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Service Nos");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Add name");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Erase");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Edit");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Assign tone");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Send b'card");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Type of view");
                                            System.out.println("Memory status");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Speed dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Voice dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                    }
                                }
                            }
                        }
                        case 3 -> {

                            System.out.println("Add name");
                            System.out.println("Press 1 -> Back");

                            int search = input.nextInt();
                            switch (search){
                                case 1 ->{
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",phoneBook[0],phoneBook[1],phoneBook[2],phoneBook[3],phoneBook[4],
                                            phoneBook[5],phoneBook[6],phoneBook[7],phoneBook[8],phoneBook[9],phoneBook[10]);
                                    int entered = input.nextInt();
                                    switch (entered){
                                        case 1 -> {
                                            System.out.println("Search");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Service Nos");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Add name");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Erase");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Edit");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Assign tone");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Send b'card");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Type of view");
                                            System.out.println("Memory status");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Speed dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Voice dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                    }
                                }
                            }
                        }
                        case 4 -> {
                            System.out.println("Erase");
                            System.out.println("Press 1 -> Back");

                            int search = input.nextInt();
                            switch (search){
                                case 1 ->{
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",phoneBook[0],phoneBook[1],phoneBook[2],phoneBook[3],phoneBook[4],
                                            phoneBook[5],phoneBook[6],phoneBook[7],phoneBook[8],phoneBook[9],phoneBook[10]);
                                    int entered = input.nextInt();
                                    switch (entered){
                                        case 1 -> {
                                            System.out.println("Search");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Service Nos");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Add name");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Erase");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Edit");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Assign tone");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Send b'card");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Type of view");
                                            System.out.println("Memory status");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Speed dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Voice dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                    }
                                }
                            }
                        }
                        case 5 -> {
                            System.out.println("Edit");
                            System.out.println("Press 1 -> Back");

                            int search = input.nextInt();
                            switch (search){
                                case 1 ->{
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",phoneBook[0],phoneBook[1],phoneBook[2],phoneBook[3],phoneBook[4],
                                            phoneBook[5],phoneBook[6],phoneBook[7],phoneBook[8],phoneBook[9],phoneBook[10]);
                                    int entered = input.nextInt();
                                    switch (entered){
                                        case 1 -> {
                                            System.out.println("Search");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Service Nos");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Add name");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Erase");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Edit");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Assign tone");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Send b'card");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Type of view");
                                            System.out.println("Memory status");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Speed dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Voice dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                    }
                                }
                            }
                        }
                        case 6 -> {
                            System.out.println("Assign tone");
                            System.out.println("Press 1 -> Back");

                            int search = input.nextInt();
                            switch (search){
                                case 1 ->{
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",phoneBook[0],phoneBook[1],phoneBook[2],phoneBook[3],phoneBook[4],
                                            phoneBook[5],phoneBook[6],phoneBook[7],phoneBook[8],phoneBook[9],phoneBook[10]);
                                    int entered = input.nextInt();
                                    switch (entered){
                                        case 1 -> {
                                            System.out.println("Search");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Service Nos");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Add name");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Erase");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Edit");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Assign tone");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Send b'card");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Type of view");
                                            System.out.println("Memory status");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Speed dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Voice dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                    }
                                }
                            }
                        }
                        case 7 -> {
                            System.out.println("Send b'card");
                            System.out.println("Press 1 -> Back");

                            int search = input.nextInt();
                            switch (search){
                                case 1 ->{
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",phoneBook[0],phoneBook[1],phoneBook[2],phoneBook[3],phoneBook[4],
                                            phoneBook[5],phoneBook[6],phoneBook[7],phoneBook[8],phoneBook[9],phoneBook[10]);
                                    int entered = input.nextInt();
                                    switch (entered){
                                        case 1 -> {
                                            System.out.println("Search");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Service Nos");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Add name");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Erase");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Edit");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Assign tone");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Send b'card");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Type of view");
                                            System.out.println("Memory status");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Speed dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Voice dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                    }
                                }
                            }
                        }
                        case 8 -> {
                            System.out.println("Type of view");
                            System.out.println("Memory status");
                            System.out.println("Press 1 -> Back");


                            int options = input.nextInt();

                            switch (options) {
                                case 1 -> {
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneBook[0], phoneBook[1], phoneBook[2], phoneBook[3], phoneBook[4],
                                            phoneBook[5], phoneBook[6], phoneBook[7], phoneBook[8], phoneBook[9], phoneBook[10]);
                                    int enterred = input.nextInt();
                                    switch (enterred){
                                        case 1 -> System.out.println("Search");
                                        case 2 -> System.out.println("Service Nos");
                                        case 3 -> System.out.println("Add name");
                                        case 4 -> System.out.println("Erase");
                                        case 5 -> System.out.println("Edit");
                                        case 6 -> System.out.println("Assign tone");
                                        case 7 -> System.out.println("Send b'card");
                                        case 8 -> {
                                            System.out.println("Type of view");
                                            System.out.println("Memory status");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> System.out.println("Speed dials");
                                        case 10 -> System.out.println("Voice dials");
                                        case 11 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                    }
                                }
                                }


                        }
                        case 9 -> {
                            System.out.println("Speed dials");
                            System.out.println("Press 1 -> Back");

                            int search = input.nextInt();
                            switch (search){
                                case 1 ->{
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",phoneBook[0],phoneBook[1],phoneBook[2],phoneBook[3],phoneBook[4],
                                            phoneBook[5],phoneBook[6],phoneBook[7],phoneBook[8],phoneBook[9],phoneBook[10]);
                                    int entered = input.nextInt();
                                    switch (entered){
                                        case 1 -> {
                                            System.out.println("Search");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Service Nos");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Add name");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Erase");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Edit");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Assign tone");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Send b'card");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Type of view");
                                            System.out.println("Memory status");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Speed dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Voice dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                    }
                                }
                            }
                        }
                        case 10 -> {
                            System.out.println("Voice dials");
                            System.out.println("Press 1 -> Back");

                            int search = input.nextInt();
                            switch (search){
                                case 1 ->{
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",phoneBook[0],phoneBook[1],phoneBook[2],phoneBook[3],phoneBook[4],
                                            phoneBook[5],phoneBook[6],phoneBook[7],phoneBook[8],phoneBook[9],phoneBook[10]);
                                    int entered = input.nextInt();
                                    switch (entered){
                                        case 1 -> {
                                            System.out.println("Search");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Service Nos");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Add name");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Erase");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Edit");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Assign tone");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Send b'card");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Type of view");
                                            System.out.println("Memory status");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Speed dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Voice dials");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                    }
                                }
                            }
                        }
                        case 11 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);

                    }

                }
                case 2 -> {
                    String[] messages = {"Press 1 -> Write messages", "Press 2 -> Inbox","Press 3 -> Outbox","Press 4 -> Picture messages",
                            "Press 5 -> Templates","Press 6 -> Smileys","Press 7 -> Message settings","Press 8 -> Info service","Press 9 -> Voice mailbox setting",
                            "Press 10 -> Service command editor","Press 11 -> Back"};
                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", messages[0],messages[1],messages[2],messages[3],messages[4],messages[5],
                            messages[6],messages[7],messages[8],messages[9],messages);

                    int enter = input.nextInt();
                    switch (enter) {
                        case 1 -> {
                            System.out.println("Write messages");
                            System.out.println("Press 1 -> Back");

                            int enterd = input.nextInt();
                            switch (enterd){
                                case 1 -> {
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", messages[0],messages[1],messages[2],messages[3],messages[4],messages[5],
                                            messages[6],messages[7],messages[8],messages[9],messages);
                                    int enterred = input.nextInt();
                                    switch (enterred){
                                        case 1 -> {
                                            System.out.println("Write messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Inbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Outbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Picture messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Templates");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Smileys");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Press 1 -> Set 1");
                                            System.out.println("Press 2 -> Common");
                                            System.out.println("Press 3 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Info service");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Voice mailbox setting");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Service command editor");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> {
                                            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                    phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                        }
                                    }
                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("Inbox");
                            System.out.println("Press 1 -> Back");

                            int enterd = input.nextInt();
                            switch (enterd){
                                case 1 -> {
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", messages[0],messages[1],messages[2],messages[3],messages[4],messages[5],
                                            messages[6],messages[7],messages[8],messages[9],messages);
                                    int enterred = input.nextInt();
                                    switch (enterred){
                                        case 1 -> {
                                            System.out.println("Write messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Inbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Outbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Picture messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Templates");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Smileys");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Press 1 -> Set 1");
                                            System.out.println("Press 2 -> Common");
                                            System.out.println("Press 3 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Info service");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Voice mailbox setting");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Service command editor");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> {
                                            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                    phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                        }
                                    }
                                }
                            }
                        }
                        case 3 -> {
                            System.out.println("Outbox");
                            System.out.println("Press 1 -> Back");

                            int enterd = input.nextInt();
                            switch (enterd){
                                case 1 -> {
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", messages[0],messages[1],messages[2],messages[3],messages[4],messages[5],
                                            messages[6],messages[7],messages[8],messages[9],messages);
                                    int enterred = input.nextInt();
                                    switch (enterred){
                                        case 1 -> {
                                            System.out.println("Write messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Inbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Outbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Picture messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Templates");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Smileys");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Press 1 -> Set 1");
                                            System.out.println("Press 2 -> Common");
                                            System.out.println("Press 3 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Info service");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Voice mailbox setting");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Service command editor");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> {
                                            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                    phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                        }
                                    }
                                }
                            }
                        }
                        case 4 -> {
                            System.out.println("Picture messages");
                            System.out.println("Press 1 -> Back");

                            int enterd = input.nextInt();
                            switch (enterd){
                                case 1 -> {
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", messages[0],messages[1],messages[2],messages[3],messages[4],messages[5],
                                            messages[6],messages[7],messages[8],messages[9],messages);
                                    int enterred = input.nextInt();
                                    switch (enterred){
                                        case 1 -> {
                                            System.out.println("Write messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Inbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Outbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Picture messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Templates");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Smileys");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Press 1 -> Set 1");
                                            System.out.println("Press 2 -> Common");
                                            System.out.println("Press 3 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Info service");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Voice mailbox setting");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Service command editor");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> {
                                            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                    phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                        }
                                    }
                                }
                            }
                        }
                        case 5 -> {
                            System.out.println("Templates");
                            System.out.println("Press 1 -> Back");

                            int enterd = input.nextInt();
                            switch (enterd){
                                case 1 -> {
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", messages[0],messages[1],messages[2],messages[3],messages[4],messages[5],
                                            messages[6],messages[7],messages[8],messages[9],messages);
                                    int enterred = input.nextInt();
                                    switch (enterred){
                                        case 1 -> {
                                            System.out.println("Write messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Inbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Outbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Picture messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Templates");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Smileys");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Press 1 -> Set 1");
                                            System.out.println("Press 2 -> Common");
                                            System.out.println("Press 3 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Info service");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Voice mailbox setting");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Service command editor");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> {
                                            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                    phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                        }
                                    }
                                }
                            }
                        }
                        case 6 -> {
                            System.out.println("Smileys");
                            System.out.println("Press 1 -> Back");

                            int enterd = input.nextInt();
                            switch (enterd){
                                case 1 -> {
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", messages[0],messages[1],messages[2],messages[3],messages[4],messages[5],
                                            messages[6],messages[7],messages[8],messages[9],messages);
                                    int enterred = input.nextInt();
                                    switch (enterred){
                                        case 1 -> {
                                            System.out.println("Write messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Inbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Outbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Picture messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Templates");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Smileys");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Press 1 -> Set 1");
                                            System.out.println("Press 2 -> Common");
                                            System.out.println("Press 3 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Info service");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Voice mailbox setting");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Service command editor");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> {
                                            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                    phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                        }
                                    }
                                }
                            }
                        }
                        case 7 -> {
                            String[] settings = {"Press 1 -> Set 1","Press 2 -> Common","Press 3 -> Back"};
                            System.out.printf("%s%n%s%n%s%n",settings[0],settings[1],settings[2]);
                            int set = input.nextInt();
                            switch (set) {
                                case 1 -> {
                                    System.out.println("Message centre number");
                                    System.out.println("Message sent as");
                                    System.out.println("Message validity");
                                    System.out.println("Press 1 -> Back");

                                    int enterrd = input.nextInt();
                                    switch (enterrd){
                                        case 1 -> {
                                            System.out.printf("%s%n%s%n%s%n",settings[0],settings[1],settings[2]);
                                            int entre = input.nextInt();
                                            switch (entre){
                                                case 3 -> {
                                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", messages[0],messages[1],messages[2],messages[3],messages[4],messages[5],
                                                            messages[6],messages[7],messages[8],messages[9],messages);
                                                    int ent = input.nextInt();
                                                    switch (ent){
                                                        case 1 -> {
                                                            System.out.println("Write messages");
                                                            System.out.println("Press 1 -> Back");
                                                        }
                                                        case 2 -> {
                                                            System.out.println("Inbox");
                                                            System.out.println("Press 1 -> Back");
                                                        }
                                                        case 3 -> {
                                                            System.out.println("Outbox");
                                                            System.out.println("Press 1 -> Back");
                                                        }
                                                        case 4 -> {
                                                            System.out.println("Picture messages");
                                                            System.out.println("Press 1 -> Back");
                                                        }
                                                        case 5 -> {
                                                            System.out.println("Templates");
                                                            System.out.println("Press 1 -> Back");
                                                        }
                                                        case 6 -> {
                                                            System.out.println("Smileys");
                                                            System.out.println("Press 1 -> Back");
                                                        }
                                                        case 7 -> {
                                                            System.out.println("Press 1 -> Set 1");
                                                            System.out.println("Press 2 -> Common");
                                                            System.out.println("Press 3 -> Back");
                                                        }
                                                        case 8 -> {
                                                            System.out.println("Info service");
                                                            System.out.println("Press 1 -> Back");
                                                        }
                                                        case 9 -> {
                                                            System.out.println("Voice mailbox setting");
                                                            System.out.println("Press 1 -> Back");
                                                        }
                                                        case 10 -> {
                                                            System.out.println("Service command editor");
                                                            System.out.println("Press 1 -> Back");
                                                        }
                                                        case 11 -> {
                                                            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                                    phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                case 2 -> {
                                    System.out.println("Delivery reports");
                                    System.out.println("Reply via same centre");
                                    System.out.println("Character support");
                                    System.out.println("Press 1 -> Back");
                                }

                            }
                        }
                        case 8 -> {
                            System.out.println("Info service");
                            System.out.println("Press 1 -> Back");

                            int enterd = input.nextInt();
                            switch (enterd){
                                case 1 -> {
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", messages[0],messages[1],messages[2],messages[3],messages[4],messages[5],
                                            messages[6],messages[7],messages[8],messages[9],messages);
                                    int enterred = input.nextInt();
                                    switch (enterred){
                                        case 1 -> {
                                            System.out.println("Write messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Inbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Outbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Picture messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Templates");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Smileys");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Press 1 -> Set 1");
                                            System.out.println("Press 2 -> Common");
                                            System.out.println("Press 3 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Info service");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Voice mailbox setting");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Service command editor");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> {
                                            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                    phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                        }
                                    }
                                }
                            }
                        }
                        case 9 -> {
                            System.out.println("Voice mailbox setting");
                            System.out.println("Press 1 -> Back");

                            int enterd = input.nextInt();
                            switch (enterd){
                                case 1 -> {
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", messages[0],messages[1],messages[2],messages[3],messages[4],messages[5],
                                            messages[6],messages[7],messages[8],messages[9],messages);
                                    int enterred = input.nextInt();
                                    switch (enterred){
                                        case 1 -> {
                                            System.out.println("Write messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Inbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Outbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Picture messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Templates");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Smileys");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Press 1 -> Set 1");
                                            System.out.println("Press 2 -> Common");
                                            System.out.println("Press 3 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Info service");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Voice mailbox setting");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Service command editor");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> {
                                            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                    phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                        }
                                    }
                                }
                            }
                        }
                        case 10 -> {
                            System.out.println("Service command editor");
                            System.out.println("Press 1 -> Back");

                            int enterd = input.nextInt();
                            switch (enterd){
                                case 1 -> {
                                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", messages[0],messages[1],messages[2],messages[3],messages[4],messages[5],
                                            messages[6],messages[7],messages[8],messages[9],messages);
                                    int enterred = input.nextInt();
                                    switch (enterred){
                                        case 1 -> {
                                            System.out.println("Write messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 2 -> {
                                            System.out.println("Inbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 3 -> {
                                            System.out.println("Outbox");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 4 -> {
                                            System.out.println("Picture messages");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 5 -> {
                                            System.out.println("Templates");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 6 -> {
                                            System.out.println("Smileys");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 7 -> {
                                            System.out.println("Press 1 -> Set 1");
                                            System.out.println("Press 2 -> Common");
                                            System.out.println("Press 3 -> Back");
                                        }
                                        case 8 -> {
                                            System.out.println("Info service");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 9 -> {
                                            System.out.println("Voice mailbox setting");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 10 -> {
                                            System.out.println("Service command editor");
                                            System.out.println("Press 1 -> Back");
                                        }
                                        case 11 -> {
                                            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                                    phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                                        }
                                    }
                                }
                            }
                        }
                        case 11 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);

                    }


                }
                case 3 -> {
                    System.out.println("Chat");
                    System.out.println("Press 1 -> Back");

                    int enter = input.nextInt();
                    if (enter == 1)System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                            phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);

                }
                case 4 -> {
                    System.out.println("Press 1 -> Missed calls");
                    System.out.println("Press 2 -> Recceived calls");
                    System.out.println("Press 3 -> Dialled numbers");
                    System.out.println("Press 4 -> Erase recent call lists");
                    System.out.println("Press 5 -> Show call duration");
                    System.out.println("Press 6 -> Show call list");
                    System.out.println("Press 7 -> Call cost setting");
                    System.out.println("Press 8 -> Prepaid credit");
                    System.out.println("Press 9 -> Back");


                    int entered = input.nextInt();
                    switch (entered) {
                        case 1 -> System.out.println("Missed calls");
                        case 2 -> System.out.println("Received calls");
                        case 3 -> System.out.println("Dialled numbers");
                        case 4 -> System.out.println("Erase recent call lists");
                        case 5 -> {
                            System.out.println("Press 1 -> Last call duration");
                            System.out.println("Press 2 -> All calls' duration");
                            System.out.println("Press 3 -> Received calls' duration");
                            System.out.println("Press 4 -> Dialled calls' duration");
                            System.out.println("Press 5 -> Clear timers");

                            int enter = input.nextInt();
                            switch (enter) {
                                case 1 -> System.out.println("Last call duration");
                                case 2 -> System.out.println("All calls' duration");
                                case 3 -> System.out.println("Received calls duration");
                                case 4 -> System.out.println("Dialled calls duration");
                                case 5 -> System.out.println("Clear timers");
                            }
                        }
                        case 6 -> {
                            System.out.println("Press 1 -> Last calls' cost");
                            System.out.println("Press 2 -> All calls' cost");
                            System.out.println("Press 3 -> Clear counters");

                            int enter = input.nextInt();
                            switch (enter) {
                                case 1 -> System.out.println("Last calls' cost");
                                case 2 -> System.out.println("All calls' cost");
                                case 3 -> System.out.println("Clear counters");
                            }
                        }
                        case 7 -> {
                            System.out.println("Press 1 -> Call cost limit");
                            System.out.println("Press 2 -> Show costs in");

                            int enter = input.nextInt();
                            switch (enter) {
                                case 1 -> System.out.println("Call cost limit");
                                case 2 -> System.out.println("Show costs in");
                            }
                        }
                        case 8 -> System.out.println("Prepaid credit");
                        case 9 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);


                    }


                }
                case 5 -> {
                    System.out.println("Press 1 -> Tones");
                    int enter = input.nextInt();
                    switch (enter) {
                        case 1 -> {
                            System.out.println("Press 1 -> Ring tones");
                            System.out.println("Press 2 -> Ringing volume");
                            System.out.println("Press 3 -> Incoming call alert");
                            System.out.println("Press 4 -> Composer");
                            System.out.println("Press 5 -> Message alert tone");
                            System.out.println("Press 6 -> Keypad tone");
                            System.out.println("Press 7 -> Warning and game tone");
                            System.out.println("Press 8 -> Vibrating");
                            System.out.println("Press 9 -> Screen saver");
                            System.out.println("Press 10 -> Back");

                            int entered = input.nextInt();
                            switch (entered) {
                                case 1 -> System.out.println("Ring tones");
                                case 2 -> System.out.println("Ringing volume");
                                case 3 -> System.out.println("Incoming call alert");
                                case 4 -> System.out.println("Composer");
                                case 5 -> System.out.println("Message alert tone");
                                case 6 -> System.out.println("Keypad tone");
                                case 7 -> System.out.println("Warning and game tone");
                                case 8 -> System.out.println("Vibrating");
                                case 9 -> System.out.println("Screen save");
                                case 10 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                        phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);

                            }
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Press 1 -> Call settings");
                    System.out.println("Press 2 -> Phone settings");
                    System.out.println("Press 3 -> Security settings");
                    System.out.println("Press 4 -> Restore facytory settings");
                    System.out.println("Press -> 5 Back");

                    int entered = input.nextInt();
                    switch (entered) {
                        case 1 -> {
                            System.out.println("Press 1 -> Automatic redial");
                            System.out.println("Press 2 -> Speed dialling");
                            System.out.println("Press 3 -> Call waiting options");
                            System.out.println("Press 4 -> Own number sending");
                            System.out.println("Press 5 -> Phone line in use automatic answer");

                            int enter = input.nextInt();
                            switch (enter) {
                                case 1 -> System.out.println("Automatic redial");
                                case 2 -> System.out.println("Speed dialling");
                                case 3 -> System.out.println("Call waiting options");
                                case 4 -> System.out.println("Own number sending");
                                case 5 -> System.out.println("Phone line in use automatic answer");
                            }
                        }
                        case 2 -> {
                            System.out.println("Press 1 -> Language");
                            System.out.println("Press 2 -> Cell info");
                            System.out.println("Press 3 -> Welcome note");
                            System.out.println("Press 4 -> Network selection");
                            System.out.println("Press 5 -> Lights");
                            System.out.println("Press 6 -> Confirm SIM service actions");

                            int enter = input.nextInt();
                            switch (enter) {
                                case 1 -> System.out.println("Language");
                                case 2 -> System.out.println("Cell info");
                                case 3 -> System.out.println("Welcome note");
                                case 4 -> System.out.println("Network selection");
                                case 5 -> System.out.println("Lights");
                                case 6 -> System.out.println("Confirm SIM service actions");
                            }
                        }
                        case 3 -> {
                            System.out.println("Press 1 -> PIN code request");
                            System.out.println("Press 2 -> Call barring service");
                            System.out.println("Press 3 -> Fixed dialling");
                            System.out.println("Press 4 -> Closed user group");
                            System.out.println("Press 5 -> Phone security");
                            System.out.println("Press 6 -> Change access code");

                            int enter = input.nextInt();
                            switch (enter) {
                                case 1 -> System.out.println("PIN code request");
                                case 2 -> System.out.println("Call barring service");
                                case 3 -> System.out.println("Fixed dialling");
                                case 4 -> System.out.println("Closed user group");
                                case 5 -> System.out.println("Phone security");
                                case 6 -> System.out.println("Change access code");
                            }
                        }
                        case 4 -> {
                            System.out.println("Restore factory settings");
                        }
                        case 5 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);

                    }
                }
                case 7 ->{
                    System.out.println("Call divert");
                    System.out.println("Press 1 -> Back");

                    int enter = input.nextInt();
                    if (enter == 1)System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                            phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                }
                case 8 ->{
                    System.out.println("Games");
                    System.out.println("Press 1 -> Back");

                    int enter = input.nextInt();
                    if (enter == 1)System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                            phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                }
                case 9 ->{
                    System.out.println("Calculator");
                    System.out.println("Press 1 -> Back");

                    int entered = input.nextInt();
                    if (entered == 1)System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                            phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                }
                case 10 ->{
                    System.out.println("Reminders");
                    System.out.println("Press 1 -> Back");

                    int entered = input.nextInt();
                    if (entered == 1)System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                            phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                }
                case 11 -> {
                    System.out.println("Press 1 -> Alarm clock");
                    System.out.println("Press 2 -> Clock settings");
                    System.out.println("Press 3 -> Date setting");
                    System.out.println("Press 4 -> Stop watch");
                    System.out.println("Press 5 -> Countdown timer");
                    System.out.println("Press 6 -> Auto update of date and time");
                    System.out.println("Press 7 -> Back");

                    int enter = input.nextInt();
                    switch (enter) {
                        case 1 -> System.out.println("Alarm clock");
                        case 2 -> System.out.println("Clock settings");
                        case 3 -> System.out.println("Date setting");
                        case 4 -> System.out.println("Stop watch");
                        case 5 -> System.out.println("Countdown timer");
                        case 6 -> System.out.println("Auto update of date and time");
                        case 7 -> System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                                phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);

                    }
                }
                case 12 -> {
                    System.out.println("Profiles");
                    System.out.println("Press 1 -> Back");

                    int enter = input.nextInt();
                    if (enter == 1)System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                            phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);

                }
                case 13 -> {
                    System.out.println("SIM Services");
                    System.out.println("Press 1 -> Back");

                    int enter = input.nextInt();
                    if (enter == 1)System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", phoneMenu[0],phoneMenu[1],phoneMenu[2],
                            phoneMenu[3],phoneMenu[4], phoneMenu[5],phoneMenu[6],phoneMenu[7],phoneMenu[8], phoneMenu[9],phoneMenu[10]);
                }
            }


        }


    }
}