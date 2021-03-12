public class Grades {

    private int [] grades;
    private int size;


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

    public int returnLastAdded() {
        int lastAdded = grades[size-1];
        return lastAdded;
    }

    public float countAverageOfGrades() {
        int sumOfGrades = 0;
        for (int i = 0; i <= size; i++) {
            sumOfGrades += grades[i];
        }
        float averageOfGrades = (sumOfGrades / size);
        return averageOfGrades;
    }

}





