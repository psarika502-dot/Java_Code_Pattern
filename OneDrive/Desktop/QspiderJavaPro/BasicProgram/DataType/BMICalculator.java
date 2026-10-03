package DataType;

class BMICalculator{
	public static void main(String []args){
		float height = 1.70f; //m
		float weight = 72.3f; //kg
		float bmi = weight/(height * height);
		System.out.println(bmi); //25.017302
}
}