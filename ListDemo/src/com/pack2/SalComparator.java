package com.pack2;

import java.util.Comparator;

public class SalComparator implements Comparator<Emp> {

	public static void main(String[] args) {

	}

	@Override
	public int compare(Emp e1, Emp e2) {
		if (e1.getSal() > e2.getSal())
			return 1;
		else if (e1.getSal() < e2.getSal())
			return -1;
		else
			return 0;
	}

}
