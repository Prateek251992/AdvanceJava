package com.rays.perameter;

import java.util.Iterator;
import java.util.List;

public class TestPerameter {

	public static void main(String[] args) throws Exception {

		testSearchP();
	}

	private static void testSearchP() throws Exception {
		UserBean bean = new UserBean();
		ModelUser mdl = new ModelUser();
		bean.setId(2);
		List list = mdl.SearchByParameter(bean);
		Iterator it = list.iterator();

		while (it.hasNext()) {
			bean = (UserBean) it.next();
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRolln());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemstry());
			System.out.println("\t" + bean.getMaths1());
		}

	}

}
