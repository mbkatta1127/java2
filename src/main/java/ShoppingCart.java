import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> cart;
    public double total;
    public double shippingCharge;
    public double salesTax;

    public ShoppingCart(){
        cart = new ArrayList<>();
    }

    public ShoppingCart(double shippingCharge){
        this.shippingCharge = shippingCharge;
    }


    public void addItem(Item item){
        cart.add(item);
    }

    public void calculateTotal(){
        int total = 0;
        for(Item item: cart){
            total += (item.price* item.quantity);
        }
        if(total<10) {
            total+=shippingCharge;
        }

        else{
            shippingCharge = 0;
        }
        this.total=total + (0.1*total);
    }

    public double getTotal(){
        return this.total;
    }

    public Invoice shipOrder(String name, String streetAddress, String city, String state, int zip){
        return new Invoice(name, streetAddress, city, state, zip,cart, shippingCharge,this.total);
    }
}
