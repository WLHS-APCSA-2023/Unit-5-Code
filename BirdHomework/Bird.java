public class Bird {
    private double wingSpan;
    private String name;
    private int age;
    private double averageAge;
    private String[] primaryColors;
    private String scientificName;
    private double weight;
    private double length;
    private int id;

    public Bird(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Bird(String name, String scientificName) {
        this.name = name;
        this.scientificName = scientificName;
    }

    public String getName() {
        return name;
    }

    public String[] getPrimaryColors() {
        return primaryColors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrimaryColors(String[] primaryColors) {
        this.primaryColors = primaryColors;
    }

    public void setID(int newID){
        id = newID;
    }

    public int getID(){
        return id;
    }

    public void setWeight(double newWeight){
        weight = newWeight;
    }

    public void setWingspan(double newWingspan){
        wingSpan = newWingspan;
    }

    public void setLength(double newLength){
        length = newLength;
    }

    public double getLength(){
        return length;
    }
    @Override
    public String toString(){
        String colorString = "";
        for(String color:primaryColors){
            colorString += color + ", ";
        }
        colorString = colorString.substring(0,colorString.length()-2);
        return name + ", also known as " + scientificName + ", and has primary colors of " + colorString;
    }

    public void printDimensions(){
        System.out.println("For a " + name + " the length is " + length + "cm the wingspan is " + wingSpan + "cm and the weight is " + weight + "g");
    }


}
