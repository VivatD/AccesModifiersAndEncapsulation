package shop;

public class Invoice {

    private String device;
    private String description;
    private int amount;
    private double price;

    public Invoice(){}

    public Invoice(String device, String description, int amount, double price) {
        setDevice(device);
        setDescription(description);
        setAmount(amount);
        setPrice(price);
    }

    public String getDevice() {
        return device;
    }

    private void setDevice(String device) {
        this.device = device;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    private void setAmount(int amount) {
        if(amount < 0){
            System.err.println("Set the amount!!");
            amount = 0;
        } else {
            this.amount = amount;
        }
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        if(price < 0.0){
            System.err.println("Price can't be negative!!");
            price = 0.0;
        } else {
            this.price = price;
        }
    }

    public  double getInvoice(){
        double total = 0;
        total = this.price * this.amount;
        System.out.println("Invoice:\n "
                +getDevice() +" "
                +getDescription()
                +"\n price: "
                + getPrice()
                + "\n quantity x "
                + getAmount()+ "\n total: "
                + total + " $");
        return 2.5;
    }
}
