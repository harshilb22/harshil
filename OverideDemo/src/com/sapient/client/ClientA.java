package com.sapient.client;

import com.sapient.beans.Nokia1100;
import com.sapient.beans.NokiaLumia;

public class ClientA {

	public static void main(String[] args){
		NokiaLumia obj = new NokiaLumia();
		obj.doConverse();
		obj.sendSms();
		obj.do2gconverse();
		obj.captureVideo();
	}
	
	
}
