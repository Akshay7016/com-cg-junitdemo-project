package com.cg.junitdemo.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Mobile {
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

	String addMobile(String company, String model) {
		ArrayList<String> list = new ArrayList<>();
		if (!(mobiles.containsKey(company))) {
			list.add(model);

			mobiles.put(company, list);
		} else {
			list.add(model);
			mobiles.put(company, list);
		}

		return "model successfully added";
	}

	ArrayList<String> getModel(String company) {
		boolean status = false;
		List<String> models = new ArrayList<>();
		if (mobiles.containsKey(company) && mobiles.get(company) != null) {
			status = true;
			models.addAll(mobiles.get(company));
		}

		if (status == true) {
			return (ArrayList<String>) models;
		} else {
			return null;
		}
	}

//	String buyMobile(String company, String model) {
//		
//	}
}

public class MobileShop {

}
