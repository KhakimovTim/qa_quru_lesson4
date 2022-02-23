package quru.qa;

import java.util.Scanner;
public class Operation {
    private String lastname;
    private String firstname;
    private String middlename;
    private Byte age;
    private Short experience;
    private Long salary;

    Scanner scanner = new Scanner(System.in);
    public Operation name() {
        System.out.println("Введите свою фамилию: ");
        lastname = scanner.nextLine();
        return this;
    }
    public Operation firstName(){
        System.out.println("Введите свою имя: ");
        firstname = scanner.nextLine();
        return this;
    }
    public Operation middleName(){
        System.out.println("Введите свою отчество: ");
        middlename = scanner.nextLine();
        return this;
    }
    public Operation workAxperience() {
        System.out.println("Введите свой опыт работы: ");
        experience = Short.valueOf(scanner.nextLine());
        return this;
    }
    public Operation salaryWork() {
        System.out.println("Введите свою заработную плату: ");
        salary = Long.valueOf(scanner.nextLine());
        return this;
    }
    public void mortgage(){
        if (salary>=40000 && age>3){
            System.out.println("Уважаемый " + lastname + ' ' + firstname + ' ' + middlename + ' ' + "вам одобрена ипотека!");
        }
        else {System.out.println("Уважаемый " + lastname + ' ' + firstname + ' ' + middlename + ' ' + "мы вынуждены вам отказать!");}
    }
}
