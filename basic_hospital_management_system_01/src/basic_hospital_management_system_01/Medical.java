package basic_hospital_management_system_01;

import java.util.Scanner;

public class Medical {
	String med_name, med_comp, exp_date;
	int med_cost, count;

	void new_medi() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("name:-");
			med_name = input.nextLine();
			System.out.print("comp:-");
			med_comp = input.nextLine();
			System.out.print("exp_date:-");
			exp_date = input.nextLine();
			System.out.print("cost:-");
			med_cost = input.nextInt();
			System.out.print("no of unit:-");
			count = input.nextInt();
		}
	}

	void find_medi() {
		System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
	}
}
