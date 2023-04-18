public class Pizza {
    private boolean isVeg;  //true--> veg false -- non veg
    protected int price;

    private int extraCheeseCost = 59;
    private int extraToppingCost = 79;
    private  int takeAwayCost = 20;

    private boolean isCheeseAdded;
    private boolean isToppeingAdded;
    private boolean takeAwayOtped;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 299;
        }
        else{
            this.price = 399;
        }
    }

    public void printPrice(){
        System.out.println("Price is : " + price);
    }

    public void addCheese(){
        isCheeseAdded = true;
        price += extraCheeseCost;
    }

    public void addTopping(){
        isToppeingAdded = true;
        price += extraToppingCost;
    }

    public void takeAway(){
        takeAwayOtped = true;
        price += takeAwayCost;
    }

    public void generateBill(){
        double tax = calculateTax();
        int discount  = discount();
        StringBuilder sb = new StringBuilder();
        sb.append("----------------Pizza Bill-----------------");
        if(isVeg){
            sb.append("\nItem : Veg Pizza");
        }
        else{
            sb.append("\nItem : Non-Veg Pizza");
        }
        if(isCheeseAdded){
            sb.append("\nExtra Cheese Cost : ");
            sb.append(extraCheeseCost);
        }
        if(isToppeingAdded){
            sb.append("\nExtra Topping Cost : ");
            sb.append(extraToppingCost);
        }
        if(takeAwayOtped){
            sb.append("\nTake Away Opted");
            sb.append(takeAwayCost);
        }
        sb.append("\nTotal Price Without Tax : ");
        sb.append(price);

        sb.append("\nTax : ");
        sb.append(tax);

        if(discount != 0){
            sb.append("\nDiscount Applied : ");
            sb.append(discount);
        }

        sb.append("\nPrice Payable : ");
        sb.append(price + tax - discount);


        sb.append("\nHave a nice day!");

        System.out.println(sb);
    }

    public double calculateTax(){
        //12%
        double tax = 0.12 * price;
        return tax;
    }

    public int discount(){
        // price > 500 discount 80
        if(price > 500)
            return 80;
        return 0;
    }

}
