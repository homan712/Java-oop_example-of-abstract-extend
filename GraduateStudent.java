package Java14.School.cst_3519;

public class GraduateStudent extends Student1 {
	public GraduateStudent() {
		super();
	}
	
	public GraduateStudent(String f, String l, int i, char s, int c) {
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
