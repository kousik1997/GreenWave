package com.test;

import java.util.ArrayList;
import java.util.List;

public class Rows {
	private int row;

	private List<Columns> columns = new ArrayList<Columns>();
	private List<Columns>coltype= new ArrayList<Columns>();

	public Rows(int row) {

		this.row=row;

	}
	public Rows() {

		super();

	}
	

	public Rows(List<Columns> columns) {
		super();
		this.columns = columns;
	}


	public static class Columns {		

		private int col;
		
		private String ty;

		
		public Columns(int col) {
			this.col=col;
			

		}
		
		public Columns(String ty) {
			this.ty=ty;
			
		}
		
		


		public int getCol() {
			return col;
		}

		public void setCol(int col) {
			this.col = col;
		}

		public String getTy() {
			return ty;
		}

		public void setTy(String ty) {
			this.ty = ty;
			
			System.out.println(ty);
		}

		

	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public List<Columns> getColumns() {
		return columns;
	}

	public void setColumns(List<Columns> columns) {
		this.columns = columns;
	}

	public List<Columns> getColtype() {
		return coltype;
	}

	public void setColtype(List<Columns> coltype) {
		this.coltype = coltype;
	}

	
}
