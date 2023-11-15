import java.util.*;

class Person {
	public String name;
	protected int age;
	private String note = "None";
	String job;

	public void setNote(String note) {
		this.note = note;
	}

	public String getNote() {
		return this.note;
	}

	@Override
	public String toString() {
		return "Name: " + name + " | Job: " + job + " | Age: " + age + " | Note: " + getNote();
	}
}

class Student extends Person {
	public void set(String name, int age) {
		this.name = name;
		this.age = age;
		this.job = "Student";
	}
}

class StudentResearcher extends Person {
	public void set(String name, int age, String note) {
		this.name = name;
		this.age = age;
		this.job = "Student Researcher";
		setNote(note);
	}
}
public class OOP1018_1 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			int n = scanner.nextInt();  
			scanner.nextLine();         

			List<String> results = new ArrayList<>();

			int count = 0;
			while (count < n && scanner.hasNextLine()) {
				String[] parts = scanner.nextLine().split(" ");
					if (parts.length >= 2) {
							if (parts[1].equals("Student") && parts.length == 3) {
									Student student = new Student();
									student.set(parts[0], Integer.parseInt(parts[2]));
									results.add(student.toString());
									count++;
							} else if (parts[1].equals("Student_Researcher") && parts.length == 4) {
									StudentResearcher researcher = new StudentResearcher();
									researcher.set(parts[0], Integer.parseInt(parts[2]), parts[3]);
									results.add(researcher.toString());
									count++;
							} else {
									results.add("다시 입력해주세요.");
									n++; 
							}
					} else {
							results.add("다시 입력해주세요.");
							n++; 
					}
			}

			for (String result : results) {
					System.out.println(result);
			}

			scanner.close();
	}
}
