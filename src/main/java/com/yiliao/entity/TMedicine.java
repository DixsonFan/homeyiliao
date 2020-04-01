package com.yiliao.entity;

public class TMedicine {
    private int idMedicine;
    private String nameMedicine;
    private String classicMedicine;
    private String tag;


    public TMedicine() {
    }

    public TMedicine(String nameMedicine) {
        this.nameMedicine = nameMedicine;
    }

    public int getIdMedicine() {
        return idMedicine;
    }

    public void setIdMedicine(int idMedicine) {
        this.idMedicine = idMedicine;
    }

    public String getNameMedicine() {
        return nameMedicine;
    }

    public void setNameMedicine(String nameMedicine) {
        this.nameMedicine = nameMedicine;
    }

    public String getClassicMedicine() {
        return classicMedicine;
    }

    public void setClassicMedicine(String classicMedicine) {
        this.classicMedicine = classicMedicine;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "TMedicine{" +
                "idMedicine=" + idMedicine +
                ", nameMedicine=" + nameMedicine +
                ", classicMedicine='" + classicMedicine + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
