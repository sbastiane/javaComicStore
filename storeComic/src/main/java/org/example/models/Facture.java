package org.example.models;

import java.time.LocalDate;
public class Facture {

    //ID
    private Integer id;
    //DATE (DD-MM-YYYY) local date
    private LocalDate date;
    //Productlist: "Revisar Arraylist"
    private String productList;
    //Grosscost
    private double grosscost;
    //Netcost (Aplicar IVA y descontar descuentos)
    private double netcost;

    public Facture() {
    }

    public Facture(java.lang.Integer id, LocalDate date, java.lang.String productList, double grosscost, double netcost) {
        this.id = id;
        this.date = date;
        this.productList = productList;
        this.grosscost = grosscost;
        this.netcost = netcost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id>0){
            this.id=id;
        }else {
            System.out.println("Revise ya que no se aceptan id negativos");
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public double getGrosscost() {
        return grosscost;
    }

    public void setGrosscost(double grosscost) {
        this.grosscost = grosscost;
    }

    public double getNetcost() {
        return netcost;
    }

    public void setNetcost(double netcost) {
        this.netcost = netcost;
    }
}
