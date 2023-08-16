/*
package com.myaem.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Component(service = {Servlet.class})
@SlingServletResourceTypes(
        resourceTypes = "Demo/components/myHeroComponent",
        methods = HttpConstants.METHOD_GET,
        extensions = "html")
@ServiceDescription("Demo Servlet")
public class DemoServlet extends SlingSafeMethodsServlet {
    @Override
    protected void doGet ( final SlingHttpServletRequest req , final SlingHttpServletResponse resp ) throws ServletException, IOException {
        final Resource resource = req.getResource ();
        ResourceResolver resourceResolver = req.getResourceResolver ();
        Resource res = resourceResolver.resolve ( "/content/Demo/us/my-first-template/jcr:content/root/myherocomponent" );
//        ResourceResolver resour = req.getResourceResolver ().getResource ( "" )
        // Get 10th record data
        URL getUrl = new URL ( "https://loripsum.net/api/10/short/headers" );

        HttpURLConnection conection = (HttpURLConnection) getUrl.openConnection ();

        // Set request method
        conection.setRequestMethod ( "GET" );

        // Getting response code
        int responseCode = conection.getResponseCode ();

        // If responseCode is 200 means we get data successfully
        if ( responseCode == HttpURLConnection.HTTP_OK ) {
            BufferedReader in = new BufferedReader ( new InputStreamReader ( conection.getInputStream () ) );
            StringBuffer jsonResponseData = new StringBuffer ();
            String readLine = null;

            // Append response line by line
            while ((readLine = in.readLine ()) != null) {
                jsonResponseData.append ( readLine );

            }

            in.close ();
            // Print result in string format
//            System.out.println("JSON String Data " + jsonResponseData.toString());
            resp.setContentType ( "text/plain" );
            resp.getWriter ().write ( "<h4>Title of the component" + jsonResponseData + "</h4>" + res.getName ().toUpperCase () );

        } else {
//            System.out.println(responseCode);
            resp.setContentType ( "text/plain" );
            resp.getWriter ().write ( "<h4>you received an error" + responseCode + "</h4>" + res.getName ().toUpperCase () );


        }

    }
}

*/
