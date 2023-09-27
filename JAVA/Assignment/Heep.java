public class Heep {

    public static void main(String[] args) {

        String str = new String("avinash");
        String str2 = new String("Prajacta");
        String str3 = new String("Miathili");

        String Str = new String("avinash").intern();
        String STR1= "Avinash";
        String STR2= "Prajacta";
        String STR3 = "Miathili";
        System.out.println(str.equals(STR1));
        System.out.println(str.equals(STR2));
        System.out.println(str);
        System.out.println(Str);
        System.out.println(Str.equals(str));
    }
}
