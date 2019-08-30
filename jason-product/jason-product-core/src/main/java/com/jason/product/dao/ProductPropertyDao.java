package com.jason.product.dao;

import com.jason.product.po.ProductProperPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/8/30 11:56
 * @Modify 2019/8/30 11:56
 * @Version 1.0
 */
@Repository
public interface ProductPropertyDao {

    ProductProperPO getById(@Param(value = "id") Integer id);

    List<ProductProperPO> getByProductId(@Param(value = "productId") Integer productId);

    Integer update(ProductProperPO productProperPO);
}
