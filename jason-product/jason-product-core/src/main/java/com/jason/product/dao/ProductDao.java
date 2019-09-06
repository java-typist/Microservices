package com.jason.product.dao;

import com.jason.product.dto.ProductDTO;
import com.jason.product.dto.ProductDetailDTO;
import com.jason.product.dto.ProductUpdateDTO;
import com.jason.product.model.ProductBase;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 13:29
 * @Modify 2019/9/5 13:29
 * @Version 1.0
 */
@Repository
public interface ProductDao {

    Integer addProduct(ProductBase productBase);

    Integer updateProduct(ProductBase productBase);

    Integer delete(@Param(value = "id")Integer id);

    ProductDetailDTO getSimple(@Param(value = "id") Integer id);

    ProductDTO getProduct(@Param(value = "id") Integer id);

}
