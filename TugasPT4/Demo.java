package TugasPT4;

public class Demo {
    
    public static void main(String[] args) {
        RumusRumus k1 = new Kubus(25);
        RumusRumus b1 = new Balok(1, 1, 5);
        
        System.out.println("Volume Kubus: " + k1.volume());
        System.out.println("Luas Permukaan Kubus: " + k1.luasPermukaan());
        
        System.out.println("Volume Balok: " + b1.volume());
        System.out.println("Luas Permukaan Balok: " + b1.luasPermukaan());
    }
}
    

