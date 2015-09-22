package com.teiklr.api.core.util;

import java.util.List;

public interface Page<T> extends Iterable<T> {

	/**
	 * 전체 Page count
	 * 
	 * @return
	 */
	int getTotalPages();

	/**
	 * 전체 Data Count
	 * 
	 * @return
	 */
	long getTotalElements();

	/**
	 * 현재 Page
	 * 
	 * @return
	 */
	int getNumber();

	/**
	 * Load 한 content data count
	 * 
	 * @return
	 */
	int getNumberOfElements();

	/**
	 * Content data Object
	 * 
	 * @return
	 */
	List<T> getContents();

	/**
	 * Content data 의 유/무
	 *  
	 * @return
	 */
	boolean hasContent();

	/**
	 * Page의 처음 여/부
	 * 
	 * @return
	 */
	boolean isFirst();

	/**
	 * Page의 마지막 여/부
	 * 
	 * @return
	 */
	boolean isLast();

	/**
	 * 
	 * @return
	 */
	boolean hasNext();

	/**
	 * 
	 * @return
	 */
	boolean hasPrevious();
}