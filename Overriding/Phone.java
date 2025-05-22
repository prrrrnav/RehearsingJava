package Overriding;


class Mobile {
    void features() {
        System.out.println("Mobile can make calls and send messages");
    }
}

class Smartphone extends Mobile {
    @Override
    void features() {
        System.out.println("Smartphone can make calls, send messages, browse internet, and run apps");
    }
}

public class Phone {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.features();

        Mobile mobile = new Mobile();
        mobile.features();

        Mobile mobile2 = new Smartphone();
        mobile2.features(); // This will call the overridden method in Smartphone
    }    
}
