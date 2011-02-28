package org.grailsug.dell

class Categories {

	String categoryname

	static mapping = {
		id column: "category", generator: "assigned"
		version false
	}

	static constraints = {
		categoryname maxSize: 50
	}
}
