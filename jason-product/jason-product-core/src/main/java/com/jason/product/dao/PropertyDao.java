package com.jason.product.dao;

import com.jason.product.dto.PropertyDTO;
import com.jason.product.dto.PropertyUpdateDTO;
import com.jason.product.model.Property;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 13:33
 * @Modify 2019/9/5 13:33
 * @Version 1.0
 */
public interface PropertyDao {

    Integer addProperty(Property property);

    Integer updateProperty(Property property);

    Integer deleteById(@Param(value = "id") Integer id, @Param(value = "productId")Integer productId);

    Integer deleteByProduct(@Param(value = "productId") Integer productId);

    PropertyDTO getProperty(@Param(value = "id") Integer id);

    List<PropertyDTO> getByProduct(@Param(value = "productId") Integer productId);
}
