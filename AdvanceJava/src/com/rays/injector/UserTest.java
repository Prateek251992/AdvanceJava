package com.rays.injector;

import java.util.List;
import java.util.Iterator;

public class UserTest {
	public static void main(String[] args) throws Exception {
		UserModel model = new UserModel();
		List list = model.searchByAnyParameter();

		Iterator it = list.iterator();
		while (it.hasNext()) {
			UserBean bean = (UserBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getRollno());
			System.out.print("\t" + bean.getPhysics());
			System.out.print("\t" + bean.getChemsrty());
			System.out.println("\t" + bean.getMaths1());

		}

	}

}
