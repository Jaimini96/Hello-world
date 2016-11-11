package fsm.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Table {
	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	@ManyToOne
	@JoinColumn(name="floor_id")
	int floorId;
	@Column(name="top_left_x")
	int topLeftX;
	@Column(name="top_left_y")
	int topLeftY;
	@Column(name="width")
	int width;
	@Column(name="length")
	int length;
	
	
	public Table() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFloorId() {
		return floorId;
	}
	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}
	public int getTopLeftX() {
		return topLeftX;
	}
	public void setTopLeftX(int topLeftX) {
		this.topLeftX = topLeftX;
	}
	public int getTopLeftY() {
		return topLeftY;
	}
	public void setTopLeftY(int topLeftY) {
		this.topLeftY = topLeftY;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
}
