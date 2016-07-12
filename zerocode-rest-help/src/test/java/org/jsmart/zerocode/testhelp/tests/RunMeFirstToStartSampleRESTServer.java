package org.jsmart.zerocode.testhelp.tests;

import org.jsmart.simulator.annotations.ApiRepo;
import org.jsmart.simulator.impl.SimpleRestJsonSimulator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Created by Siddha on 27/04/2015.
 *
 * Are you done with the web server ? To stop this REST server, simply press Ctrl+c or Stop button on your IDE
 *
 */
@ApiRepo("zz_ignore")
public class RunMeFirstToStartSampleRESTServer extends SimpleRestJsonSimulator {
    private static final Logger logger = LoggerFactory.getLogger(RunMeFirstToStartSampleRESTServer.class);

    public static final int PORT = 9999;

    public RunMeFirstToStartSampleRESTServer(int port) {
        super(port);
    }

    public static void main(String[] args) {
        logger.info("\n### REST Helper web-service starting...");

        new RunMeFirstToStartSampleRESTServer(PORT).start();

        logger.info("\n### REST Helper web-service started.");

        System.out.println("\n------ Done? To stop this REST server, simply press Ctrl+c or Stop button on your IDE -------");

    }
}
