import java.util.ArrayList;

public class Invoice {
    public String name;
    public String streetAddress;
    public String city;
    public String state;
    public int zip;

    private ArrayList<Item> cart;
    private double shippingCharge;

    private double totalCost;

    public Invoice(String name, String streetAddress, String city, String state, int zip, ArrayList<Item> cart,double shippingCharge,double totalCost) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.cart = cart;
        this.shippingCharge = shippingCharge;
        this.totalCost = totalCost;
    }

    public String toString(){
        String shipping = "";
        if(shippingCharge==0) shipping="free";
        else shipping = shippingCharge + "";


        String s = "Ship to: \n   " + name + "\n   " + streetAddress + "\n   " + city + ", " + state + " " + zip + "\n\n";
        s+= "Items\n-----\n";
        for(Item item: cart){
            s+=item.itemName + " $" + String.format("%.2f",item.price) + " (" + item.quantity + ") $" + String.format("%.2f", (item.price* item.quantity)) + "\n";
        }
        s+="\nShipping: " + shipping + "\n\nTotal Cost\n---------\n$" + String.format("%.2f",totalCost);
        return s;
    }
}
