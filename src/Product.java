public class Product {
    double  productCost;
    int    productQuantity;
    String productName;

    public Product(double cost, int quantity, String name){
        productCost = cost;
        productQuantity = quantity;
        productName = name;

    }
    public double totalCost(){
        double total;
         total = productQuantity * productCost;
        return (total);

    }

    public void printProduct(){
           System.out.println(this.productName + " costs " + this.productCost +" and "
                   + this.productQuantity + " units were purchased" + "\n" + "The total cost is " + this.totalCost());
    }

}