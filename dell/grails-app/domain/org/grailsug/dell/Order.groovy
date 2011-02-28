package org.grailsug.dell

class Order {

	Date orderDate
	BigDecimal netAmount
	BigDecimal taxAmount
	BigDecimal totalamount
	Customers customers

	static hasMany = [orderlines: Orderlines]
	static belongsTo = [Customers]

	static mapping = {
		id column: "orderid", generator: "assigned"
		orderDate column: "orderdate"
		netAmount column: "netamount"
		taxAmount column: "tax"
		totalAmount column: "total"		
		version false
	}

	static constraints = {
		orderDate maxSize: 13
	}
}
