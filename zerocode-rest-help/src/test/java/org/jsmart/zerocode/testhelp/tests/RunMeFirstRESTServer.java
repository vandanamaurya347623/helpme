package org.jsmart.zerocode.testhelp.tests;

import org.jsmart.simulator.annotations.ApiRepo;
import org.jsmart.simulator.impl.JsonBasedSimulator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Created by Siddha on 27/04/2015.
 *
 * Are you done with the web server ? To stop this REST server, simply press Ctrl+c or Stop button on your IDE
 *
 */
@ApiRepo("zz_stubs")
public class RunMeFirstRESTServer extends JsonBasedSimulator {
    private static final Logger logger = LoggerFactory.getLogger(RunMeFirstRESTServer.class);

    public static final int PORT = 9999;

    public RunMeFirstRESTServer(int port) {
        super(port);
    }

    public static void main(String[] args) {
        logger.info("\n### REST Helper web-service starting...");

        new RunMeFirstRESTServer(PORT).start();

        logger.info("\n### REST Helper web-service started.");

        System.out.println("\n------ Done? To stop this REST server, simply press Ctrl+c or Stop button on your IDE -------");

    }
}
