package com.ipssi.rfid.excel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import com.ipssi.beans.ExcelBean;



/**
 * Encapsulates excel mock data behavior for the represented example workflow.
 */
public class ExcelMockData {

	private List<ExcelBean> excelData;

	/**
 * Creates a configured excel mock data instance for the represented workflow.
 */
	public ExcelMockData() {
	}

	/**
 * Retrieves or locates get excel data data needed for decision-making.
 */
	public List<ExcelBean> getExcelData() {
		if (excelData == null) {
			populateExcelData();
		}
		return excelData;
	}

	/**
 * Updates set excel data while keeping domain data consistent.
 */
	public void setExcelData(List<ExcelBean> excelData) {
		this.excelData = excelData;
	}

	/**
 * Performs the populate excel data operation required by the represented example.
 */
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

	/**
 * Retrieves or locates get random string data needed for decision-making.
 */
	private String getRandomString() {
		SecureRandom random = new SecureRandom();
		return new BigInteger(130, random).toString(32);
	}

}