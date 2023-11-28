package com.cg.dardenrestapi.bean;


	
	public class Student {
		private long id;
		private String firstName;
		private String lastName;
		//public Student() {
		//	super();
			// TODO Auto-generated constructor stub
		//}
		public Student(long id, String firstName, String lastName) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	}