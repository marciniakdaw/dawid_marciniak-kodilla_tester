public class Silnia {
    private int number;
    private int result;

    public void setNumber(int newNumber){
        number = newNumber;
        result();
        }
    public int result(){
        int result1 = 1;
        for (int i = 1; i <= number; i++) {
            result1 = result1 * i;
        }
        this.result = result1;
        return result1;
    }
    public void showResult(){
        System.out.println("Silnia z " + number + " wynosi " + result);
    }
}
