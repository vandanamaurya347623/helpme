package org.jsmart.zerocode.testhelp.utils;

public class DbCleanUp {

    public void executeSql(String dbScriptFileName){
        System.out.println("Finished executing:" + dbScriptFileName);
    }

    public String create(String somePrefix){

        return somePrefix + "with-001";

    }

    public InternalId createInternalId(String somePrefix){

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

