public class Manufacturer {
    //variables
    private String companyName;
    private Address companyAddress;

    //constructor
    public Manufacturer(String compName,Address address){
        this.companyName = compName;
        this.companyAddress = address;
    }

    // get manufacturer name of company
    public String getCompanyName() {
        return companyName;
    }

    // set name of the manufacturer company
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // get the Address object
    public Address getCompanyAddress() {
        return companyAddress;
    }

    // set the Address object


    public void setCompanyAddress(Address address) {
        this.companyAddress = address;
    }
}
