package ExersicesOfPractic;

public class Student {
    private String name;
    private int ID;

    public Student(String n,int i){
        name=n;
        ID=i;
    }
    public Student(String n){
        name=n;
        ID=12;
    }
    public Student(int i){
        name="Karina";
        ID=i;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}

