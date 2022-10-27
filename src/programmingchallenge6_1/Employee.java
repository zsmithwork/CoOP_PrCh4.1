package programmingchallenge6_1;

public class Employee {

    private String name;
    private int idNumber;
    private String department;
    private String position;

    Employee(String nm, int id, String dep, String pos){
        name = nm;
        idNumber = id;
        department = dep;
        position = pos;
    }

    Employee(String nm, int id){
        name = nm;
        idNumber = id;
        department = " ";
        position = " ";
    }

    Employee(){
        name = " ";
        idNumber = 0;
        department = " ";
        position = " ";
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return idNumber;
    }

    public String getDep(){
        return department;
    }

    public String getPos(){
        return position;
    }

    public void setName(String s){
        name = s;
    }

    public void setNumber(int i){
        idNumber = i;
    }

    public void setDep(String s){
        department = s;
    }

    public void setPos(String s){
        position = s;
    }
}
