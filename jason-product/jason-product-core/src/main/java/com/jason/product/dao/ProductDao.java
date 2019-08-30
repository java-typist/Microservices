package com.jason.product.dao;

import com.jason.product.dto.ProductDetailDTO;
import com.jason.product.dto.ProductPropertyDTO;
import com.jason.product.dto.ProductSimpleDTO;
import com.jason.product.po.ProductPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author Jason
 * @CreateTime 2019/8/30 11:39
 * @Modify 2019/8/30 11:39
 * @Version 1.0
 */

public interface ProductDao {

    ProductPO getById(@Param(value = "id") Integer id);

    Integer update(@Param(value = "id") Integer id, @Param(value = "enabled") Boolean enabled);

    ProductDetailDTO getDetail(@Param(value = "id") Integer id);

    ProductPropertyDTO getProperty(@Param(value = "id") Integer id);

    ProductSimpleDTO getSimple(@Param(value = "id") Integer id);

}
