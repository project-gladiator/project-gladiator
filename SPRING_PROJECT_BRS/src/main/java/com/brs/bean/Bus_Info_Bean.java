package com.brs.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name="searchBus", query="from Bus_Info_Bean"),
})

@Entity
@Table(name="BUS_DETAILS")
public class Bus_Info_Bean {
	@Id
	int bus_id;
	String bus_type;
	int capacity;
	String source;
	String destination;

	public Bus_Info_Bean() {
		super();
	}

	public Bus_Info_Bean(int bus_id, String bus_type, int capacity, String source, String destination) {
		super();
		this.bus_id = bus_id;
		this.bus_type = bus_type;
		this.capacity = capacity;
		this.source = source;
		this.destination = destination;
	}
	
	List<Bus_Info_Bean> bus_info_bean=new ArrayList<Bus_Info_Bean>(); 
	
	public List<Bus_Info_Bean> getBus_info_bean() {
		return bus_info_bean;
	}

	public void setBus_info_bean(List<Bus_Info_Bean> bus_info_bean) {
		this.bus_info_bean = bus_info_bean;
	}

	@Id
	@Column(name="BUS_ID")
	public int getBus_id() {
		return bus_id;
	}

	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}
	
	@Column(name="BUS_TYPE")
	public String getBus_type() {
		return bus_type;
	}
	
	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}
	
	@Column(name="CAPACITY")
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Column(name="SOURCE")
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	@Column(name="DESTINATION")
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Bus_Info_Bean [bus_id=" + bus_id + ", bus_type=" + bus_type + ", capacity=" + capacity + ", source="
				+ source + ", destination=" + destination + "]";
	}

}
