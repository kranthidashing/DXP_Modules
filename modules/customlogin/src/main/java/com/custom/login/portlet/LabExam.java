package com.custom.login.portlet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabExam{
	public int CustomerId;
	public String CustomerName;
	public int BillBalance;
	public String EmailId;
	public String Tax_liability;
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getBillBalance() {
		return BillBalance;
	}
	public void setBillBalance(int billBalance) {
		BillBalance = billBalance;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getTax_liability() {
		return Tax_liability;
	}
	public void setTax_liability(String tax_liability) {
		Tax_liability = tax_liability;
	}
    public static void main(String[] args) throws FileNotFoundException {
    	System.out.println("hiiiiiiiiii");
		/*List<LabExam> LE = new ArrayList<LabExam>();
		File file = new File("C:\\Users\\kranthi.kumar\\Desktop\\test.txt");
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");

		System.out.println(sc.next());*/
	}
}