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


}
