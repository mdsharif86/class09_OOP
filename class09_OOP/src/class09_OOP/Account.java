package class09_OOP;

public class Account {
	int accId;
	String accName;
	long accphone;
	String accAddress1;
	String accAddress2;
	String accCity;
	String accState;
	int accZip;
	
		Account(int accID, String accName, int accPhone, String accAddress1, String accAddress2, String accCity, String accState, int accZip) {
			this.accId= accId;
			this.accName= accName;
			this.accphone= accPhone;
			this.accAddress1= accAddress1;
			this.accAddress2= accAddress2;
			this.accCity = accCity;
			this.accState = accState;
			this.accZip= accZip;
			
		}
		
}