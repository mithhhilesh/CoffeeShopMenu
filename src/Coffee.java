public abstract class Coffee {
    Boolean milk;
    Boolean sugar;
    Boolean whippedCream;
    public Coffee(Boolean milk, Boolean sugar, Boolean whippedCream){
        this.milk = milk;
        this.sugar = sugar;
        this.whippedCream = whippedCream;
    }

    public abstract double cost();

    public final double calculateFinalCost(){
        double finalCost = cost();
        if(milk) finalCost += 100;
        if(sugar) finalCost += 110;
        if(whippedCream) finalCost += 150;
        return finalCost;
    }
    public String getAddOns() {
        return (milk ? "Milk " : "") + (sugar ? "Sugar " : "") + (whippedCream ? "WhippedCream " : "");
    }
}

class Espresso extends Coffee{
    public Espresso(boolean milk, boolean sugar, boolean whippedCream){
        super(milk, sugar, whippedCream);
    }

    @Override
    public double cost() {
        return 70;
    }
}

class Latte extends Coffee {
    public Latte(boolean milk, boolean sugar, boolean whippedCream){
        super(milk, sugar, whippedCream);
    }

    @Override
    public double cost() {
        return 90;
    }
}
