/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package controller;

import org.springframework.hateoas.VndErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import exception.InquiryStatusCodesNotFoundException;


/**
 * @author Billy Bissic
 *
 */
@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class BookingInquiryControllerAdvice {

	@ResponseBody
	@ExceptionHandler(InquiryStatusCodesNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	VndErrors inquiryStatusCodesNotFoundException(InquiryStatusCodesNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
}
