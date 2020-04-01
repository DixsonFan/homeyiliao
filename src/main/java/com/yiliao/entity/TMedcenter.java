package com.yiliao.entity;

public class TMedcenter {
    private int idMedcenter;
    private String nameMedcenter;
    private String addressMedcenter;
    private int idAdmin;
    private String nameAdmin;
    private String telMedcenter;

    public TMedcenter() {
    }

    public TMedcenter(String nameMedcenter, String addressMedcenter) {
        this.nameMedcenter = nameMedcenter;
        this.addressMedcenter = addressMedcenter;
    }


    public int getIdMedcenter() {
        return idMedcenter;
    }

    public void setIdMedcenter(int idMedcenter) {
        this.idMedcenter = idMedcenter;
    }

    public String getNameMedcenter() {
        return nameMedcenter;
    }

    public void setNameMedcenter(String nameMedcenter) {
        this.nameMedcenter = nameMedcenter;
    }

    public String getAddressMedcenter() {
        return addressMedcenter;
    }

    public void setAddressMedcenter(String addressMedcenter) {
        this.addressMedcenter = addressMedcenter;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNameAdmin() {
        return nameAdmin;
    }

    public void setNameAdmin(String nameAdmin) {
        this.nameAdmin = nameAdmin;
    }

    public String getTelMedcenter() {
        return telMedcenter;
    }

    public void setTelMedcenter(String telMedcenter) {
        this.telMedcenter = telMedcenter;
    }

    @Override
    public String toString() {
        return "TMedcenter{" +
                "idMedcenter=" + idMedcenter +
                ", nameMedcenter=" + nameMedcenter +
                ", addressMedcenter='" + addressMedcenter + '\'' +
                ", idAdmin='" + idAdmin + '\'' +
                ", nameAdmin='" + nameAdmin + '\'' +
                ", telMedcenter='" + telMedcenter + '\'' +
                '}';
    }
}
