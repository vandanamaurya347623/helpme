package org.jsmart.zerocode.testhelp.tests;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("hello_world_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class HelloWorldTest {

    @Test
    @JsonTestCase("hello_world/hello_world_get.json")
    public void testHelloWorld_onlineRestApi() throws Exception {

    }

}

/*

-----------------------------------------------------------------
- "src/test/resources/hello_world/hello_world_get.json" contains:
-----------------------------------------------------------------
{
    "scenarioName": "scenario_hello_world_get",
    "steps": [
        {
            "name": "get_user_details",
            "url": "/posts/1",
            "operation": "GET",
            "request": {
            },
            "assertions": {
                "status": 200,
                "body": {
                    "id": 1,
                    "userId": 1,
                    "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit"
                }
            }
        }
    ]
}

------------------------------------------------------------
-  "rc/test/resources/hello_world_host.properties" contains:
------------------------------------------------------------
# Web Server host and port
restful.application.endpoint.host=https://jsonplaceholder.typicode.com
restful.application.endpoint.port=443

# Web Service context; Leave it blank in case you do not have a common context
restful.application.endpoint.context=

*/
