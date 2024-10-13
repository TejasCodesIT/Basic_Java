package logicOperator;

public class Dao {
	
	
	

	
	public  String calculateBMI(double height,double weight) {
		// TODO Auto-generated method stub
		
		
		double BMI = weight/(height*height);
		System.out.println(BMI);
		
		if(BMI<18 && BMI>0) {
			return "underweight";
		}
		else if(BMI>18 && BMI<23) {
			return "Normal Weight";
		}
		else if(BMI>23 && BMI<29.9) {
			return "Overweigth" ;
		}
		else  {
			return "Obesity" ;
		}

}
}
