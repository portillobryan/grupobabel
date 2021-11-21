package com.co.grupobabel.models;

public class calculatorModel {

    private String build;
    private String first_number;
    private String second_number;
    private String operation;
    private String answer;

    public calculatorModel(String build, String first_number, String second_number, String operation, String answer) {
        this.build = build;
        this.first_number = first_number;
        this.second_number = second_number;
        this.operation = operation;
        this.answer = answer;
    }

    public String getBuild() {
        return build;
    }

    public String getFirst_number() {
        return first_number;
    }

    public String getSecond_number() {
        return second_number;
    }

    public String getOperation() {
        return operation;
    }

    public String getAnswer() {
        return answer;
    }
}
