/**
 * 
 */
package com.uvm.sweetjane.model;

import javax.persistence.*;

/**
 * @author Andres Ramirez
 *
 */
@Entity
public class Authority {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String authority;
	
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
}