package Java14.School.cst_3519;

public abstract class person3 {
	private String FirstName;
	private String LastName;
	private int ID;
	private char Status;
	private int Credit;
	
	public person3() {
		FirstName = "";
		LastName = "";
		ID = 0;
		Credit = 0;
	}
	
	
	person3(String f, String l, int i, char s, int c){
		FirstName = f;
		LastName = l;
		ID = i;
		Status = s;
		Credit = c;
	}
	
	
	//method
	public String getFirstName() {
		return FirstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public double getID() {
		return ID;
	}
	
	public char getStatus() {
		return Status;
	}
	
	public int getCredit() {
		return Credit;
	}
	
	public void setFirstName(String f) {
		FirstName = f;
	}
	
	
	public void setLastName(String l) {
		LastName = l;
	}
	
	public void setID(int i) {
		ID = i;
	}
	
	public void setStatus(char s) {
		Status = s;
	}
	
	public void setCredit(int c) {
		Credit = c;
	}
	
	public double Tuition(String studentType) {
		double TuitionFee = 0;
		
		if(studentType.toLowerCase().contentEquals("fulltime")&& Status =='R') {
			TuitionFee = 5545;
		}else if(studentType.toLowerCase().contentEquals("fulltime")&& Status =='N') {
			TuitionFee = 855*this.Credit;
		}else if(studentType.toLowerCase().contentEquals("parttime")&& Status =='R') {
			TuitionFee = 470 * this.Credit;
		}else if(studentType.toLowerCase().contentEquals("parttime")&& Status == 'N') {
			TuitionFee = 855 * this.Credit;
		}
		return TuitionFee;
	}
	
}
