import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestWorkspace {

	public static class Student {

		private String name;
		private int grade;

		public Student(String name, int grade) {
			this.name = name;
			this.grade = grade;
		}

		public String getName() {
			return this.name;
		}

		public int getGrade() {
			return this.grade;
		}

	}

	public static void main(String[] args) throws Exception {
		List<Student> list = new ArrayList<Student>();
		list.addAll(Arrays.asList(new Student("Charles", 12), new Student("Daniel", 11)));
		list.stream()
			.filter(student -> student.getGrade() == 12)
			.distinct()
			.forEach(student -> System.out.println(student.getName() + ", " + student.getGrade()));
	}
}
