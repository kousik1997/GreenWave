package com.greenwave;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;


@FacesConverter("com.greenwave.StudentCustomConverter")
public class StudentCustomConverter implements  Converter {

	 @Override
	   public Object getAsObject(FacesContext facesContext,
	      UIComponent component, String value) {
		 
		 
		
		 String name = value;
		 System.out.println(name);
		
		 
		 try {
			 

		      if(name.length() >= 16) {
		         //throw error

		    	  throw new Exception("name must be less than 16 characters");
		      }
		      else if(name.length() == 0) {
		    	  throw new Exception("pls enter your name");
		      }
		    	  
		      }catch(Exception  e) {
		    	  FacesMessage msg = new FacesMessage(e.getMessage());
					 
					 msg.setSeverity(FacesMessage.SEVERITY_ERROR );  
					 
			         throw new ConverterException(msg);
			         
			       
			        
		      }
		 
		return name ;
		 
}


	@Override
	public String getAsString(FacesContext facesContext, UIComponent component, Object value) {
		// TODO Auto-generated method stub
		return null;
	}
}