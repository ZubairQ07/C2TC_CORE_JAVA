package assignment_2;

public class Version_Of_OS {

	public static void main(String[] args) {
		System.out.print("The Name of the Operating System: ");
		System.out.println(System.getProperty("os.name"));

		System.out.print("The version of the Operating System: ");
		System.out.println(System.getProperty("os.version"));

	}

}
