package org.grailsug.dell

class Inventory {

	Integer quanInStock
	Integer sales

	static mapping = {
		id column: "prod_id", generator: "assigned"
		version false
	}
}
