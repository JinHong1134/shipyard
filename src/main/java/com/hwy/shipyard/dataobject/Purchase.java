package com.hwy.shipyard.dataobject;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 采购单
 */
@Data
public class Purchase {

    /**
     * 采购单编号，主键
     */
    private String purchaseId;

    /**
     *供货商
     */
    private String factoryName;

    /**
     * 订货日期
     */
    private Date purchaseCreationTime;

    /**
     * 到货日期
     */
    private Date purchaseDeliveryTime;

    /**
     * 订单总价
     */
    private BigDecimal purchaseTotalPrice;

    /**
     * 业务员
     */
    private String operatorName;

    /**
     * 校验位
     */
    private String checkBits;

    /**
     * 上一条记录的哈希
     */
    private String purchasePre;

    /**
     * 预留字段
     */
    private String purchaseField0;

    /**
     * 预留字段
     */
    private String purchaseField1;

    /**
     * 预留字段
     */
    private String purchaseField2;

    /**
     * 预留字段
     */
    private String purchaseField3;

}
