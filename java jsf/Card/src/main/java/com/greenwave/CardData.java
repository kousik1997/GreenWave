package com.greenwave;

public class CardData {

	private String cardNo;
	

	 public CardData(String cardNo) {
	      this.cardNo = cardNo;
	   }
	 
	 
	 public String getCardNo() {
		return cardNo;
	}


	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}


	public String toString() {
	      return cardNo;
	   }
}
