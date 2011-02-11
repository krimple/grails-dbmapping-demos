package worldapp

import groovy.sql.Sql

class SqltestController {

    def dataSource

    def index = { 
       def db = new Sql(dataSource)
	   [results: db.rows("select * from country")]
    }
}
