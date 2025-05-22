package Overriding;


public class Switch {
    public void NumberOfPorts() {
        int ports = 24;
        System.out.println("This has " + ports + " ports");
    }
    
    public static void main(String[] args) {
        Switch sw = new Switch();
        sw.NumberOfPorts(); 

        Hub hub = new Hub();
        hub.NumberOfPorts();

        Switch sw2 = new Hub();
        sw2.NumberOfPorts();
    }
}
class Hub extends Switch {
    @Override
    public void NumberOfPorts() {
        int ports = 8;

        System.out.println("This has " + ports +" ports");
    }
}










