import java.util.Date;
/**
 * 
 */

/**
 * @author Dwayne
 *
 */
public class Patient extends Partner{
	private String firstName;
	private String lastName;
	private String middleInitial;
	private Date date_of_birth;
	private boolean discharged;
	

	/**
	 * 
	 */
	public Patient(String partnerId, String partnerShortcut, String firstName, 
			String lastName, String middleInitial, Date date_of_birth) {
		
		super(partnerId, partnerShortcut);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMiddleInitial(middleInitial);
		this.setDate_of_birth(date_of_birth);	
		
	}


	protected String getFirstName() {
		return firstName;
	}


	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	protected String getLastName() {
		return lastName;
	}


	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}


	protected String getMiddleInitial() {
		return middleInitial;
	}


	protected void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}


	protected Date getDate_of_birth() {
		return date_of_birth;
	}


	protected void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	
	protected String getFullName(){
		return this.getFirstName() + " " + this.getMiddleInitial() + " " + this.getLastName();
	}
	
	protected boolean isDischarged(){
		return false;
	}
	
	protected void dischargePatient(){
		;
	}
	
	
	
	

}
