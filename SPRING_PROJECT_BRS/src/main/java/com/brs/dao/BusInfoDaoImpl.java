package com.brs.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.brs.bean.Bus_Info_Bean;

@Repository
@Scope("singleton")  // By default spring objects are singleton.
//@Transactional(propagation=Propagation.REQUIRED)
public class BusInfoDaoImpl implements BusInfoDao{
//
//	@PersistenceContext
//	private EntityManager manager;
//	@Override
//	public List<Bus_Info_Bean> getBusDetails() {
//		Query qry = manager.createNamedQuery("searchBus");
//		return qry.getResultList();
//	}
//	
//	
	
	@Resource
	private JdbcTemplate jt;
	
	
	@Override
	public List<Bus_Info_Bean> getBusDetails() {
		String qry = "SELECT * FROM BUS_DETAILS";
		List<Map<String, Object>> mapEmpList = jt.queryForList(qry,new Object[] {});
		List<Bus_Info_Bean> contList = new ArrayList<Bus_Info_Bean>();
		System.out.println("ASDFGASDFGH");
		for(Map<String, Object> mapRec : mapEmpList) {
			System.out.println("ASDFGASDFGHQQWESDFGB");
			BigDecimal busid=(BigDecimal)mapRec.get("BUS_ID");
			String btype = (String) mapRec.get("BUS_TYPE");
			String src = (String) mapRec.get("SOURCE");
			String dest= (String) mapRec.get("DESTINATION");
			BigDecimal cap=(BigDecimal)mapRec.get("CAPACITY");
			
			
			System.out.println("saadfgb");
			//BigDecimal Phone = (BigDecimal) mapRec.get("PHONE");
			Bus_Info_Bean cont = new Bus_Info_Bean(busid.intValue(),btype,cap.intValue(),src,dest);
			
			
			//cont.setBus_info_bean(mapEmpList);
			//System.out.println("ASDFG");
			contList.add(cont);
		//return null;		
	}
		return contList;
	}
}
