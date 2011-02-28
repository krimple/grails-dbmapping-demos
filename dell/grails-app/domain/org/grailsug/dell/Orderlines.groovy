package org.grailsug.dell

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class Orderlines implements Serializable {

	Integer orderid
	Integer orderlineid
	Integer prodId
	Short quantity
	Date orderdate
	Order orders

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append orderid
		builder.append orderlineid
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append orderid, other.orderid
		builder.append orderlineid, other.orderlineid
		builder.isEquals()
	}

	static belongsTo = [Orders]

	static mapping = {
		id composite: ["orderid", "orderlineid"]
		version false
	}

	static constraints = {
		orderdate maxSize: 13
	}
}
