package testCases;

import java.util.Date;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String destination = System.getProperty("user.dir");
		System.out.println(destination+"\\Reports"+"Result1"+".png");
		//System.out.println(date.reportName);

	
	
		Date date = new Date();
		String reportName = date.toString();
		System.out.println(reportName);
		reportName = reportName.replaceAll(":", ".");
		reportName = reportName.replaceAll(" ", "_");
		reportName = reportName.substring(4);
		System.out.println(reportName);
	}

}
