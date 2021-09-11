package ExtraCollection;

import Array2Assign.Student;

public class Student1 implements Comparable<Student1> {

	
		private int id;
		private String name;
		private int Percent;
		public Student1(int id, String name, int percent) {
			super();
			this.id = id;
			this.name = name;
			Percent = percent;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPercent() {
			return Percent;
		}
		public void setPercent(int percent) {
			Percent = percent;
		}
		@Override
		public String toString() {
			return "Student1 [id=" + id + ", name=" + name + ", Percent="
					+ Percent + "]";
		}
		

	public int compareTo(Student1 s1)
	{
		return this.id.compareTo(s1.id);
	}
	
	}