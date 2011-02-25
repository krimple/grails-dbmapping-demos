import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_worldappGrails_gsqltestindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gsqltest/index.gsp" }
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
if(true && ("{not empty results}")) {
printHtmlPart(2)
(results).each { country ->
printHtmlPart(3)
codecOut.print(country.name)
printHtmlPart(4)
}
printHtmlPart(5)
}
else {
printHtmlPart(6)
}
printHtmlPart(7)
})
invokeTag('captureBody','sitemesh',16,[:],body1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1298667991000L
public static final String DEFAULT_CODEC = null
}
