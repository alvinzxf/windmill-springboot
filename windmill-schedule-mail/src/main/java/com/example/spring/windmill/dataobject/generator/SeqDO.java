package com.example.spring.windmill.dataobject.generator;

import java.io.Serializable;

public class SeqDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seq.id
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seq.code
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    private Integer code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table seq
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seq.id
     *
     * @return the value of seq.id
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seq.id
     *
     * @param id the value for seq.id
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seq.code
     *
     * @return the value of seq.code
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public Integer getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seq.code
     *
     * @param code the value for seq.code
     *
     * @mbg.generated Wed Mar 27 23:24:07 CST 2019
     */
    public void setCode(Integer code) {
        this.code = code;
    }
}