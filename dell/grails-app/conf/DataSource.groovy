dataSource {
    pooled = true
	driverClassName = "org.postgresql.Driver"
    username = "postgres"
    password = "postgres"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "verify" // one of 'create', 'create-drop','update'
            url = "jdbc:postgresql:dellstore2"
            dialect = org.hibernate.dialect.PostgreSQLDialect
        }
    }
    test {
        dataSource {
            dbCreate = "verify"
            url = "jdbc:postgresql:dellstore2"
            dialect = org.hibernate.dialect.PostgreSQLDialect
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:hsqldb:file:prodDb;shutdown=true"
        }
    }
}
