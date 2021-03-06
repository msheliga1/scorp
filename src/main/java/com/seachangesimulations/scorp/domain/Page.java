package com.seachangesimulations.scorp.domain;

import javax.persistence.Entity;

/**
 * A 'page' where a user (acting like an Actor) can act in the performance.
 * Three representative examples: XXXX
 */
@Entity  // Create Page table in DB
public class Page extends BaseSCObject {

	// private Long id; - from base class	
	private Long roleplayId;	
	private String pageName;	
	private String description;
	
	/** Zero argument constructor required by Hibernate. */
	public Page() {}

	public Long getRoleplayId() {
		return roleplayId;
	}

	public void setRoleplayId(Long roleplayId) {
		this.roleplayId = roleplayId;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
} // end class PageSub

