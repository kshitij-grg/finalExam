package part2_4;

public class Property {
    private String name, address;
    private int noOfBedroom;
    private double rent;

    public double getRent() {
        return rent;
    }

    public Property(String name, String address, int noOfBedroom, double rent) {
        this.name = name;
        this.address = address;
        this.noOfBedroom = noOfBedroom;
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public int getNoOfBedroom() {
        return noOfBedroom;
    }

    public String getAddress() {
        return address;
    }
}
