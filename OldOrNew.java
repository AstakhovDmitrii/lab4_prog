package com.company;

public enum OldOrNew {


    OLD("старую"), NEW("новую");
    private final String translation;

    OldOrNew(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

}