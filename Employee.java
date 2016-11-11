package fsm.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Employee {
	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	@Column(name="team_id")
	int teamId;
	@Column(name="brid")
	String brid;
	@Column(name="name")
	String name;
	
	
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getBrid() {
		return brid;
	}
	public void setBrid(String brid) {
		this.brid = brid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
