package Exersice2OfPractic;

import Exersice3OfPractic.MergeSort;
import Exersice3OfPractic.Student;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Exersice2OfPractic.Student[] students2 = new Exersice2OfPractic.Student[4];
        students2[0] = new Exersice2OfPractic.Student("Зинаида", 4.5);
        students2[1] = new Exersice2OfPractic.Student("Мария",3.2);
        students2[2] = new Exersice2OfPractic.Student("Иван", 2.7);
        students2[3] = new Exersice2OfPractic.Student("Валентин",5.0);

        Arrays.sort(students2, new SortingStudentsByGrade());

        System.out.println("\n"+"Имя        ID");
        System.out.println("------------------------------------------------------------");
        for ( int i = 0; i < students2.length; ++i )
            System.out.println("\n"+students2[i].getName()+" "+students2[i].getScore());
        System.out.println("------------------------------------------------------------");
    }
}