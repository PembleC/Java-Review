// Method Overloading - Exercise 1
// Carson Pemble
// 10/30/2020

class Point {
    //Implement your code here
		private double xCoordinate;
		private double yCoordinate;

		public Point(double xCoordinate, double yCoordinate){
			this.xCoordinate = xCoordinate;
			this.yCoordinate = yCoordinate;
		}

		public Point(int xCoordinate, int yCoordinate){
			this.xCoordinate = xCoordinate;
			this.yCoordinate = yCoordinate;
		}

		public double calculateDistance(Point1 point){
			double distance = Math.round(Math.sqrt( Math.pow(this.xCoordinate-point.getxCoordinate(), 2) + Math.pow(this.yCoordinate-point.getyCoordinate(), 2) ) * 100.0) / 100.0;
			return distance;
		}

		public double calculateDistance(){
			double distance = Math.round(Math.sqrt( xCoordinate*xCoordinate + yCoordinate*yCoordinate ) * 100.0 ) / 100.0;
			return distance;
		}



		public double getxCoordinate(){
			return this.xCoordinate;
		}
		public void setxCoordinate(double xCoordinate){
			this.xCoordinate = xCoordinate;
		}

		public double getyCoordinate(){
			return this.yCoordinate;
		}
		public void setyCoordinate(double yCoordinate){
			this.yCoordinate = yCoordinate;
		}
}


class Tester16 {

	public static void main(String[] args) {
		Point1 point1 = new Point1(3.5, 1.5);
        Point1 point2 = new Point1(6, 4);

        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));

        //Create more objects for testing your code

	}
}
