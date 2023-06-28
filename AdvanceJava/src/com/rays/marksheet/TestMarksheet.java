package com.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {

		//testAdd();
		//testSearch();
		findByRollNumber();
		
	}

	

	private static void findByRollNumber()throws Exception {
		MarksheetModel mod = new MarksheetModel();
		MarksheetBean bean = mod.findByRollNumber(102);
		
		if(bean != null) {
		
		System.out.print(bean.getId());
		System.out.print("\t" +bean.getName());
		System.out.print("\t" +bean.getRollnumber());
		System.out.print("\t" +bean.getPhysics());
		System.out.print("\t" +bean.getChemstry());
		System.out.println("\t" +bean.getMaths1());
		
	}
	   else{
		System.out.println("Roll number does not exist....");
		}
		
	}



	private static void testSearch() throws Exception {

		MarksheetModel model = new MarksheetModel();

		List list = model.search();

		Iterator it = list.iterator();

		while (it.hasNext()) {

			MarksheetBean bean = (MarksheetBean) it.next();
			System.out.print(bean.getId());
			System.out.print(bean.getName());
			System.out.print(bean.getRollnumber());
			System.out.print(bean.getPhysics());
			System.out.print(bean.getChemstry());
			System.out.println(bean.getMaths1());
		}

	}

	public static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		
		bean.setName("Pradeep");
		bean.setRollnumber(109);
		bean.setPhysics(22);
		bean.setChemstry(22);
		bean.setMaths1(21);

		MarksheetModel m = new MarksheetModel();
		m.Add(bean);

	}

}
