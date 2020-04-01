package com.yiliao.entity;

public class TStation {

    private int idStation;
    private String nameStation;
    private String departStation;

    public TStation() {
    }

    public TStation(String nameStation) {
        this.nameStation = nameStation;
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

    public String getDepartStation() {
        return departStation;
    }

    public void setDepartStation(String departStation) {
        this.departStation = departStation;
    }

    @Override
    public String toString() {
        return "TStation{" +
                "idStation=" + idStation +
                ", nameStation=" + nameStation +
                ", departStation=" + departStation +
                '}';
    }
}