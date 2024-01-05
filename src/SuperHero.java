public class SuperHero{

    private String name;
    private Power superPower;

    private SecretIdentity identity;

    public SuperHero(String heroName, Power power, SecretIdentity id){
        name = heroName;
        superPower = new Power(power.getName(),power.getStrength());
        identity = new SecretIdentity(id.getRealName(),id.getOccupation(),id.getHomePlanet());
    }

    public Power getPower(){
        return superPower;
    }

    public void setPower(String name, int strength){
        superPower.setName(name);
        superPower.setStrength(strength);
    }

    public void setName(String heroName){
        name = heroName;
    }

    public String toString(){
        return "Name: " + name + "\n" + "Power: " + superPower +
                "\n"+"Strength: " + superPower.getStrength();
    }
}