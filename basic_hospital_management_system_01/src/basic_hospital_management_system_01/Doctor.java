package basic_hospital_management_system_01;

import java.util.Scanner;

public class Doctor {
	String did, dname, specilist, appoint, doc_qual;
	int droom;

	void new_doctor() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("id:-");
			did = input.nextLine();
			System.out.print("name:-");
			dname = input.nextLine();
			System.out.print("specilization:-");
			specilist = input.nextLine();
			System.out.print("work time:-");
			appoint = input.nextLine();
			System.out.print("qualification:-");
			doc_qual = input.nextLine();
			System.out.print("room no.:-");
			droom = input.nextInt();
		}
	}

	void doctor_info() {
		System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual
				+ "       \t" + droom);
	}
}
