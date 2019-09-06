package com.jason.product.service;

import com.jason.product.dao.ProductDao;
import com.jason.product.dao.PropertyDao;
import com.jason.product.dto.*;
import com.jason.product.model.ProductBase;
import com.jason.product.model.Property;
import com.jason.product.utils.ConvertUtil;
import com.jason.product.vo.PropertyAddVO;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 14:56
 * @Modify 2019/9/5 14:56
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductDao productDao;

    @Resource
    private PropertyDao propertyDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer addProduct(ProductAddDTO productAdd) {
        ProductBase product = ConvertUtil.convert(productAdd);
        productDao.addProduct(product);
        for (PropertyAddDTO propertyAddDTO : productAdd.getProperties()) {
            Property property = ConvertUtil.convert(propertyAddDTO);
            property.setProductId(product.getId());
            propertyDao.addProperty(property);
        }
        return product.getId();
    }

    @Override
    public Integer updateProduct(ProductUpdateDTO productUpdate) {
        ProductBase product = ConvertUtil.convert(productUpdate);
        return productDao.updateProduct(product);
    }

    @Override
    public Integer updateProperty(PropertyUpdateDTO propertyUpdate) {
        Property property = ConvertUtil.convert(propertyUpdate);
        return propertyDao.updateProperty(property);
    }

    @Override
    public Integer deleteProperty(Integer productId, Integer propertyId) {
        return propertyDao.deleteById(propertyId, productId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean deleteProduct(Integer productId) {
        Integer p = productDao.delete(productId);
        Integer q = propertyDao.deleteByProduct(productId);
        System.out.println(q);
        System.out.println(p);
        if (p > 0 && q > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<PropertyDTO> getProperties(Integer productId) {
        return propertyDao.getByProduct(productId);
    }

    @Override
    public ProductDTO getProduct(Integer id) {
        return productDao.getProduct(id);
    }

    @Override
    public ProductDetailDTO getSimpleProduct(Integer id) {
        return productDao.getSimple(id);
    }
}
