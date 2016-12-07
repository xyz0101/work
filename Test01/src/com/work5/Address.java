package com.work5;

public class Address {
		private String name;
		private String street;
		private String shi;
		private String provence;
		private String contry;
		private String code;
		@Override
		public String toString() {
			return "\nname=" + name + "\nstreet=" + street + "\nshi="
					+ shi + "\nprovence=" + provence + "\ncontry=" + contry
					+ "\ncode=" + code+"\n" ;
		}
		public Address(String name, String street, String shi, String provence,
				String contry, String code) {
			super();
			this.name = name;
			this.street = street;
			this.shi = shi;
			this.provence = provence;
			this.contry = contry;
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getShi() {
			return shi;
		}
		public void setShi(String shi) {
			this.shi = shi;
		}
		public String getProvence() {
			return provence;
		}
		public void setProvence(String provence) {
			this.provence = provence;
		}
		public String getContry() {
			return contry;
		}
		public void setContry(String contry) {
			this.contry = contry;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
}
