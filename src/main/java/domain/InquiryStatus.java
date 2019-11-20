/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

/**
 * @author Billy Bissic
 *
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InquiryStatus {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer inquiry_status_id;
	private String inquiry_status_name;
	private String inquiry_status_description;
	
	/**
	 * @return the inquiry_status_id
	 */
	public Integer getInquiry_status_id() {
		return inquiry_status_id;
	}
	/**
	 * @param inquiry_status_id the inquiry_status_id to set
	 */
	public void setInquiry_status_id(Integer inquiry_status_id) {
		this.inquiry_status_id = inquiry_status_id;
	}
	/**
	 * @return the inquiry_status_name
	 */
	public String getInquiry_status_name() {
		return inquiry_status_name;
	}
	/**
	 * @param inquiry_status_name the inquiry_status_name to set
	 */
	public void setInquiry_status_name(String inquiry_status_name) {
		this.inquiry_status_name = inquiry_status_name;
	}
	/**
	 * @return the inquiry_status_description
	 */
	public String getInquiry_status_description() {
		return inquiry_status_description;
	}
	/**
	 * @param inquiry_status_description the inquiry_status_description to set
	 */
	public void setInquiry_status_description(String inquiry_status_description) {
		this.inquiry_status_description = inquiry_status_description;
	}
	
}
