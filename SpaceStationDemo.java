class SpaceStation {
    String name;
    int id, capacity, currentOccupants;
    public SpaceStation(String name, int id, int capacity, int currentOccupants) {
        this.name = name; this.id = id; this.capacity = capacity; this.currentOccupants = currentOccupants;
    }
    void launch() { System.out.println(name + " launching."); }
    void status() { System.out.println(name + " status: " + currentOccupants + "/" + capacity + " occupants."); }
}

class SpaceAgency extends SpaceStation { // single inheritance
    public SpaceAgency(String name, int id, int capacity, int currentOccupants) {
        super(name, id, capacity, currentOccupants);
    }
}

class Isro extends SpaceAgency {//hierarchical
    String missionName;
    public Isro(String name, int id, int capacity, int currentOccupants, String missionName) {
        super(name, id, capacity, currentOccupants); this.missionName = missionName;
    }
    void launch() { System.out.println("ISRO's " + name + " launching with mission " + missionName); }
}

class Nasa extends SpaceAgency {//hierarchical
    String astronaut;
    public Nasa(String name, int id, int capacity, int currentOccupants, String astronaut) {
        super(name, id, capacity, currentOccupants); this.astronaut = astronaut;
    }
    void launch() { System.out.println("NASA's " + name + " launching with astronaut " + astronaut); }
}




class MarsMission extends Isro {  // Multilevel
    public MarsMission(String name, int id, int capacity, int currentOccupants, String missionName) {
        super(name, id, capacity, currentOccupants, missionName);
    }
}

class SpaceExploration extends Nasa {  // Hybrid
    public SpaceExploration(String name, int id, int capacity, int currentOccupants, String astronaut) {
        super(name, id, capacity, currentOccupants, astronaut);
    }
}

public class SpaceStationDemo {
    public static void main(String[] args) {
        SpaceStation station1 = new Isro("Chandrayaan", 101, 100, 50, "Lunar Mission");
        SpaceStation station2 = new Nasa("ISS", 102, 300, 150, "Pranav");
        SpaceStation station3 = new MarsMission("Mars Orbiter", 103, 80, 40, "Mars Mission");
        SpaceStation station4 = new SpaceExploration("Apollo", 104, 200, 100, "Neil Armstrong");

        station1.launch(); station2.launch(); station3.launch(); station4.launch();
        station1.status(); station2.status(); station3.status(); station4.status();
    }
}
