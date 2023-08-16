package com.myaem.core.servlets;

import com.day.cq.commons.jcr.JcrConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
@Component(service = {Servlet.class})
@SlingServletResourceTypes(
        resourceTypes = "Demo/components/evenNumberFinder",
        methods = HttpConstants.METHOD_GET,
        extensions = "html")
@ServiceDescription("Simple Demo Servlet")
public class SimpleServlet extends SlingSafeMethodsServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet ( final SlingHttpServletRequest req ,
                           final SlingHttpServletResponse resp ) throws ServletException, IOException {
        final Resource resource = req.getResource ();
        ResourceResolver resourceResolver = req.getResourceResolver();
        Resource res = resourceResolver.resolve("/content/Demo/us/my-first-template/jcr:content/root/container/helloworld");
        resp.setContentType ( "text/plain" );
        resp.getWriter ().write ( "<h1>Title = " + resource.getName ()+resource.getValueMap ().get ( "someText" )+resource.getPath ()+"</h1>" +
                "Hello world Text" + res.getValueMap ().get ( "text", String.class ) +res.getResourceType ());
    }

}
