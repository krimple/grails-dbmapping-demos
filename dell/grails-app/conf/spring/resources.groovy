import org.springframework.jmx.support.MBeanServerFactoryBean
import org.springframework.jmx.export.MBeanExporter
import org.hibernate.jmx.StatisticsService
import grails.util.GrailsUtil
beans = {
	//first bean definition
	hibernateStats(StatisticsService) {
		sessionFactory=ref("sessionFactory")
                statisticsEnabled=true
	}

	//second bean definition		
	mbeanServer(MBeanServerFactoryBean) {
		locateExistingServerIfPossible=true
	}

	//third bean definition
	exporter(MBeanExporter) {
		server = mbeanServer
		beans = ["org.hibernate:name=statistics":hibernateStats]
	}
}