package com.yiliao.entity;

public class TEmp {
    private int idEmp;
    private String nameEmp;
    private String sexEmp;
    private int idStation;
    private String nameStation;

    public TEmp() {
    }

    public TEmp(String nameEmp, String sexEmp) {
        this.nameEmp = nameEmp;
        this.sexEmp = sexEmp;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public String getNameEmp() {
        return nameEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public String getSexEmp() {
        return sexEmp;
    }

    public void setSexEmp(String sexEmp) {
        this.sexEmp = sexEmp;
    }

    public int getIdStation() {
        return idStation;
    }

    public void setIdStation(int idStation) {
        this.idStation = idStation;
    }

    public String getNameStation() {
        return nameStation;
    }

    public void setNameStation(String nameStation) {
        this.nameStation = nameStation;
    }

    @Override
    public String toString() {
        return "TEmp{" +
                "idEmp=" + idEmp +
                ", nameEmp=" + nameEmp +
                ", sexEmp='" + sexEmp + '\'' +
                ", idStation='" + idStation + '\'' +
                ", nameStation='" + nameStation + '\'' +
                '}';
    }
}
