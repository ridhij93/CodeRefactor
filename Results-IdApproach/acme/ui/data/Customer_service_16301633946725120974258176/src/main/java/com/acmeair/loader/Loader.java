/**
 * ****************************************************************************
 *  Copyright (c) 2013-2016 IBM Corp.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * *****************************************************************************
 */
package com.acmeair.loader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import com.ibm.research.cma.api.MicroserviceApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@ApplicationScoped
public class Loader {

    public String queryLoader() {
        return (String) null;
    }

    public String loadDB(long numCustomers) {
        return (String) null;
    }

    public String loadCustomerDB(long numCustomers) {
        return (String) null;
    }

    public String loadFlightDB() {
        return (String) null;
    }

    public String clearSessionDB() {
        return (String) null;
    }

    public String clearBookingDB() {
        return (String) null;
    }

    public static void main(String[] args) throws Exception {
        return;
    }

    private String execute() {
        return (String) null;
    }

    private String execute(long numCustomers) {
        return (String) null;
    }

    private String executeCustomerDB(long numCustomers) {
        return (String) null;
    }

    private String executeFlightDB() {
        return (String) null;
    }

    private String executeSessionDB() {
        return (String) null;
    }

    private String executeBookingDB() {
        return (String) null;
    }

    private void lookupDefaults() {
        return;
    }

    private Properties getProperties() {
        return (Properties) null;
    }

    /*
	private void execute(String args[]) {
		ApplicationContext ctx = null;
         //
         // Get Properties from loader.properties file. 
         // If the file does not exist, use default values
         //
		Properties props = new Properties();
		String propFileName = "/loader.properties";
		try{			
			InputStream propFileStream = Loader.class.getResourceAsStream(propFileName);
			props.load(propFileStream);
		//	props.load(new FileInputStream(propFileName));
		}catch(FileNotFoundException e){
			logger.info("Property file " + propFileName + " not found.");
		}catch(IOException e){
			logger.info("IOException - Property file " + propFileName + " not found.");
		}
		
        String numCustomers = props.getProperty("loader.numCustomers","100");
    	System.setProperty("loader.numCustomers", numCustomers);

		String type = null;
		String lookup = REPOSITORY_LOOKUP_KEY.replace('.', '/');
		javax.naming.Context context = null;
		javax.naming.Context envContext;
		try {
			context = new javax.naming.InitialContext();
			envContext = (javax.naming.Context) context.lookup("java:comp/env");
			if (envContext != null)
				type = (String) envContext.lookup(lookup);
		} catch (NamingException e) {
			// e.printStackTrace();
		}
		
		if (type != null) {
			logger.info("Found repository in web.xml:" + type);
		}
		else if (context != null) {
			try {
				type = (String) context.lookup(lookup);
				if (type != null)
					logger.info("Found repository in server.xml:" + type);
			} catch (NamingException e) {
				// e.printStackTrace();
			}
		}

		if (type == null) {
			type = System.getProperty(REPOSITORY_LOOKUP_KEY);
			if (type != null)
				logger.info("Found repository in jvm property:" + type);
			else {
				type = System.getenv(REPOSITORY_LOOKUP_KEY);
				if (type != null)
					logger.info("Found repository in environment property:" + type);
			}
		}

		if (type ==null) // Default to wxsdirect
		{
			type = "wxsdirect";
			logger.info("Using default repository :" + type);
		}
		if (type.equals("wxsdirect"))
			ctx = new AnnotationConfigApplicationContext(WXSDirectAppConfig.class);
		else if (type.equals("mongodirect"))
			ctx = new AnnotationConfigApplicationContext(MongoDirectAppConfig.class);
		else
		{
			logger.info("Did not find a matching config. Using default repository wxsdirect instead");
			ctx = new AnnotationConfigApplicationContext(WXSDirectAppConfig.class);
		}
		
		FlightLoader flightLoader = ctx.getBean(FlightLoader.class);
		CustomerLoader customerLoader = ctx.getBean(CustomerLoader.class);
		
		try {
			long start = System.currentTimeMillis();
			logger.info("Start loading flights");
			flightLoader.loadFlights();
			logger.info("Start loading " +  numCustomers + " customers");
			customerLoader.loadCustomers(Long.parseLong(numCustomers));
			long stop = System.currentTimeMillis();
			logger.info("Finished loading in " + (stop - start)/1000.0 + " seconds");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
    public int id = 0;

    public static Loader getObject(int id) {
        Loader obj = (Loader) new Object();
        obj.id = id;
        return obj;
    }
    /*
	private void execute(String args[]) {
		ApplicationContext ctx = null;
         //
         // Get Properties from loader.properties file. 
         // If the file does not exist, use default values
         //
		Properties props = new Properties();
		String propFileName = "/loader.properties";
		try{			
			InputStream propFileStream = Loader.class.getResourceAsStream(propFileName);
			props.load(propFileStream);
		//	props.load(new FileInputStream(propFileName));
		}catch(FileNotFoundException e){
			logger.info("Property file " + propFileName + " not found.");
		}catch(IOException e){
			logger.info("IOException - Property file " + propFileName + " not found.");
		}
		
        String numCustomers = props.getProperty("loader.numCustomers","100");
    	System.setProperty("loader.numCustomers", numCustomers);

		String type = null;
		String lookup = REPOSITORY_LOOKUP_KEY.replace('.', '/');
		javax.naming.Context context = null;
		javax.naming.Context envContext;
		try {
			context = new javax.naming.InitialContext();
			envContext = (javax.naming.Context) context.lookup("java:comp/env");
			if (envContext != null)
				type = (String) envContext.lookup(lookup);
		} catch (NamingException e) {
			// e.printStackTrace();
		}
		
		if (type != null) {
			logger.info("Found repository in web.xml:" + type);
		}
		else if (context != null) {
			try {
				type = (String) context.lookup(lookup);
				if (type != null)
					logger.info("Found repository in server.xml:" + type);
			} catch (NamingException e) {
				// e.printStackTrace();
			}
		}

		if (type == null) {
			type = System.getProperty(REPOSITORY_LOOKUP_KEY);
			if (type != null)
				logger.info("Found repository in jvm property:" + type);
			else {
				type = System.getenv(REPOSITORY_LOOKUP_KEY);
				if (type != null)
					logger.info("Found repository in environment property:" + type);
			}
		}

		if (type ==null) // Default to wxsdirect
		{
			type = "wxsdirect";
			logger.info("Using default repository :" + type);
		}
		if (type.equals("wxsdirect"))
			ctx = new AnnotationConfigApplicationContext(WXSDirectAppConfig.class);
		else if (type.equals("mongodirect"))
			ctx = new AnnotationConfigApplicationContext(MongoDirectAppConfig.class);
		else
		{
			logger.info("Did not find a matching config. Using default repository wxsdirect instead");
			ctx = new AnnotationConfigApplicationContext(WXSDirectAppConfig.class);
		}
		
		FlightLoader flightLoader = ctx.getBean(FlightLoader.class);
		CustomerLoader customerLoader = ctx.getBean(CustomerLoader.class);
		
		try {
			long start = System.currentTimeMillis();
			logger.info("Start loading flights");
			flightLoader.loadFlights();
			logger.info("Start loading " +  numCustomers + " customers");
			customerLoader.loadCustomers(Long.parseLong(numCustomers));
			long stop = System.currentTimeMillis();
			logger.info("Finished loading in " + (stop - start)/1000.0 + " seconds");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
}

