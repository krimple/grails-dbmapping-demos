package org.grailsug.dell

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class Reorder implements Serializable {

	Integer prodId
	Date dateLow
	Integer quanLow
	Date dateReordered
	Integer quanReordered
	Date dateExpected

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append prodId
		builder.append dateLow
		builder.append quanLow
		builder.append dateReordered
		builder.append quanReordered
		builder.append dateExpected
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append prodId, other.prodId
		builder.append dateLow, other.dateLow
		builder.append quanLow, other.quanLow
		builder.append dateReordered, other.dateReordered
		builder.append quanReordered, other.quanReordered
		builder.append dateExpected, other.dateExpected
		builder.isEquals()
	}

	static mapping = {
		id composite: ["prodId", "dateLow", "quanLow", "dateReordered", "quanReordered", "dateExpected"]
		version false
	}

	static constraints = {
		dateLow maxSize: 13
		dateReordered nullable: true, maxSize: 13
		quanReordered nullable: true
		dateExpected nullable: true, maxSize: 13
	}
}
