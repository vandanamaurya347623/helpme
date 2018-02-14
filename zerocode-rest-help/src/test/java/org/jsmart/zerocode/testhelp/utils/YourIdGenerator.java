package org.jsmart.zerocode.testhelp.utils;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class YourIdGenerator {

    @Inject
    @Named("jdbc.url.host")
    private String jdbcHost;

    public String create(String somePrefix){

        return somePrefix + "with-001";

    }

    public InternalId createInternalId(String somePrefix){

        System.out.println("######### jdbcHost injected: " + jdbcHost);

        return new InternalId(somePrefix + "internal-");

    }

    public String createStaticString(String exactString){

        return exactString;

    }

    public InternalId createStaticJson(String exactString){

        return new InternalId(exactString);

    }

    class InternalId {
        private String id;

        public InternalId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}

