package com.interview.mcr;

public enum DocumentType {
    PASSPORT("P");

    private String letter;
    DocumentType(String letter) {
        this.letter = letter;
    }
}
