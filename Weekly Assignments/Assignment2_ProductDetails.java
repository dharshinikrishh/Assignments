package weeklyassignments;

public class Assignment2_ProductDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a Java program with the following variables:
			•	Product Price = 499.50
			•	Quantity = 3
		Calculate the total price using the variables and print:
		Product Price: 499.50
		Quantity: 3
		Total Price: 1498.50*/

		float productPrice=499.50f;
		System.out.println("Product Price:"+productPrice);
		short quantity=3;
		System.out.println("Quantity:"+quantity);
		double totalPrice = productPrice * quantity;
		System.out.println("Total Price:"+totalPrice);
	}

}
