package basic_hospital_management_system_01;

import java.util.Scanner;

public class Facility {
	String fec_name;

    void add_feci() {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("fecility:-");
			fec_name = input.nextLine();
		}
	}

    void show_feci() {
        System.out.println(fec_name);
    }
}
