package HospitalBox;

public class Hospital {

    static String hospitalInfo = hospitalInfo();

    public String founderName = "Dr. Pranav";
    private String partnerName = "Dr. Pawan";
    public int year_of_inauguration = 2020;
    private int fundsAllocated = 10000000;

    static String hospitalInfo() {
        System.out.println("Founder Name:" + "Dr. Pranav");
        System.out.println("Partner Name:" + "Dr. Pawan");
        return "This is a hospital management system.";
    }

    public void printInAugurationYear() {
        System.out.println("Year of Inauguration:" + year_of_inauguration);
    }
}

class bloodBank extends Hospital {

    static String yearOdInauguration = YOI();

    public int O_positiveBags = 10;
    private int O_NegativeBags = 10;
    public String FirstDonorDetail = "Pranav";
    private String LastDonorDetail = "Pawan";

    static String YOI() {
        System.out.println("Year of Inauguration:" + "2020");
        return "This is a blood bank management system.";
    }

    public void noOfOPositiveBags() {
        System.out.println("No of O+ Bags are:" + O_positiveBags);
        

    }

    public void noOfONegativeBags() {
    System.out.println("No of O+ Bags are:" + O_NegativeBags);
       }
}

class reception extends Hospital {

    private int salary = 10000;
    private String Address = "Blr";
    public String receptionistName ;
    public String receptionistShift;

    static String YOI() {
        System.out.println("Year of Inauguration:" + "2020");
        return "This is a reception management system.";
    }

    public reception(String receptionistName, String receptionistShift) {
        this.receptionistName = receptionistName;
        this.receptionistShift = receptionistShift;
    }
}

class generalWard extends reception {

public GeneralWard(String customerName, String customerAddress) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }
    private int salary = 10000;
    private int Age = 30;
    public String CustomerName;
    public String CustomerAddress;

    static String YOI() {
        System.out.println("Year of Inauguration:" + "2020");
        return "This is a general ward management system.";
    }

   
}
