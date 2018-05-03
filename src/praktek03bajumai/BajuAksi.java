package praktek03bajumai;
public class BajuAksi {
    public static void main(String[] args) {
        Baju b = new Baju();
        
        b.setMerek("Crocodile");
        b.setWarna("Biru");
        b.setHarga(7900);
        
        b.cetakInfo();
        
        System.out.print("Mereknya \t: ");
        System.out.println(b.getMerek());
        System.out.print("Warnanya \t: ");
        System.out.println(b.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(b.getHarga());
    }
}
