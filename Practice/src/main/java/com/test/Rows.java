package com.test;

import java.util.ArrayList;
import java.util.List;





public class Rows {
	private int row;

	private List<Columns> columns = new ArrayList<Columns>();

	public Rows(int row) {

		this.row=row;

	}

	public static class Columns {		

		private int col;

		public Columns(int col) {
			this.col=col;

		}


		public int getCol() {
			return col;
		}

		public void setCol(int col) {
			this.col = col;
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

}
