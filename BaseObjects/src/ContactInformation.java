import java.util.ArrayList;
public class ContactInformation {
	
	private ArrayList<ContactDetail> ContactInformationList;
	
	public ContactInformation(){
				
		
	}
	
	
	
	
	private static class ContactDetail{
		public enum ContactDetailType {ADDRESS, FIXEDLINE, MOBILE, FAX, EMAIL};
		private ContactDetailType contactDetailType;
		private String[] contactDetail;
		
			
		public ContactDetail(ContactDetailType contactDetailType, String contactGenericDetail){
			this.setContactDetailType(contactDetailType);
			this.contactDetail = new String[1];
			this.contactDetail[0] = contactGenericDetail;
		}
		
		public ContactDetail(ContactDetailType contactDetailType, String[] contactGenericDetail){
			this.setContactDetailType(contactDetailType);
			this.contactDetail = new String[5];
			
			
			this.contactDetail[0] = contactGenericDetail[0];
			this.contactDetail[1] = contactGenericDetail[1];
			this.contactDetail[2] = contactGenericDetail[2];
			this.contactDetail[3] = contactGenericDetail[3];
			this.contactDetail[4] = contactGenericDetail[4];
		}
		
				
		private void setContactDetailType(ContactDetailType contactDetailType){
			this.contactDetailType = contactDetailType;
		}
		

		public ContactDetailType getContactDetailType(){
			return this.contactDetailType;
		}
		
				public boolean isValidateContactDetail(){
			
			switch (this.getContactDetailType()){
				case ADDRESS : 
					return this.isValidAddress();
				
				case FIXEDLINE : 
				case MOBILE : 
				case FAX : 
					return this.isValidTelephoneNumber();
				
				case EMAIL : 
					return this.isValidEmailAddress();
					
				default:
					return false;
					
					
			}
			
		}
				
		public String[] getContactDetail(){
			return this.contactDetail;
		}
		
		private boolean isValidAddress(){
			return false;
		}
		
		private boolean isValidTelephoneNumber(){
			return false;
		}
		
		private boolean isValidEmailAddress(){
			return false;
		}
		
		
	}	
	
}
