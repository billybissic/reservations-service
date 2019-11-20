/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package repository;

/**
 * @author Billy Bissic
 *
 */
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import domain.InquiryStatus;

public interface InquiryStatusRepository extends CrudRepository<InquiryStatus, Integer> {

	@Query("SELECT inquiry_status_id, inquiry_status_name, inquiry_status_description FROM InquiryStatus WHERE inquiry_status_id = ?1")
	Optional<InquiryStatus> findById(Integer inquiry_status_id);
	
	@Query("SELECT inquiry_status_id, inquiry_status_name, inquiry_status_description FROM InquiryStatus WHERE inquiry_status_id = ?1")
	InquiryStatus getById(Integer inquiry_status_id);

	@Transactional
	@Modifying
	@Query("DELETE FROM InquiryStatus WHERE inquiry_status_id = ?1")
	void deleteById(Integer inquiry_status_id);

}
