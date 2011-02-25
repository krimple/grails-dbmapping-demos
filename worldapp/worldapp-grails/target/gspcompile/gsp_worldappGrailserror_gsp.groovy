import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_worldappGrailserror_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/error.gsp" }
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
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',24,[:],body1)
printHtmlPart(4)
body1 = new GroovyPageTagBody(this,binding.webRequest, {
printHtmlPart(5)
codecOut.print(request.'javax.servlet.error.status_code')
printHtmlPart(6)
codecOut.print(request.'javax.servlet.error.message'.encodeAsHTML())
printHtmlPart(7)
codecOut.print(request.'javax.servlet.error.servlet_name')
printHtmlPart(8)
codecOut.print(request.'javax.servlet.error.request_uri')
printHtmlPart(9)
if(true && (exception)) {
printHtmlPart(10)
codecOut.print(exception.message?.encodeAsHTML())
printHtmlPart(11)
codecOut.print(exception.cause?.message?.encodeAsHTML())
printHtmlPart(12)
codecOut.print(exception.className)
printHtmlPart(13)
codecOut.print(exception.lineNumber)
printHtmlPart(14)
(exception.codeSnippet).each { cs ->
printHtmlPart(15)
codecOut.print(cs?.encodeAsHTML())
printHtmlPart(16)
}
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (exception)) {
printHtmlPart(19)
(exception.stackTraceLines).each { 
codecOut.print(it.encodeAsHTML())
printHtmlPart(20)
}
printHtmlPart(21)
}
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',53,[:],body1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1298667991000L
public static final String DEFAULT_CODEC = null
}
