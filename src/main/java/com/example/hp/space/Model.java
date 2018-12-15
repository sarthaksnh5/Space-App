package com.example.hp.space;

public class Model {
    String tilte;
    String desc;
    int icon;

    public Model(String tilte, String desc, int icon) {
        this.tilte = tilte;
        this.desc = desc;
        this.icon = icon;
    }

    public String getTilte() {
        return this.tilte;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getIcon() {
        return this.icon;
    }
}
