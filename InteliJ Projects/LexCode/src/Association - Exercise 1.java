// Association - Exercise 1
// Carson Pemble
// 10/29/2020

class CabServiceProvider{
    //Implement your code here
    private String cabServiceName;
    private int totalCabs;

    public CabServiceProvider(String cabServiceName, int totalCabs){
        this.cabServiceName = cabServiceName;
        this.totalCabs = totalCabs;
    }

    public double calculateRewardPrice(Driver driver){
        double reward = 0.0;
        double rating = driver.getAverageRating();

        if (rating < 4.0){
            return reward;
        }

        if (cabServiceName.equals("Aber") && rating >= 4.5 && rating <= 5){
            reward = Math.round((8*rating)*100)/100.0;
        }
        else if (cabServiceName.equals("Aber") && rating < 4.5 ){
            reward = Math.round((3*rating)*100)/100.0;
        }

        if (cabServiceName.equals("Halo") && rating >= 4.5 && rating <= 5){
            reward = Math.round((10*rating)*100)/100.0;
        }
        else if (cabServiceName.equals("Halo") && rating < 4.5 ){
            reward = Math.round((5*rating)*100)/100.0;
        }

        return reward;


    }


    public String getCabServiceName(){
        return this.cabServiceName;
    }
    public void setCabServiceName(String cabServiceName){
        this.cabServiceName = cabServiceName;
    }

    public int getTotalCabs(){
        return this.totalCabs;
    }
    public void setTotalCabs(int totalCabs){
        this.totalCabs = totalCabs;
    }

}

class Driver {

	private String driverName;
	private float averageRating;

	public Driver(String driverName, float averageRating){
		this.driverName=driverName;
		this.averageRating=averageRating;
	}

	public String getDriverName(){
		return this.driverName;
	}

	public void setDriverName(String driverName){
		this.driverName=driverName;
	}

	public float getAverageRating(){
		return this.averageRating;
	}

	public void setAverageRating(float averageRating){
		this.averageRating=averageRating;
	}

    //DO NOT MODIFY THE METHOD
    //Your exercise might not be verified if the below method is modified
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
}

class Tester9 {

	public static void main(String args[]){
	    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

		Driver driver1 = new Driver("Luke", 4.8f);
		Driver driver2 = new Driver("Mark", 4.2f);
		Driver driver3 = new Driver("David", 3.9f);

		Driver[] driversList = { driver1, driver2, driver3 };
		for (Driver driver : driversList) {
			System.out.println("Driver Name: "+driver.getDriverName());
			double bonus = cabServiceProvider1.calculateRewardPrice(driver);
			if (bonus>0)
				System.out.println("Bonus: $"+bonus+"\n");
			else
				System.out.println("Sorry, bonus is not available!");
		}

		//Create more objects of CabServiceProvider and Driver classes for testing your code
	}
}
