package org.grailsug.dell

class Products {

	Integer category
	String title
	String actor
	BigDecimal price
	Short special
	Integer commonProdId

	static mapping = {
		id column: "prod_id", generator: "assigned"
		version false
	}

	static constraints = {
		title maxSize: 50
		actor maxSize: 50
		special nullable: true
	}
}
