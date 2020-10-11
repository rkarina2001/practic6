package Exersice3OfPractic;

public class MergeSort {
    public static Student[] sortArray(Student[] arrayA) {
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA;
        }
        int len = arrayA.length / 2;
        Student [] arrayB = new Student[len];
        System.arraycopy(arrayA, 0, arrayB, 0, len);
        Student [] arrayC = new Student[arrayA.length - len];
        System.arraycopy(arrayA, len, arrayC, 0, arrayA.length - len);
        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);
        return mergeArray(arrayB, arrayC);
    }

    public static Student[] mergeArray(Student[] a1, Student[] a2) {
        Student[] b = new Student[a1.length + a2.length];
        int position1 = 0;
        int position2 = 0;
        for (int i = 0; i < b.length; i++) {
            if (position1 == a1.length){
                b[i] = a2[position2];
                position2++;
            } else if (position2 == a2.length){
                b[i] = a1[position1];
                position1++;
            } else if (a1[position1].getID() < a2[position2].getID()){
                b[i] = a1[position1];
                position1++;
            } else {
                b[i] = a2[position2];
                position2++;
            }
        }
        return b;
    }
}

