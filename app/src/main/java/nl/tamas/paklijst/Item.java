package nl.tamas.paklijst;

public class Item {
    private int id;
    private int category;
    private int parent = 0;
    private String name;
    private boolean isHandLuggage;
    private double preciseAmount;
    private int displayAmount;
    private boolean manualSet;

    public Item(int newID, String newName, int newCategory, boolean newIsHandLuggage, double newPreciseAmount){
        id = newID;
        name = newName;
        category = newCategory;
        isHandLuggage = newIsHandLuggage;
        preciseAmount = newPreciseAmount;
        displayAmount = calculateDisplayAmount(preciseAmount);
    }

    public Item(int newID, String newName, int newCategory, boolean newIsHandLuggage, double newPreciseAmount, int newParent){
        id = newID;
        name = newName;
        category = newCategory;
        isHandLuggage = newIsHandLuggage;
        preciseAmount = newPreciseAmount;
        displayAmount = calculateDisplayAmount(preciseAmount);
        parent = newParent;
    }

    public Item(int newID, String newName,int newCategory, int newAmount){
        id = newID;
        name = newName;
        category = newCategory;
        displayAmount = newAmount;
        manualSet = true;
    }



    private int calculateDisplayAmount(double a){
        int calculated = (int)Math.floor(a);
        manualSet = false;
        return calculated;
    }

    //Getters and setters

    public void setDisplayAmount(int displayAmount){
        this.displayAmount = displayAmount;
        manualSet = true;
    }

    public int getDisplayAmount(){
        return displayAmount;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPreciseAmount(double preciseAmount){
        this.preciseAmount = preciseAmount;
        displayAmount = calculateDisplayAmount(preciseAmount);
        manualSet = true;
    }

    public double getPreciseAmount() {
        return preciseAmount;
    }

    public int getCategory() {
        return category;
    }

    public boolean isHandLuggage() {
        return isHandLuggage;
    }

    public void setHandLuggage(boolean handLuggage) {
        isHandLuggage = handLuggage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }
}
