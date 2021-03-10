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
        if (this.price < 600){
            System.out.println("This notebook is very cheap.");
        }
        else if (600 <= this.price && this.price <= 1000){
            System.out.println("The price is good.");
        }
        else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight(){
        if (this.weight < 600){
            System.out.println("This notebook is light.");
        }
        else if (600 <= this.weight && this.weight <= 1000){
            System.out.println("This notebook is not heavy.");
        }
        else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void ramSizeCheck(){
        if (this.ramSize < 4){
            System.out.println("This notebook has to small RAM for work.");
        }
        else if (4 <= this.ramSize && this.ramSize <= 8){
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
}
