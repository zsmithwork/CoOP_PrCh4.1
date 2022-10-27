package programmingchallenge6_1;

public class ProgrammingChallenge6_1 {

    public static void main(String[] args) {

        Employee a = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee b = new Employee("Mark Jones", 39119);
        Employee c = new Employee();

        b.setDep("IT");
        b.setPos("Programmer");

        c.setName("Joy Rogers");
        c.setNumber(81774);
        c.setDep("Manufacturing");
        c.setPos("Engineer");

        System.out.print("Name, ID number, Department, Position");
        System.out.println(a.getName() + ", " + a.getNumber() + ", " + a.getDep() + ", " + a.getPos());
        System.out.println(b.getName() + ", " + b.getNumber() + ", " + b.getDep() + ", " + b.getPos());
        System.out.println(c.getName() + ", " + c.getNumber() + ", " + c.getDep() + ", " + c.getPos());

    }

}
