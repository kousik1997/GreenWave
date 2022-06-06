package com.Greenwave;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;



@FacesValidator("com.Greenwave.EmailValidator")
public class EmailValidator implements Validator {
	
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\." +
			"[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +
			"(\\.[A-Za-z]{2,})$";
	
	private Pattern pattern;
	private Matcher matcher;
	
	public EmailValidator(){
		  pattern = Pattern.compile(EMAIL_PATTERN);
	}

	@Override
	public void validate(FacesContext context, UIComponent component, Object value)   {
	
		
	
		
		
			/*if(!matcher.matches()){
			
			FacesMessage msg = 
				new FacesMessage("E-mail validation failed.", 
						"Invalid email format.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);

			}*/
		try {
			
			matcher = pattern.matcher(value.toString());
			//System.out.println(value.toString());
		if(!matcher.matches()){

			 throw new Exception("Invalid email format");
			}
		}catch(Exception e) {
						
			FacesMessage msg = new FacesMessage("Invalid email format");
			 msg.setSeverity(FacesMessage.SEVERITY_ERROR );  
			 
	         throw new ValidatorException(msg);

			
	}
		System.out.println("Email id : "+value.toString());
}
}

