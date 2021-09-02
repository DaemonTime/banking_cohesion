public class Address
{
    //instance variable
    private String street;
    private String city;
    private String state;
    private String zip;

    // constructor
    public Address(String str, String city, String st, String zip)
    {
        street = str;
        this.city = city;
        state = st;
        this.zip = zip;
    }
    // get street name
    public String getStreet()
    {
        return street;
    }

    //get city name
    public String getCity()
    {
        return city;
        
    }

    //get state name
    public String getState()
    {
       return state; 
    }

    //get zip name
   public String getZip()
    {
        return zip;
    }
}