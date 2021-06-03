package Java14.School.cst_3519;

public class Student1 extends person3{
	
private double tuitionFee;

public Student1() {
	this.tuitionFee = 0;
}
	public Student1(String f, String l, int i, char s, int c) {
		super(f,l,i,s,c);
		
	}
	
	@Override
	public double Tuition(String studentType) {
		double TuitionFee = 0;
		
		if(studentType.toLowerCase().contentEquals("fulltime")&& getStatus() =='R') {
			TuitionFee = 5545;
		}else if(studentType.toLowerCase().contentEquals("fulltime")&& getStatus() =='N') {
			TuitionFee = 855*this.getCredit();
		}else if(studentType.toLowerCase().contentEquals("parttime")&& getStatus() =='R') {
			TuitionFee = 470 * this.getCredit();
		}else if(studentType.toLowerCase().contentEquals("parttime")&& getStatus() == 'N') {
			TuitionFee = 855 * this.getCredit();
		}
		return TuitionFee;
	}
}