package com.template.pojo;

public enum  RequestType {
    ACTION(Values.ACTION), DIALOG(Values.DIALOG);

    private String type;

    private RequestType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static class Values {
        public static final String ACTION = "";
        public static final String DIALOG = "dialog_submission";
    }
}
