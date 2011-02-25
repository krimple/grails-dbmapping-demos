package com.chariot.grailsdemo.world

class Country {
	
	def id
	def name
	def continent
	def region
	def surfacearea	
	
	String toString() {
		"""$name [id = $id, continent = $continent, 
			region = $region, surfacearea = $surfacearea]""" 
		
	}
}
