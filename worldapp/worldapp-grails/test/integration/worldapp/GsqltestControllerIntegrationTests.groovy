package worldapp

import org.apache.log4j.Logger

/**
 * Created by IntelliJ IDEA.
 * User: kenrimple
 * Date: 2/25/11
 * Time: 11:44 AM
 * To change this template use File | Settings | File Templates.
 */
class GsqltestControllerIntegrationTests extends GroovyTestCase {
	
	def logger
	def tc
	
	void setUp() {
		logger = Logger.getLogger(this.class)
		tc = new GsqltestController()
	}
	
	void testControllerGettingSql() {       
        
        def returndata = tc.index()
        def data  = returndata['results']
        logger.debug("data = ${data}")
        assertTrue data.size() > 0
    }
	
	void testCount() {
		def returndata = tc.count()
		def count = returndata['count']
		logger.debug("count = ${count}")
		assertTrue count > 0	
	}
}
