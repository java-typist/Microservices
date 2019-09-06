package com.jason.product.utils;

import com.jason.product.dto.*;
import com.jason.product.model.ProductBase;
import com.jason.product.model.Property;
import com.jason.product.vo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 11:26
 * @Modify 2019/9/5 11:26
 * @Version 1.0
 */
public class ConvertUtil {

    /**
     * 可更新属性转化
     *
     * @param updateDTO
     */
    public static Property convert(PropertyUpdateDTO updateDTO) {
        Property property = new Property();
        BeanUtils.copyProperties(updateDTO, property);
        return property;
    }

    /**
     * 感觉没用
     *
     * @param property
     */
    public static PropertyUpdateDTO convert(Property property) {
        PropertyUpdateDTO updateDTO = new PropertyUpdateDTO();
        BeanUtils.copyProperties(property, updateDTO);
        return updateDTO;
    }

    /**
     * 可更新商品转换
     *
     * @param updateDTO
     */
    public static ProductBase convert(ProductUpdateDTO updateDTO) {
        ProductBase product = new ProductBase();
        BeanUtils.copyProperties(updateDTO, product);
        return product;
    }

    /**
     * 感觉也没用
     *
     * @param productBase
     */
    public static ProductUpdateDTO convert(ProductBase productBase) {
        ProductUpdateDTO updateDTO = new ProductUpdateDTO();
        BeanUtils.copyProperties(productBase, updateDTO);
        return updateDTO;
    }

    /**
     * 商品添加转换
     *
     * @param addVO
     */
    public static ProductAddDTO convert(ProductAddVO addVO) {
        ProductAddDTO addDTO = new ProductAddDTO();
        BeanUtils.copyProperties(addVO, addDTO);
        List<PropertyAddDTO> propertyAddDTOS = new ArrayList<>();
        for (PropertyAddVO propertyAddVO : addVO.getProperties()) {
            PropertyAddDTO propertyAddDTO = convert(propertyAddVO);
            propertyAddDTOS.add(propertyAddDTO);
        }
        addDTO.setProperties(propertyAddDTOS);
        return addDTO;
    }

    public static PropertyAddDTO convert(PropertyAddVO propertyAddVO) {
        PropertyAddDTO propertyAddDTO = new PropertyAddDTO();
        BeanUtils.copyProperties(propertyAddVO, propertyAddDTO);
        return propertyAddDTO;
    }

    /**
     * 可更新商品转化
     *
     * @param updateVO
     */
    public static ProductUpdateDTO convert(ProductUpdateVO updateVO) {
        ProductUpdateDTO updateDTO = new ProductUpdateDTO();
        BeanUtils.copyProperties(updateVO, updateDTO);
        return updateDTO;
    }

    /**
     * 新建商品转换
     *
     * @param addDTO
     */
    public static ProductBase convert(ProductAddDTO addDTO) {
        ProductBase productBase = new ProductBase();
        BeanUtils.copyProperties(addDTO, productBase);
        productBase.setAvailable(true);
        productBase.setCreateTime(new Date());
        productBase.setUpdateTime(new Date());
        return productBase;
    }

    /**
     * 转换成可见商品描述
     *
     * @param detailDTO
     */
    public static ProductDetailVO convert(ProductDetailDTO detailDTO) {
        ProductDetailVO detailVO = new ProductDetailVO();
        BeanUtils.copyProperties(detailDTO, detailVO);
        return detailVO;
    }

    public static Property convert(PropertyAddDTO propertyAddDTO) {
        Property property = new Property();
        BeanUtils.copyProperties(propertyAddDTO, property);
        property.setAvailable(true);
        return property;
    }

    /**
     * 转换成详细商品属性
     *
     * @param productDTO
     * @return
     */
    public static ProductShowVO convert(ProductDTO productDTO) {
        ProductShowVO showVO = new ProductShowVO();
        BeanUtils.copyProperties(productDTO, showVO);
        return showVO;
    }

    public static PropertyUpdateDTO convert(PropertyVO propertyVO) {
        PropertyUpdateDTO updateDTO = new PropertyUpdateDTO();
        BeanUtils.copyProperties(propertyVO, updateDTO);
        return updateDTO;
    }

}
