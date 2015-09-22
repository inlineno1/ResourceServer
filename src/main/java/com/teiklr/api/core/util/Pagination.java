package com.teiklr.api.core.util;

import java.util.Iterator;
import java.util.List;

public class Pagination<T> implements Page<T> {
	
	/**
	 * 
	 */
	private List<T> contents;
	
	/**
	 * 
	 */
	private long totalElements;
	
	/**
	 * 
	 */
	private int offset;
	
	/**
	 * 
	 */
	private int size;
		
	/**
	 * 
	 */
	public Pagination(List<T> contents, int totalElements, int offset, int size) {
		this.contents = contents;
		this.totalElements = totalElements;
		this.offset = offset;
		this.size = size;
	}
	  
	@Override
	public int getTotalPages() {
		return this.size == 0 ? 1 : (int) Math.ceil((double) getTotalElements() / (double) getSize());
	}
	
	@Override
	public long getTotalElements() {
		return this.totalElements;
	}

	@Override
	public int getNumber() {
		return getOffset() / getSize();
	}

	@Override
	public int getNumberOfElements() {
		return getContents() != null ? getContents().size() : 0;
	}

	@Override
	public List<T> getContents() {
		return this.contents;
	}

	@Override
	public boolean hasContent() {
		return getContents() != null && !getContents().isEmpty();
	}
	
	@Override
	public boolean hasPrevious() {
		return getNumber() > 0;
	}
	
	@Override
	public boolean isFirst() {
		return !hasPrevious();
	}
	
	@Override
	public boolean hasNext() {
		return getNumber() + 1 < getTotalPages();
	}

	@Override
	public boolean isLast() {
		return !hasNext();
	} 
	
	public int getOffset() {
		return this.offset;
	}

	public int getSize() {
		return this.size;
	}
	
	public int getNextOffset() {
		return hasNext() ? getOffset() + getSize() : getOffset();
	}

	public Iterator<T> iterator() {
		return getContents().iterator();
	}
}