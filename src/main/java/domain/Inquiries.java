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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inquiries {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer inquiry_id;
	private String first_name;
	private String last_name;
	private String day_phone_number;
	private String email_address;
	private Integer requested_party_size;
	private String desired_date;
	private String desired_time;
	private Integer contact_time_id;
	private Integer inquiry_type_id;
	@Column(name = "inquiry_status_id")
	private Integer inquiryStatusId;
	private String inquiry_timestamp;
	private String message;
	//private Integer confirmation_status;
	
	/**
	 * @return the inquiry_id
	 */
	public Integer getInquiry_id() {
		return inquiry_id;
	}
	/**
	 * @param inquiry_id the inquiry_id to set
	 */
	public void setInquiry_id(Integer inquiry_id) {
		this.inquiry_id = inquiry_id;
	}
	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @return the day_phone_number
	 */
	public String getDay_phone_number() {
		return day_phone_number;
	}
	/**
	 * @param day_phone_number the day_phone_number to set
	 */
	public void setDay_phone_number(String day_phone_number) {
		this.day_phone_number = day_phone_number;
	}
	/**
	 * @return the email_address
	 */
	public String getEmail_address() {
		return email_address;
	}
	/**
	 * @param email_address the email_address to set
	 */
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	/**
	 * @return the requested_party_size
	 */
	public Integer getRequested_party_size() {
		return requested_party_size;
	}
	/**
	 * @param requested_party_size the requested_party_size to set
	 */
	public void setRequested_party_size(Integer requested_party_size) {
		this.requested_party_size = requested_party_size;
	}
	/**
	 * @return the desired_date
	 */
	public String getDesired_date() {
		return desired_date;
	}
	/**
	 * @param desired_date the desired_date to set
	 */
	public void setDesired_date(String desired_date) {
		this.desired_date = desired_date;
	}
	/**
	 * @return the desired_time
	 */
	public String getDesired_time() {
		return desired_time;
	}
	/**
	 * @param desired_time the desired_time to set
	 */
	public void setDesired_time(String desired_time) {
		this.desired_time = desired_time;
	}
	/**
	 * @return the contact_time_id
	 */
	public Integer getContact_time_id() {
		return contact_time_id;
	}
	/**
	 * @param contact_time_id the contact_time_id to set
	 */
	public void setContact_time_id(Integer contact_time_id) {
		this.contact_time_id = contact_time_id;
	}
	/**
	 * @return the inquiry_type_id
	 */
	public Integer getInquiry_type_id() {
		return inquiry_type_id;
	}
	/**
	 * @param inquiry_type_id the inquiry_type_id to set
	 */
	public void setInquiry_type_id(Integer inquiry_type_id) {
		this.inquiry_type_id = inquiry_type_id;
	}
	/**
	 * @return the inquiryStatusId
	 */
	public Integer getInquiryStatusId() {
		return inquiryStatusId;
	}
	/**
	 * @param inquiryStatusId the inquiryStatusId to set
	 */
	public void setInquiryStatusId(Integer inquiryStatusId) {
		this.inquiryStatusId = inquiryStatusId;
	}
	/**
	 * @return the inquiry_timestamp
	 */
	public String getInquiry_timestamp() {
		return inquiry_timestamp;
	}
	/**
	 * @param inquiry_timestamp the inquiry_timestamp to set
	 */
	public void setInquiry_timestamp(String inquiry_timestamp) {
		this.inquiry_timestamp = inquiry_timestamp;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
