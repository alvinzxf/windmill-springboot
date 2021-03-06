package com.example.spring.windmill.dataobject.generator;

import java.io.Serializable;
import java.math.BigDecimal;

public class GoodsDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.id
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.code
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    private Long code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.name
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.barcode
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    private String barcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.price
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.stock
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    private Long stock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table goods
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.id
     *
     * @return the value of goods.id
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.id
     *
     * @param id the value for goods.id
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.code
     *
     * @return the value of goods.code
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public Long getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.code
     *
     * @param code the value for goods.code
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.name
     *
     * @return the value of goods.name
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.name
     *
     * @param name the value for goods.name
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.barcode
     *
     * @return the value of goods.barcode
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.barcode
     *
     * @param barcode the value for goods.barcode
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.price
     *
     * @return the value of goods.price
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.price
     *
     * @param price the value for goods.price
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.stock
     *
     * @return the value of goods.stock
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public Long getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.stock
     *
     * @param stock the value for goods.stock
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public void setStock(Long stock) {
        this.stock = stock;
    }
}