package com.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

import com.test.Rows.Columns;




@ManagedBean
@ViewScoped

public class TestBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -285294955388824918L;
	private int row;
	private int col;
	
	private String colfild;
	

	//private List<Coltype>coltype= new ArrayList<Coltype>();
	
	

	private List<Rows>rows= new ArrayList<Rows>();


	public int getCol() {
		return col;
	}


	public void setCol(int col) {
		this.col = col;
	}


	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public List<Rows> getRows() {
		return rows;
	}


	public void setRows(List<Rows> rows) {
		this.rows = rows;
	}


	



	


	


	public String getColfild() {
		return colfild;
	}


	public void setColfild(String colfild) {
		this.colfild = colfild;
	}


	public void submit(ActionEvent event) {

		rows.clear();
		for (int r = 0; r < row; r++) {
			//Rows frow = new Rows();
			List<Columns> cols = new ArrayList<Rows.Columns>();
			for (int c = 0; c < col; c++) {
				cols.add(new Columns("dropdown"));				
			}
			rows.add(new Rows(cols));
		}
		

	}
	

	
	
	
}
