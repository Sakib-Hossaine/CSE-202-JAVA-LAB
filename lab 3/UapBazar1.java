public class UapBazar1 {
String name;
double price;
public void updatePrice(double newPrice) {
	this.price =newPrice;
}
public void display() {
System.out.println("Product Name :"+ this.name);
System.out.println("Product Price : "+ this.price );
}
public double getDiscount(double discountPercentage) {
	return this.price -(this.price*discountPercentage/100);
}
}
