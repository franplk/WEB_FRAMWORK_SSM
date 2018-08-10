package com.web.backend.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtil {

	/**
	 * 获取异常信息栈
	 */
	public static String getStackTrace(Throwable exp) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw, true);
		exp.printStackTrace(pw);
		pw.flush();
		sw.flush();
		return sw.toString();
	}

	public static void main(String[] args) {
		try {
			int num = 100 / 0;
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(getStackTrace(e));
		}
	}
}