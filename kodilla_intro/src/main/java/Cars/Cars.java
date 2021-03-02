package Cars;

public class Cars {
    private String mark;
    private String model;
    private String fuell;
    private double engineCapacity;
    private int power;
    private String color;

    public Cars (String mark, String model, String fuell, double engineCapacity, int power, String color){
        this.mark = model;
        this.model = model;
        this.fuell = fuell;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.color = color;
        System.out.println("\nMoje ulubione auto to: " + mark + " " + model + " w kolorze " + color +".");
        System.out.println("Silnik mojego auta jest zasilany " + fuell + ", ma pojemność " + engineCapacity + " ccm oraz " + power + " koni mechanicznych mocy. \n");
    }
}
