import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_worldappGrails_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
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
body2 = new GroovyPageTagBody(this,binding.webRequest, {
invokeTag('layoutTitle','g',4,['default':("Grails")] as GroovyPageAttributes,null)
})
invokeTag('captureTitle','sitemesh',4,[:],body2)
printHtmlPart(2)
codecOut.print(resource(dir:'css',file:'main.css'))
printHtmlPart(3)
codecOut.print(resource(dir:'images',file:'favicon.ico'))
printHtmlPart(4)
invokeTag('layoutHead','g',7,[:],null)
printHtmlPart(1)
invokeTag('javascript','g',8,['library':("application")] as GroovyPageAttributes,null)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',9,[:],body1)
printHtmlPart(5)
body1 = new GroovyPageTagBody(this,binding.webRequest, {
printHtmlPart(6)
codecOut.print(resource(dir:'images',file:'spinner.gif'))
printHtmlPart(7)
codecOut.print(message(code:'spinner.alt',default:'Loading...'))
printHtmlPart(8)
codecOut.print(resource(dir:'images',file:'grails_logo.png'))
printHtmlPart(9)
invokeTag('layoutBody','g',15,[:],null)
printHtmlPart(5)
})
invokeTag('captureBody','sitemesh',16,[:],body1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1298667991000L
public static final String DEFAULT_CODEC = null
}
