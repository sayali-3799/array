package com.te.array;

public class Engineer {
	
		void work() {
			System.out.println("Engineer works");
		}
	}

	class SoftwareEngineer extends Engineer {
		void work() {
			System.out.println("SoftwareEngineer works");
		}
	}

	class ElectricalEngineer extends Engineer {
		void work() {
			System.out.println("ElectricalEngineer works");
		}
	}

	class CivilEngineer extends Engineer {
		void work() {
			System.out.println("CivilEngineer works");
		}
	
	public static void main(String []args) {
		CivilEngineer civilEngineer = new CivilEngineer();
		civilEngineer.work();
		
	}

}
