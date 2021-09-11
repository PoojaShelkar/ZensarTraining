package ArrayList;

import TreeMap.Emp;

public class Student22 implements Comparable<Student22 >
{
		
	        private int sid;
			private String name;
			private int percent;
			public Student22(int sid, String name, int percent) {
				super();
				this.sid = sid;
				this.name = name;
				this. percent =  percent;
			}
			public int getSid() {
				return sid;
			}
			public void setSid(int sid) {
				this.sid = sid;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getPercent() {
				return  percent;
			}
			public void setPercent(int  percent) {
				this. percent = percent;
			}
			@Override
			public int compareTo(Student22 o) {
				// TODO Auto-generated method stub
				return this.percent-o.percent;
			}
			@Override
			public String toString() {
				return "Student22 [sid=" + sid + ", name=" + name + ",  percent=" +  percent+ "]";
			}
			

		


	}


