package worldapp

import groovy.sql.Sql

class GsqltestController {

    def dataSource
	
	def queryService

    def index = { 
       def db = new Sql(dataSource)
	   [results: db.rows("select * from country")]
    }
	
	def count = {		
		[count: queryService.countCountries()]		
	}
}
