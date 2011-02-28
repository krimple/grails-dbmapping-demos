package org.grailsug.dell

class Customers {

	String firstname
	String lastname
	String address1
	String address2
	String city
	String state
	Integer zip
	String country
	Short region
	String email
	String phone
	Integer creditcardtype
	String creditcard
	String creditcardexpiration
	String username
	String password
	Short age
	Integer income
	String gender

	static hasMany = [custHists: CustHist,
	                  orderses: Order]

	static mapping = {
		id column: "customerid", generator: "assigned"
		version false
	}

	static constraints = {
		firstname maxSize: 50
		lastname maxSize: 50
		address1 maxSize: 50
		address2 nullable: true, maxSize: 50
		city maxSize: 50
		state nullable: true, maxSize: 50
		zip nullable: true
		country maxSize: 50
		email nullable: true, maxSize: 50
		phone nullable: true, maxSize: 50
		creditcard maxSize: 50
		creditcardexpiration maxSize: 50
		username maxSize: 50, unique: true
		password maxSize: 50
		age nullable: true
		income nullable: true
		gender nullable: true, maxSize: 1
	}
}
