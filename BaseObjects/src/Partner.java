
/**
 * <h1> Partner</h1>
 * The Partner class creates an Abstract class designed for use in
 * Subclasses and users/entities in a data-entry driven application. 
 *  
 * @author Dwayne O Ramsay
 * @since 2014-11-15
 * @version 1.0
 */
public abstract class Partner {
	private String partnerId;
	private String partnerShortcut;
	
	
	public Partner(String partnerId, String partnerShortcut){
		this.partnerId = partnerId;
		this.partnerShortcut = partnerShortcut;
	}

	public Partner(String partnerId){
		this(partnerId, "");		
	}	
	
	/**
	 * getPartnerFullName - an abstract function to be implemented in 
	 * subclass. It returns the Full Name of an instance of the subclass.
	 * 
	 * @return String
	 */	
	protected abstract String getFullName();
	
//	protected abstract void addPartner();
	
//	protected abstract void removePartner();
	
	
	


	/**
	 * getPartnerId - Returned the ID of a Partner instance.
	 * 
	 * @return String
	 */	
	protected String getPartnerId() {
		return partnerId;
	}


	protected void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}


	protected String getPartnerShortcut() {
		return partnerShortcut;
	}


	protected void setPartnerShortcut(String partnerShortcut) {
		this.partnerShortcut = partnerShortcut;
	}
	
	
	
/*	
	private ContactInformation addressInformation;
	
	private class ContactInformation{
		private String emailAddess1;
		private String emailAddess2;
		private String address1;
		private String address2;
		private String city;
		private String parish;
		private String postal_code;	
		private String homeTelephone1;
		private String workTelephone1;
		private String mobileTelephone1;
		private String mobileTelephone2;
		
	}
*/

}
