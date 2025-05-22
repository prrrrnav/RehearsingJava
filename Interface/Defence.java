package Interface;

interface F35 {
    void protectSky();
}

interface InsVikrant {
    void ProtectSea();
}

interface GurkhaRifles {
    void ProtectLand();
}

class Defence implements F35, InsVikrant, GurkhaRifles {
    @Override
    public void protectSky() {
        System.out.println("F35 is flying");
    }
    
    @Override
    public void ProtectSea() {
        System.out.println("Ins Vikrant is deployed");
    }
    
    @Override
    public void ProtectLand() {
        System.out.println("Gurkha Rifles are deployed");
    }
    
    public static void main(String[] args) {
        Defence defence = new Defence();
        defence.protectSky();
        defence.ProtectSea();
        defence.ProtectLand();
    }
}