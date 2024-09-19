package TugasPT4;

public class Kubus extends RumusRumus {
     double s;
    
    public Kubus(double s){
        this.s = s;
    }
    @Override
    public double volume(){
    return s * s * s;
    }
    
    @Override
    public double luasPermukaan(){
    return 6* s * s;
    }
}
