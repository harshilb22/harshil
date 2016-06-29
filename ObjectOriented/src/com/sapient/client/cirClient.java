package com.sapient.client;

import com.sapient.bean.Circle;
import com.sapient.util.MyUtil;

public class cirClient {

	public static void main(String[] args) {
		Circle service = new Circle();
		service.radius = 5.2;
		double area = service.calcArea();
		double peri = service.calcPeri();
		System.out.println("area " + MyUtil.round2places(area));
		System.out.println("peri " + peri);
	}

}
