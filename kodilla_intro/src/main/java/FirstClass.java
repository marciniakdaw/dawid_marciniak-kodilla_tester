
public class FirstClass {

    public static void main(String[] args) {

        Notebook notebook = new Notebook(500, 1000, 2018, 6, "i5");
        System.out.println("\nThe weight of this notebook is " + notebook.weight + "g and price is " + notebook.price + " PLN"); // [3]
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.ramSizeCheck();
        notebook.processorClassCheck();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2009, 3, "AMD");
        System.out.println("\nThe weight of this notebook is " + heavyNotebook.weight + "g and price is "+ heavyNotebook.price + " PLN");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.ramSizeCheck();
        heavyNotebook.processorClassCheck();

        Notebook oldNotebook = new Notebook(1600, 500, 2020, 16, "i7");
        System.out.println("\nThe weight of this notebook is " + oldNotebook.weight + "g and price is " + oldNotebook.price + " PLN");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.ramSizeCheck();
        oldNotebook.processorClassCheck();
    }
}