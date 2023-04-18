public class PremiumPizza extends Pizza{

    public PremiumPizza(boolean isVeg){
        super(isVeg);
        super.addCheese();
        super.addTopping();
    }

    public double calculateTax(){
        //18%
        double tax = 0.18 * price;
        return tax;
    }

    public void addCheese(){
        System.out.println("!Warning: Cheese is already added");
    }

    public void addTopping(){
        System.out.println("!Warning: Topping is already added");
    }

}
