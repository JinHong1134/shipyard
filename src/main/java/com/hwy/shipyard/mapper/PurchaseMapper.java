package com.hwy.shipyard.mapper;

import com.github.pagehelper.Page;
import com.hwy.shipyard.dataobject.Purchase;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;



/**
 * 订单的dao
 */

public interface PurchaseMapper {

    @Select("select * from purchase where purchase_id = #{purchaseId}")
    @Results(value = {
            @Result(column = "purchase_id", property = "purchaseId"),
            @Result(column = "factory_name", property = "factoryName"),
            @Result(column = "purchase_creation_time", property = "purchaseCreationTime"),
            @Result(column = "purchase_delivery_time", property = "purchaseDeliveryTime"),
            @Result(column = "purchase_total_price", property = "purchaseTotalPrice"),
            @Result(column = "operator_name", property = "operatorName"),
            @Result(column = "check_bits", property = "checkBits"),
            @Result(column = "purchase_pre", property = "purchasePre"),
            @Result(column = "purchase_field0", property = "purchaseField0"),
            @Result(column = "purchase_field1", property = "purchaseField1"),
            @Result(column = "purchase_field2", property = "purchaseField2"),
            @Result(column = "purchase_field3", property = "purchaseField3")
    })
    Purchase findById(String purchaseId);


    Page<Purchase> findByFactoryName(String factoryName);



}
