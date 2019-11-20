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
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import domain.ContactTimes;

public interface ContactTimesRepository extends CrudRepository<ContactTimes, Integer> {

	@Transactional
	@Modifying
	@Query("DELETE FROM ContactTimes WHERE contact_timeframe_id = ?1")
	void deleteById(Integer contact_timeframe_id);
}
