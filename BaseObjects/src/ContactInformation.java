import java.util.ArrayList;
import java.lang.Exception;

public class ContactInformation {
	
	private ArrayList<ContactDetail> ContactDetailList;
	
	public ContactInformation(){
		ContactDetailList = new ArrayList<ContactDetail>();
		//ContactInformationList = new ArrayList<ContactDetail>();
		//ContactInformationList.add(new ContactDetail());
		
	}
	
	public void addContactInformation(ContactDetail.ContactDetailGroup contactDetailGroup, ContactDetail.ContactDetailType contactDetailType) 
			throws Exception{
		
		switch (contactDetailGroup){
		case HOME:
			break;
		case WORK:
			break;
		case SCHOOL:
			break;
		default:
			throw new Exception();				
		}
		
	 public boolean isContactDetailGroupSet(ContactDetail.ContactDetailGroup contactDetailGroup){
		 for (int i=0; i<ContactDetailList.size(); i++){
			 
		 }
	 }
	 {
		 
	 }
		
	}
	
	private abstract static class ContactDetail{
		
		public static enum ContactDetailGroup {HOME, WORK, SCHOOL};
		public static enum ContactDetailType {ADDRESS, FIXEDLINE, MOBILE, FAX, EMAIL};
		
		private ContactDetailType contactDetailType;
		private ContactDetailGroup contactDetailGroup;
		
		public ContactDetail(){
			;
		}	
		
		public ContactDetail(ContactDetailGroup contactDetailGroup, ContactDetailType contactDetailType){
			this.setContactDetailGroup(contactDetailGroup);
			this.setContactDetailType(contactDetailType);
		}			
				
				
		private void setContactDetailType(ContactDetailType contactDetailType){
			this.contactDetailType = contactDetailType;
		}		

		public ContactDetailType getContactDetailType(){
			return this.contactDetailType;
		}		
		
		public ContactDetailGroup getContactDetailGroup() {
			return contactDetailGroup;
		}

		public void setContactDetailGroup(ContactDetailGroup contactDetailGroup) {
			this.contactDetailGroup = contactDetailGroup;
		}

		public abstract boolean isValidateContactDetail();
		
	}
	
	private class ContactAddressDetail extends ContactDetail{
		private String addressLine1;
		private String addressLine2;
		private String cityTown;
		private String parishState;
		private String country;
		private String postalCode;		
		
		public ContactAddressDetail(ContactDetailGroup contactDetailGroup, ContactDetailType contactDetailType){
			super(contactDetailGroup, contactDetailType);
			
		}
		
		public String getAddressLine1() {
			return addressLine1;
		}
		
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		
		public String getAddressLine2() {
			return addressLine2;
		}
		
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}

		public String getCityTown() {
			return this.cityTown;
		}
		public void setCityTown(String cityTown) {
			this.cityTown = cityTown;
		}
		
		public String getParishState() {
			return parishState;
		}
		
		public void setParishState(String parishState) {
			this.parishState = parishState;
		}
		
		public String getCountry() {
			return country;
		}
		
		public void setCountry(String country) {
			this.country = country;
		}
		public String getPostalCode() {
			return postalCode;
		}
		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public boolean isValidateContactDetail(){
			return false;
		}		
		
		
	}
	
	private class ContactTelephoneDetail extends ContactDetail{
		
		private String telephoneNumber;
		
		public ContactTelephoneDetail(ContactDetailGroup contactDetailGroup, ContactDetailType contactDetailType){
			super(contactDetailGroup, contactDetailType);
			
		}		

		public String getTelephoneNumber() {
			return telephoneNumber;
		}

		public void setTelephoneNumber(String telephoneNumber) {
			this.telephoneNumber = telephoneNumber;
		}
		
		public boolean isValidateContactDetail(){
			return false;
		}	
		
	}
	
	
	
}
