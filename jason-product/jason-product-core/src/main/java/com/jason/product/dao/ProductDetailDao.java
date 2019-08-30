package com.jason.product.dao;

import com.jason.product.po.ProductDetailPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/8/30 11:54
 * @Modify 2019/8/30 11:54
 * @Version 1.0
 */
@Repository
public interface ProductDetailDao {

    ProductDetailPO getGetById(@Param(value = "id")Integer id);

    List<ProductDetailPO> getByProductId(@Param(value = "productId")Integer productId);

    Integer update(ProductDetailPO productDetailPO);
}
