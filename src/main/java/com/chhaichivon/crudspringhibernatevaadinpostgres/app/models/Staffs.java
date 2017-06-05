package com.chhaichivon.crudspringhibernatevaadinpostgres.app.models;

import javax.persistence.*;

/**
 * Created by Kan-Chanproseth on 5/30/2017.
 */

@Entity
@Table(name = "staffs_tbl")
public class Staffs {

		@Id
		@GeneratedValue(generator="staff_id", strategy=GenerationType.SEQUENCE)
		@Column(name="staff_id")
		private long staffId;

		@Column(name="first_name")
		private String firstName;

		@Column(name = "last_name")
		private String lastName;

		@Column(name = "email")
		private String email;

		@Column(name="img_url")
		private String img;

		@Column(name="status")
		private Boolean status;

		public long getStaffId() {
			return staffId;
		}

		public void setStaffId(long staffId) {
			this.staffId = staffId;
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getImg() {
			return img;
		}

		public void setImg(String img) {
			this.img = img;
		}

		public Boolean getStatus() {
			return status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}
}
