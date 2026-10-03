package DataType;

class MarkNPercentage{
	public static void main(String[]args){
		int kannada = 96;
		int english = 118;
		int hindi = 96;
		int math = 99;
		int science = 83;
		int social = 95;
		int totalMarksObtained = kannada+ english+hindi+math+science+social;
		double percentage = totalMarksObtained * 100.0/625;
			System.out.println(percentage);
	}
}