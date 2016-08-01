package org.jsmart.zerocode.testhelp.utils;

public class DbCleanUp {

    public void executeSql(String dbScriptFileName){
        System.out.println("Finished executing:" + dbScriptFileName);
    }

    public Status executeSqlReturnStatus(String dbScriptFileName){
        System.out.println("SUCCESS: " + "Finished executing:" + dbScriptFileName);

        return new Status("SUCCESS");
    }


    class Status {
        private String result;

        public Status(String result) {
            this.result = result;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }
}

