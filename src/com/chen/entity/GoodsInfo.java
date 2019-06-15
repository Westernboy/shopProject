package com.chen.entity;

public class GoodsInfo {
   private int id;
   private String good_num;        
   private String goodsInfo_name;  
   private String goodsInfo_pic;  
   private double goodsInfo_price;
   private String goodsInfo_desc; 
   private String goods_stock;     
   private String flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGood_num() {
        return good_num;
    }

    public void setGood_num(String good_num) {
        this.good_num = good_num;
    }

    public String getGoodsInfo_name() {
        return goodsInfo_name;
    }

    public void setGoodsInfo_name(String goodsInfo_name) {
        this.goodsInfo_name = goodsInfo_name;
    }

    public String getGoodsInfo_pic() {
        return goodsInfo_pic;
    }

    public void setGoodsInfo_pic(String goodsInfo_pic) {
        this.goodsInfo_pic = goodsInfo_pic;
    }

    public double getGoodsInfo_price() {
        return goodsInfo_price;
    }

    public void setGoodsInfo_price(double goodsInfo_price) {
        this.goodsInfo_price = goodsInfo_price;
    }

    public String getGoodsInfo_desc() {
        return goodsInfo_desc;
    }

    public void setGoodsInfo_desc(String goodsInfo_desc) {
        this.goodsInfo_desc = goodsInfo_desc;
    }

    public String getGoods_stock() {
        return goods_stock;
    }

    public void setGoods_stock(String goods_stock) {
        this.goods_stock = goods_stock;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public GoodsInfo() {
    }

    public GoodsInfo(int id, String good_num, String goodsInfo_name, String goodsInfo_pic, double goodsInfo_price, String goodsInfo_desc, String goods_stock, String flag) {
        this.id = id;
        this.good_num = good_num;
        this.goodsInfo_name = goodsInfo_name;
        this.goodsInfo_pic = goodsInfo_pic;
        this.goodsInfo_price = goodsInfo_price;
        this.goodsInfo_desc = goodsInfo_desc;
        this.goods_stock = goods_stock;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "id=" + id +
                ", good_num='" + good_num + '\'' +
                ", goodsInfo_name='" + goodsInfo_name + '\'' +
                ", goodsInfo_pic='" + goodsInfo_pic + '\'' +
                ", goodsInfo_price=" + goodsInfo_price +
                ", goodsInfo_desc='" + goodsInfo_desc + '\'' +
                ", goods_stock='" + goods_stock + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}
