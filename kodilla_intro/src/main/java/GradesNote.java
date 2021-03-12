public class GradesNote {

    public static void main(String[] args) {

       Grades grades = new Grades();

       grades.add(3);
       grades.add(3);
       grades.add(3);
       grades.add(3);
       grades.add(3);
       grades.add(1);

       double average = grades.countAverageOfGrades();
       System.out.println("\nAverage of grades is: " + average);

       int lastAdded = grades.returnLastAdded();
       System.out.println("Last added grade is: " + lastAdded);





    }
}
