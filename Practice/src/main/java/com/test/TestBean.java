package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.test.Rows.Columns;



@ManagedBean
@ViewScoped

public class TestBean {

	private int row;
	private int col;

	private List<Rows>rows= new ArrayList<Rows>();
	private List<Columns> columns = new ArrayList<Columns>();


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


	public List<Columns> getColumns() {
		return columns;
	}


	public void setColumns(List<Columns> columns) {
		this.columns = columns;
	}


	public String display() {

		rows.clear();
		columns.clear();
		for(int i=0; i<col;i++) {
			columns.add(new Columns(col));
		}

		for(int j=0;j<row;j++) {

			Rows rw = new Rows(row);
			rw.getColumns().addAll(columns);
			rows.add(rw);

		}

		System.out.println("Your row is :"+row);

		System.out.println("Your columns is :"+col);
		return null;

	}
}
