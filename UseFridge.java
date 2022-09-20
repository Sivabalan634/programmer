package LMS;

public class UseFridge {
	public static void main(String[] args) { 
		String[] product1=args[0].split("@");
		Fridge fridge1=new Fridge();
		fridge1.brand=product1[0];
		
		fridge1.price=Integer.parseInt(product1[1]);
		fridge1.color=product1[2];
		fridge1.taxAmount=Integer.parseInt(product1[3]);
		fridge1.netPrice=fridge1.price+fridge1.taxAmount;
		String[]product2=args[1].split("@");
		Fridge fridge2=new Fridge();
		fridge2.brand=product2[0];
		fridge2.price=Integer.parseInt(product2[1]);
		fridge2.color=product2[2];
		fridge2.taxAmount=Integer.parseInt(product2[3]);
		fridge2.netPrice=fridge2.price+fridge2.taxAmount;
		 System.out.println("BRAND = "+fridge1.brand+" , "+fridge2.brand+"  color = "+fridge1.color+" , "+fridge2.color+"  Netprice = "+fridge1.netPrice+" , "+fridge2.netPrice);
		
		
	}

}
