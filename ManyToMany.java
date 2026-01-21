import java.util.Scanner;

class Passport {
    int passportNum;
    String nationality;

    Passport(int passportNum, String nationality) {
        this.passportNum = passportNum;
        this.nationality = nationality;
    }
}

class Person {
    int personId;
    String name;
    Passport pass;

    Person(int personId, String name, Passport pass) {
        this.personId = personId;
        this.name = name;
        this.pass = pass;
    }
}

public class ManyToMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons:");
        int n = sc.nextInt();
        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Person ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Passport Number: ");
            int passNum = sc.nextInt();
            System.out.print("Nationality: ");
            String nation = sc.next();

            Passport p = new Passport(passNum, nation);
            persons[i] = new Person(id, name, p);
        }

        System.out.println("Enter Person ID to search:");
        int searchId = sc.nextInt();
        boolean found = false;

        for (Person p : persons) {
            if (p.personId == searchId) {
                System.out.println("Person Found:");
                System.out.println("ID: " + p.personId);
                System.out.println("Name: " + p.name);
                System.out.println("Passport Number: " + p.pass.passportNum);
                System.out.println("Nationality: " + p.pass.nationality);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Person with ID " + searchId + " not found.");
        }
        sc.close();
    }
}