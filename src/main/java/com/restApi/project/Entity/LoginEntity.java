
package com.restApi.project.Entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="login")
public class LoginEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
        private int id;
        
        @Column(name="Email")
        private String email;
        
        @Column(name="Password")
        private String password;
        
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public LoginEntity(int id, String email, String password) {
			super();
			this.id = id;
			this.email = email;
			this.password = password;
		}
		
		
		public LoginEntity() {
	
		}
        
}
