package ComparableaAndComparatorAssign;

public class AgeComparator  implements Comparable<AgeComparator> {

	
		private int eid;
		private String name;
		private int age;
		public AgeComparator(int eid, String name, int age) {
			super();
			this.eid = eid;
			this.name = name;
			this.age = age;
		}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age= age;
		}
		@Override
		public int compareTo(AgeComparator o) {
			// TODO Auto-generated method stub
			return this.age-o.age;
		}
		@Override
		public String toString() {
			return "Emp1 [eid=" + eid + ", name=" + name + ", age=" + age + "]";
		}
		

	




	




	}


