public class Classroom {
    public static void main(String... args){
        Wilder josephine = new Wilder("Joséphine", true);
        System.out.println(josephine.whoIAm());

        Wilder paul = new Wilder("Paul", false);
        System.out.println(paul.whoIAm());

        Wilder lilia = new Wilder("Lilia", false);
        System.out.println("Je m'appelle " + lilia.getFirstname());

        lilia.setFirstname("Nicolas");
        System.out.println("Maintenant je m'appelle " + lilia.getFirstname());

        System.out.println(lilia.whoIAm());

        lilia.setAware(false);
        System.out.println("Maintenant " + lilia.whoIAm());
    }
}