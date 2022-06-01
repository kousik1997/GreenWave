package com.greenwave;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CardBean implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	
 public CardData cardNo;
	
	
	 
	 public CardData getCardNo() {
		return cardNo;
	}


	public void setCardNo(CardData cardNo) {
		this.cardNo = cardNo;
	}
}
