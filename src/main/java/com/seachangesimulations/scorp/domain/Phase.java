package com.seachangesimulations.scorp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/** A phase is an event during a conflict-scenario (role play).
 * Examples might include the Tehran Conference (WWII, Churchill, Stalin, FDR), 
 * a lawsuit settlement conference, or a phone call.
 * @author Skip Cole/Mike Sheliga
 *
 */
@Entity  // Create table in DB
public class Phase extends BaseSCObject {

	// private Long id; From BaseSCObject
	private Long roleplayId;	
	private String phaseName;	
	private String description;
	
	/** Zero argument constructor required by Hibernate. */
	public Phase() {}

	public Long getRoleplayId() {
		return roleplayId;
	}

	public void setRoleplayId(Long roleplayId) {
		this.roleplayId = roleplayId;
	}

	public String getPhaseName() {
		return phaseName;
	}

	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
