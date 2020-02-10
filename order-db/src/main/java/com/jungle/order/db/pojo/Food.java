package com.jungle.order.db.pojo;

import java.math.BigDecimal;

public class Food extends FoodKey {
    private String name;

    private BigDecimal price;

    private Integer dayStock;

    private String foodDescrible;

    private Integer monthlySale;

    private String pictureUrl;

    private Byte pack;

    public Food(Integer shopId, Integer foodId, String name, BigDecimal price, Integer dayStock, String foodDescrible, Integer monthlySale, String pictureUrl, Byte pack) {
        super(shopId, foodId);
        this.name = name;
        this.price = price;
        this.dayStock = dayStock;
        this.foodDescrible = foodDescrible;
        this.monthlySale = monthlySale;
        this.pictureUrl = pictureUrl;
        this.pack = pack;
    }

    public Food() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getDayStock() {
        return dayStock;
    }

    public void setDayStock(Integer dayStock) {
        this.dayStock = dayStock;
    }

    public String getFoodDescrible() {
        return foodDescrible;
    }

    public void setFoodDescrible(String foodDescrible) {
        this.foodDescrible = foodDescrible == null ? null : foodDescrible.trim();
    }

    public Integer getMonthlySale() {
        return monthlySale;
    }

    public void setMonthlySale(Integer monthlySale) {
        this.monthlySale = monthlySale;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public Byte getPack() {
        return pack;
    }

    public void setPack(Byte pack) {
        this.pack = pack;
    }
}