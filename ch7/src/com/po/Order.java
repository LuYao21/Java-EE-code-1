package com.po;



public class Order {

    private Integer id;
    private String ordersn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersn() {
        return ordersn;
    }

    public void setOrdersn(String ordersn) {
        this.ordersn = ordersn;
    }

    public String toString(){
        return "Order [id="+id+",ordersn="+ordersn+"]";
    }


}
