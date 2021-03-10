public class Notebook {

    int weight;
    int price;
    int year;
    int ramSize;
    String processorClass;

    public Notebook(int weight, int price, int year, int ramSize, String processorClass){
        this.weight = weight;
        this.price = price;
        this.year = year;
        this.ramSize = ramSize;
        this.processorClass = processorClass;
    }

    public void checkPrice(){
        if (price < 600){
            System.out.println("This notebook is very cheap.");
        }
        else if (price <= 1000){
            System.out.println("The price is good.");
        }
        else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight(){
        if (weight < 600){
            System.out.println("This notebook is light.");
        }
        else if (weight <= 1000){
            System.out.println("This notebook is not heavy.");
        }
        else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void ramSizeCheck(){
        if (ramSize < 4){
            System.out.println("This notebook has to small RAM for work.");
        }
        else if (ramSize <= 8){
            System.out.println("This notebook has enough memory space for every day use and work.");
        }
        else {
            System.out.println("This notebook has RAM for professional users.");
        }
    }
    public void processorClassCheck(){

        switch (processorClass){

            case "i3":
                System.out.println("This processor is slow.");
                break;

            case "i5":
                System.out.println("The speed of this processor is medium.");
                break;

            case "i7":
                System.out.println("This processor is fast.");
                break;

            default:
                System.out.println("Unknown processor.");
        }
    }

    public void yearPriceComparison(){
        if (year < 2018 && price > 2000){
            System.out.println("The price of this computer is too high comparing to year of production.");
        }
        else if (year > 2018 && price < 1500){
            System.out.println("This is quite good offer.");
        }
        else if (year > 2020 && (ramSize > 16 || processorClass.equals("i7")) && price < 2500){
            System.out.println("Buy it!");
        }
    }
}
