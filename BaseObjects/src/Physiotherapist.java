
public class Physiotherapist extends Partner{
	
	private String firstName;
	private String lastName;
	private String middleInitial;
	private String registrationId;

	public Physiotherapist(String partnerId, String partnerShortcut) {
		super(partnerId, partnerShortcut);
		// TODO Auto-generated constructor stub
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

	protected String getRegistrationId() {
		return registrationId;
	}

	protected void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	
	protected String getFullName(){
		return this.getFirstName() + " " + this.getMiddleInitial() + " " + this.getLastName();
	}
	
	
	
	
	
	
	

}
