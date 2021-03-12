public class Grades {

    private int [] grades;
    private int size;
    private int sumOfGrades;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if(this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int[] getGrades() {
        return grades;
    }

    public int getSize() {
        return size;
    }

    public int countSumOfGrades() {
        getSize();
        getGrades();
        for (int i = 0; i == size; i++) {
            sumOfGrades += grades[i];
        }
        this.sumOfGrades = sumOfGrades;
        return sumOfGrades;
    }
}





