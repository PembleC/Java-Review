// Method Overloading - Assignment 2
// Carson Pemble
// 11/02/2020

class Point1 {
    //Implement your code here
		private double xCoordinate;
		private double yCoordinate;

		public Point1(double xCoordinate, double yCoordinate){
			this.xCoordinate = xCoordinate;
			this.yCoordinate = yCoordinate;
		}

		public Point1(int xCoordinate, int yCoordinate){
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

		public String toString(){
        return "Point\nxCoordinate: "+this.getxCoordinate()+"\nyCoordinate: "+this.getyCoordinate();
    }
}

class Triangle {
    //Implement your code here
		private Point1 point1;
		private Point1 point2;
		private Point1 point3;

		public Triangle(){
			this.point1 = new Point1(0, 0);
			this.point2 = new Point1(1, 1);
			this.point3 = new Point1(2, 5);
			// this.point1.setxCoordinate(0);
			// this.point1.setyCoordinate(0);
			// this.point2.setxCoordinate(1);
			// this.point2.setyCoordinate(1);
			// this.point3.setxCoordinate(2);
			// this.point3.setyCoordinate(5);
		}

		public Triangle(double point1XCoordinate, double point1YCoordinate, double point2XCoordinate, double point2YCoordinate, double point3XCoordinate, double point3YCoordinate){

			this.point1 = new Point1(point1XCoordinate, point1YCoordinate);
			this.point2 = new Point1(point2XCoordinate, point2YCoordinate);
			this.point3 = new Point1(point3XCoordinate, point3YCoordinate);
			// this.point1.setxCoordinate(point1XCoordinate);
			// this.point1.setyCoordinate(point1YCoordinate);
			// this.point2.setxCoordinate(point2XCoordinate);
			// this.point2.setyCoordinate(point2YCoordinate);
			// this.point3.setxCoordinate(point3XCoordinate);
			// this.point3.setyCoordinate(point3YCoordinate);
    }

		public Triangle(Point1 point1, Point1 point2, Point1 point3){
			this.point1 = point1;
			this.point2 = point2;
			this.point3 = point3;
		}


        public double calculatePerimeter(){
					double distance1 = this.point1.calculateDistance(this.point2);
					double distance2 = this.point2.calculateDistance(this.point3);
					double distance3 = this.point3.calculateDistance(this.point1);
					return Math.round((distance1 + distance2 + distance3) * 100.0 ) / 100.0;
        }

        public double calculateArea(){
					double a = point1.calculateDistance(point2);
					double b = point2.calculateDistance(point3);
					double c = point3.calculateDistance(point1);
					double s = (a+b+c)/2;
					return Math.round(Math.sqrt(s*(s-a)*(s-b)*(s-c)) * 100.0 ) / 100.0;
        }

        public Point1 getPoint1() {
            return point1;
        }

        public void setPoint1(Point1 point1) {
            this.point1 = point1;
        }

        public Point1 getPoint2() {
            return point2;
        }

        public void setPoint2(Point1 point2) {
            this.point2 = point2;
        }

        public Point1 getPoint3() {
            return point3;
        }

        public void setPoint3(Point1 point3) {
            this.point3 = point3;
        }


}



class Tester13 {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle(1, 2, 6, 5, 5, 1);

		Point1 point1 = new Point1(2, 1);
		Point1 point2 = new Point1(4, 4);
		Point1 point3 = new Point1(9, 1);
		Triangle triangle3 = new Triangle(point1, point2, point3);

		System.out.println("Perimeter of triangle1 is "+triangle1.calculatePerimeter());
		System.out.println("Area of triangle1 is "+triangle1.calculateArea());

		System.out.println("Perimeter of triangle2 is "+triangle2.calculatePerimeter());
		System.out.println("Area of triangle2 is "+triangle2.calculateArea());

		System.out.println("Perimeter of triangle3 is "+triangle3.calculatePerimeter());
		System.out.println("Area of triangle3 is "+triangle3.calculateArea());

		//Create more objects of Triangle class for testing your code

	}
}
