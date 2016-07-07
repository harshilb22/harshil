package com.sapient.util;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import com.sapient.dao.EmpDaoImpl;
import com.sapient.dao.Idao;

/**
 * This class contains utility methods to view resourceBundle and logger
 * 
 * @author hbharg
 * @version 1.0
 */

public class EmpUtil {
	private static ResourceBundle rbundle;
	private static Logger logger;
	static {
		rbundle = ResourceBundle.getBundle("sap");
		logger = Logger.getRootLogger();
	}

	/**
	 * 
	 * @return views resource bundle
	 */
	public static ResourceBundle getBundle() {
		return rbundle;
	}

	/**
	 * 
	 * @return view log4j logger
	 */
	public static Logger viewLogger() {
		return logger;
	}

	/**
	 * 
	 * @return employee dao instance in Idao reference
	 */
	public static Idao getDaoInstance() {

		Idao dao = new EmpDaoImpl();
		return dao;
	}
}
