package com.jason.product.service;

import com.jason.product.dto.*;

import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 10:08
 * @Modify 2019/9/5 10:08
 * @Version 1.0
 */
public interface ProductService {

    Integer addProduct(ProductAddDTO productAdd);

    Integer updateProduct(ProductUpdateDTO productUpdate);

    Integer updateProperty(PropertyUpdateDTO propertyUpdate);

    Integer deleteProperty(Integer productId, Integer propertyId);

    Boolean deleteProduct(Integer productId);

    List<PropertyDTO> getProperties(Integer productId);

    ProductDTO getProduct(Integer id);

    ProductDetailDTO getSimpleProduct(Integer id);

}
