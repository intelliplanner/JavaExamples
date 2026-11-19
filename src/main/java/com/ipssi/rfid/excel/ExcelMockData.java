package com.ipssi.rfid.excel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import com.ipssi.beans.ExcelBean;

/** Purpose: Encapsulates excel mock data behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class ExcelMockData {

	private List<ExcelBean> excelData;

	/** Purpose: Creates a excel mock data instance. */
	public ExcelMockData() {
	}

	/** Purpose: Retrieves get excel data data. */
	public List<ExcelBean> getExcelData() {
		if (excelData == null) {
			populateExcelData();
		}
		return excelData;
	}

	/** Purpose: Updates set excel data data. */
	public void setExcelData(List<ExcelBean> excelData) {
		this.excelData = excelData;
	}

	/** Purpose: Performs the populate excel data operation. */
	private void populateExcelData() {
		excelData = new ArrayList<ExcelBean>();
		Class<ExcelBean> classz = (Class<ExcelBean>) ExcelBean.class;
		Method[] methods = classz.getMethods();
		for (int i = 0; i < 20000; i++) {
		ExcelBean model = new ExcelBean();
			for (Method method : methods) {
				String methodName = method.getName();
				if (methodName.startsWith("set")) {
					try {
						method.invoke(model, getRandomString());
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
				}
			}
			excelData.add(model);
		}
	}

	/** Purpose: Retrieves get random string data. */
	private String getRandomString() {
		SecureRandom random = new SecureRandom();
		return new BigInteger(130, random).toString(32);
	}

}