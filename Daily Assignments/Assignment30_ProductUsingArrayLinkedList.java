package dailyassignments;

import java.util.ArrayList;
import java.util.ListIterator;

class Product
{
	int productId;
	String productName;
	double price;
	int quantity;
	Product(int productId, String productName, double price, int quantity)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
}
public class Assignment30_ProductUsingArrayLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> list= new ArrayList<Product>();
		Product p1=new Product(101,"Laptop",55000,5);
		Product p2=new Product(102,"Mouse",800,10);
		Product p3=new Product(103,"Keyboard",1500,0);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println("Product Id  Product Name  Price Quantity");
		//1.	Display all products using a for-each loop.
		for(Product p:list)
		{
			System.out.println(p.productId+"\t "+p.productName+"  \t"+p.price+"\t "+p.quantity);
		}
		System.out.println();
		
		//2.	Display products whose quantity is less than 5.
		for(Product p:list)
		{
			if(p.quantity<5)
			{
				System.out.println("Products whose quantity is less than is: "+p.productName+" :"+p.quantity);
			}
			
		}
		//3.	Find and display the most expensive product
		double expensiveProduct=0;
		String productName = "";
		for(Product p:list)
		{
			if (p.price>expensiveProduct)
			{
				expensiveProduct=p.price;
				productName=p.productName;
			}
		}
		System.out.println("The Most Expensive Product is: "+productName+" :"+expensiveProduct);//here we can't accesss the p. product, since it's outside the loop.
		
		
		//4.	Calculate the total inventory value using price × quantity.
		double totalInventory=0;
		for (Product p:list)
		{
			totalInventory=totalInventory+(p.price*p.quantity);
		}
		System.out.println("Total Inventory Value is: "+totalInventory);
		
		//5.	Update the price of Mouse to ₹1,000.
		Product pl=list.get(1);
		pl.price=1000;
		System.out.println("The Price of the Mouse is: "+pl.price);
		
		//6.	Remove products whose quantity is zero.
		for(int i = 0; i < list.size(); i++)
		{
		    if(list.get(i).quantity == 0)
		    {
		        System.out.println("Removing product: " + list.get(i).productName);
		        list.remove(i);
		        i--;
		    }
		}
		//7.	Display the final product list.
		for(Product p:list)
		{
			System.out.println(p.productId+"\t "+p.productName+"  \t"+p.price+"\t "+p.quantity);
		}
	
	
	
	}

}
