public class SecretIdentity {
    private String realName;
    private String occupation;
    private String homePlanet;

    public SecretIdentity(String name, String occupat, String planet) {
        realName = name;
        occupation = occupat;
        homePlanet = planet;
    }

    public String getRealName() {
        return realName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    @Override
    public String toString() {
        return "Secret Identity\n"+"Name: "+realName+"\nOccupation: "+occupation+"\nHome Planet: "+homePlanet;
    }
}
