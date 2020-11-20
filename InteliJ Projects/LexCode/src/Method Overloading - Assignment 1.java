// Method Overloading - Assignment 1
// Carson Pemble
// 11/02/2020

class Bill{
    //Implement your code here
		public double findPrice(int itemId){
			switch(itemId){
				case 1001:
					return 25;
				case 1002:
					return 20;
				case 1003:
					return 23;
				case 1004:
					return 18;
				default:
					return 0;
			}
		}


		public double findPrice(String brandName, String itemType, int size){
			if(brandName.equals("Puma")){
				if(itemType.equals("T-shirt")){
					if(size == 34 || size == 36){
						return 25;
					}else {return 0;}
				}else {
					if(size == 38 || size == 40){
						return 20;
					}else {return 0;}
				}
			} else {
				if(itemType.equals("T-shirt")){
					if(size == 34 || size == 36){
						return 23;
					}else {return 0;}
				}else {
					if(size == 38 || size == 40){
						return 18;
					}else {return 0;}
				}
			}
		}
}

class Tester11 {

	public static void main(String[] args) {

		Bill bill = new Bill();

		double price = bill.findPrice(1001);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The Item Id is invalid");

		price = bill.findPrice("Reebok","T-shirt",34);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The values are not valid");
	}

}
