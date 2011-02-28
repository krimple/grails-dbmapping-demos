package org.grailsug.dell

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class CustHist implements Serializable {

	Integer customerid
	Integer orderid
	Integer prodId
	Customers customers

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append customerid
		builder.append orderid
		builder.append prodId
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append customerid, other.customerid
		builder.append orderid, other.orderid
		builder.append prodId, other.prodId
		builder.isEquals()
	}

	static belongsTo = [Customers]

	static mapping = {
		id composite: ["customerid", "orderid", "prodId"]
		version false
	}
}
