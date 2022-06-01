package com.greenwave;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;



@FacesConverter("in.co.greenwave.CustomConverter")
public class CustomConverter implements  Converter{
	
	 @Override
	   public Object getAsObject(FacesContext facesContext,
	      UIComponent component, String value) {
		 
		 
		 
		 String cardNo = value;
		 
		 
		 
		 try {
			 

		      if(cardNo.length() != 16) {
		         //throw error

		    	
		    	  throw new Exception("Card Number should be of 16 digits");
		      }
	          // Check if all character a digit and  between 0-9. If not throw error
		      else {
		    	  for (int i = 0; i < cardNo.length(); i++) {
			    	  
			            if (cardNo.charAt(i) < '0' || cardNo.charAt(i) > '9') {
			            	//throw error

							 //System.out.println("Card Number contain only numbers not digits");
					    	 throw new Exception("Card Number contain only numbers not digits or special charater");
							// break;

			            }
			        }
		    	  System.out.println("Card Number : "+cardNo);
		      }
		   
		    	
		      
	      } 
		 catch (Exception  e) {
	        //throwing Converter Exception error
			 
			 //String msg = e.getMessage();
			 //System.out.println(msg);
			 
			 FacesMessage msg = new FacesMessage(e.getMessage());
			 
			 msg.setSeverity(FacesMessage.SEVERITY_ERROR );  
			 
	         throw new ConverterException(msg);
	      }
	      
	      CardData cardData = new CardData(cardNo.toString()); 
	      return cardData;
	   }

	   @Override
	   public String getAsString(FacesContext facesContext, 
	      UIComponent component, Object value) {
	      return value.toString();
	   }

}
