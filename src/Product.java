public class Product {
    double  productCost;
    int    productQuantity;
    String productName;

    public Product(double cost, int quantity, String name){
        this.productCost = cost;
        this.productQuantity = quantity;
        this.productName = name;

    }
    public double totalCost(){
         double total;
         total = productQuantity * productCost;
         System.out.println("The total cost is "+ total);
         return (total);

    }

    public void printProduct(){
           System.out.println(this.productName + " costs " + this.productCost +" and "
                   + this.productQuantity + " units were purchased");
    }

}
