package ExersicesOfPractic;

public class Sort {
    public static void main(String[] args) {
        Student[] students = new Student[8];
        students[0] = new Student("Зинаида", 14);
        students[1] = new Student("Мария", 12);
        students[2] = new Student("Иван", 25);
        students[3] = new Student("Валентин", 31);
        students[4] = new Student("Паулина", 11);
        students[5] = new Student("Василий", 14);
        students[6] = new Student("Эмануил",  21);
        students[7] = new Student("Инакентий", 31);

        for ( int i = 1; i < students.length; ++i ) {
            for ( int j = 0; j < i; ++j ) {
                if ( students[i].getID() < students[j].getID() ) {
                    Student tmp = students[i];
                    for ( int k = i - 1; k >= j; --k )
                        students[k + 1] = students[k];
                    students[j] = tmp;
                }
            }
        }
        System.out.println("\n"+"Имя        ID");
        System.out.println("------------------------------------------------------------");
        for ( int i = 0; i < students.length; ++i )
            System.out.println("\n"+students[i].getName()+" "+students[i].getID());
        System.out.println("------------------------------------------------------------");
    }
}
