public class GradesNote {

    public static void main(String[] args) {

       Grades dodaj = new Grades();
       Grades pobierz = new Grades();

       dodaj.add(3);
       dodaj.add(4);
       dodaj.add(5);
       dodaj.add(6);

       pobierz.getGrades();
       pobierz.getSize();

        var a = pobierz.getGrades();
        int b = pobierz.getSize();

        System.out.println(pobierz.getSize());


    }
}
