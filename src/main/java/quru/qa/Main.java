package quru.qa;

public class Main {

        public static void main(String[] args){
            Operation operation = new Operation();
            System.out.println("Всем привет");
            operation
                    .name()
                    .firstName()
                    .middleName()
                    .workAxperience()
                    .salaryWork()
                    .mortgage();

        }
    }
