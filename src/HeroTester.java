public class HeroTester{
    public static void main(String[] args) {
        Power speed = new Power("Super Speed",10);
        SecretIdentity clark = new SecretIdentity("Clark Kent","Reporter","Krypton");

        //SuperHero theFlash = new SuperHero("Flash",speed);
        //SuperHero shazam = new SuperHero("Shazam",speed);

        SuperHero superMan = new SuperHero("Superman",speed,clark);
        System.out.println(clark);

        /*System.out.println(theFlash);
        System.out.println();
        System.out.println(shazam);

        theFlash.getPower().setStrength(15);
        System.out.println();

        System.out.println(theFlash);
        System.out.println();
        System.out.println(shazam);*/

        System.out.println(superMan);
    }
}
	