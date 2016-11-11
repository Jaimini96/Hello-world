package fsm.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Desk {

	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	
	@Column(name="desk_code")
	String deskCode;
	@OneToOne
	@JoinColumn(name="employee_id")
	int employeeId;
	@Column(name="table_col")
	int tableCol;
	@ManyToOne
	@JoinColumn(name="table_id")
	int tableId;
	@Column(name="table_row")
	int tableRow;
	
	public Desk() {
		super();
	}
	public String getDeskCode() {
		return deskCode;
	}
	public void setDeskCode(String deskCode) {
		this.deskCode = deskCode;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTableCol() {
		return tableCol;
	}
	public void setTableCol(int tableCol) {
		this.tableCol = tableCol;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public int getTableRow() {
		return tableRow;
	}
	public void setTableRow(int tableRow) {
		this.tableRow = tableRow;
	}
	
}
