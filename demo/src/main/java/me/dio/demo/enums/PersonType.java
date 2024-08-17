package me.dio.demo.enums;

public enum PersonType {

    FISICA("Pessoa Física","F"),
    JURIDICA("Pessoa Juridica", "J");

    private String value;
    private String description;

    PersonType(String description, String value){
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
