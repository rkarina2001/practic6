package Exersice3OfPractic;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Exersice3OfPractic.Student[] students1 = new Exersice3OfPractic.Student[4];
        students1[0] = new Exersice3OfPractic.Student("Зинаида", 14);
        students1[1] = new Exersice3OfPractic.Student("Мария", 12);
        students1[2] = new Exersice3OfPractic.Student("Иван", 25);
        students1[3] = new Exersice3OfPractic.Student("Валентин", 31);

        Exersice3OfPractic.Student[] students2 = new Exersice3OfPractic.Student[4];
        students2[0] = new Exersice3OfPractic.Student("Паулина", 11);
        students2[1] = new Exersice3OfPractic.Student("Василий", 14);
        students2[2] = new Exersice3OfPractic.Student("Эмануил", 21);
        students2[3] = new Exersice3OfPractic.Student("Инакентий", 31);
        students1 = MergeSort.sortArray(students1);
        students2 = MergeSort.sortArray(students2);
        Student[] student3 = MergeSort.mergeArray(students1, students2);
        System.out.println("\n"+"Имя        ID");
        System.out.println("------------------------------------------------------------");
        for ( int i = 0; i < student3.length; ++i )
            System.out.println("\n"+student3[i].getName()+" "+student3[i].getID());
        System.out.println("------------------------------------------------------------");
    }
}
