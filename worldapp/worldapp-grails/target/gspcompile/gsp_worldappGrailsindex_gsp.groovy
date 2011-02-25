import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_worldappGrailsindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
def params = binding.params
def request = binding.request
def flash = binding.flash
def response = binding.response
def out = binding.out
def codecOut = binding.codecOut
registerSitemeshPreprocessMode(request)
printHtmlPart(0)
body1 = new GroovyPageTagBody(this,binding.webRequest, {
printHtmlPart(1)
body2 = createClosureForHtmlPart(2)
invokeTag('captureTitle','sitemesh',3,[:],body2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")] as GroovyPageAttributes,null)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',52,[:],body1)
printHtmlPart(4)
body1 = new GroovyPageTagBody(this,binding.webRequest, {
printHtmlPart(5)
invokeTag('meta','g',60,['name':("app.version")] as GroovyPageAttributes,null)
printHtmlPart(6)
invokeTag('meta','g',61,['name':("app.grails.version")] as GroovyPageAttributes,null)
printHtmlPart(7)
codecOut.print(org.codehaus.groovy.runtime.InvokerHelper.getVersion())
printHtmlPart(8)
codecOut.print(System.getProperty('java.version'))
printHtmlPart(9)
codecOut.print(grailsApplication.controllerClasses.size())
printHtmlPart(10)
codecOut.print(grailsApplication.domainClasses.size())
printHtmlPart(11)
codecOut.print(grailsApplication.serviceClasses.size())
printHtmlPart(12)
codecOut.print(grailsApplication.tagLibClasses.size())
printHtmlPart(13)
invokeTag('set','g',72,['var':("pluginManager"),'value':(applicationContext.getBean('pluginManager'))] as GroovyPageAttributes,null)
printHtmlPart(14)
(pluginManager.allPlugins).each { plugin ->
printHtmlPart(15)
codecOut.print(plugin.name)
printHtmlPart(16)
codecOut.print(plugin.version)
printHtmlPart(17)
}
printHtmlPart(18)
(grailsApplication.controllerClasses.sort { it.fullName }).each { c ->
printHtmlPart(19)
body3 = new GroovyPageTagBody(this,binding.webRequest, {
codecOut.print(c.fullName)
})
invokeTag('link','g',94,['controller':(c.logicalPropertyName)] as GroovyPageAttributes,body3)
printHtmlPart(20)
}
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',99,[:],body1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1298667991000L
public static final String DEFAULT_CODEC = null
}
