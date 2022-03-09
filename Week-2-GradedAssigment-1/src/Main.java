public class Main {

	public static void main(String[] args) {
		AdminDepartment adminDepartment = new AdminDepartment();
		HRDepartment hrDepartment = new HRDepartment();
		TechDepartment techDepartment = new TechDepartment();

		System.out.println("Welcome to "+ adminDepartment.departmentName()); //Welcome to Admin Department
		System.out.println(adminDepartment.getTodaysWork()); //Complete your documents submission
		System.out.println(adminDepartment.getWorkDeadline()); //Complete by EOD
		System.out.println(adminDepartment.isTodayAHoliday()); //Today is not a Holiday

		System.out.println();
		
		System.out.println("Welcome to "+ hrDepartment.departmentName()); //Welcome to HR Department
		System.out.println(hrDepartment.doActivity()); //team Lunch
		System.out.println(hrDepartment.getTodaysWork()); //Fill today’s timesheet and mark your attendance
		System.out.println(hrDepartment.getWorkDeadline()); //Complete by EOD 
		System.out.println(hrDepartment.isTodayAHoliday()); //Today is not a Holiday

		System.out.println();
		
		System.out.println("Welcome to "+ techDepartment.departmentName()); //Welcome to Tech Department
		System.out.println(techDepartment.getTodaysWork()); //Complete coding of Module 1
		System.out.println(techDepartment.getWorkDeadline()); //Complete by EOD
		System.out.println(techDepartment.getTechStackInformation()); //Core Java
		System.out.println(techDepartment.isTodayAHoliday()); //Today is not a Holiday

	}

}
