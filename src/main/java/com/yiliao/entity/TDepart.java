package com.yiliao.entity;

public class TDepart {
    private int idDepart;
    private String nameDepart;

    private int idAdmin;
    private String nameAdmin;




    public TDepart() {

    }

    public TDepart(String nameDepart, String nameAdmin) {
        this.nameDepart = nameDepart;
        this.nameAdmin = nameAdmin;
    }

    public int getIdDepart() {
        return idDepart;
    }

    public void setIdDepart(int idDepart) {
        this.idDepart = idDepart;
    }

    public String getNameDepart() {
        return nameDepart;
    }

    public void setNameDepart(String nameDepart) {
        this.nameDepart = nameDepart;
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

    @Override
    public String toString() {
      return "TDepart{" +
              "idDepart=" + idDepart +
              ", nameDepart='" + nameDepart +'\''+
              ", idAdmin=" + idAdmin  +
              ", nameAdmin='"+nameAdmin + '\'' +

              '}';
    }
}
