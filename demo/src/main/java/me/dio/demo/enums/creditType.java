package me.dio.demo.enums;

public enum creditType {

    CREDIT("Credit","C"),
    DEBIT("Debit", "D"),
    CREDIT_DEBIT("Credit and Debit", "CD");

    private String value;
    private String description;

    creditType(String description, String value){
        this.description = description;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
