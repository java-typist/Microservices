package com.jason.product.controller;

import com.jason.common.model.Response;
import com.jason.product.dto.*;
import com.jason.product.service.ProductService;
import com.jason.product.utils.ConvertUtil;
import com.jason.product.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author Jason
 * @CreateTime 2019/9/5 11:46
 * @Modify 2019/9/5 11:46
 * @Version 1.0
 */
@RestController
@Api
public class ProductController {

    @Resource
    private ProductService productService;

    @GetMapping(value = "/product")
    @ApiOperation(value = "获取商品介绍")
    public Response product(@ApiParam(value = "商品id") @RequestParam(value = "id") Integer id) {
        Response response = new Response();
        ProductDetailDTO detailDTO = productService.getSimpleProduct(id);
        if (detailDTO == null) {
            response.error(-1, "错误数据");
        } else {
            ProductDetailVO product = ConvertUtil.convert(productService.getSimpleProduct(id));
            response.success(1, "操作成功", product);
        }
        return response;
    }

    @PutMapping(value = "/product")
    @ApiOperation(value = "更新商品数据")
    public Response product(@ApiParam(value = "可以更新的商品属性") @RequestBody ProductUpdateVO productUpdateVO) {
        Response response = new Response();
        ProductUpdateDTO updateDTO = ConvertUtil.convert(productUpdateVO);

        Integer result = productService.updateProduct(updateDTO);
        if (result > 0) {
            response.success(1, "操作成功", null);
        } else {
            response.error(-1, "操作失败");
        }
        return response;
    }

    @PostMapping(value = "product")
    @ApiOperation(value = "添加商品")
    public Response product(@ApiParam(value = "添加商品所需数据及格式") @RequestBody ProductAddVO addVO) {
        Response response = new Response();
        ProductAddDTO addDTO = ConvertUtil.convert(addVO);
        try {
            Integer result = productService.addProduct(addDTO);
            if (result > 0) {
                response.success(1, "操作成功", result);
            } else {
                response.error(-1, "操作失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.error(-2, "发生了某种异常");
        }
        return response;
    }

    @GetMapping(value = "/product/{id}")
    @ApiOperation(value = "查看商品详细属性")
    public Response details(@ApiParam(value = "商品id") @PathVariable(value = "id") Integer id) {
        Response response = new Response();
        ProductDTO productDTO = productService.getProduct(id);
        if (productDTO == null) {
            response.error(-1, "错误数据");
        } else {
            ProductShowVO showVO = ConvertUtil.convert(productService.getProduct(id));
            response.success(1, "操作成功", showVO);
        }
        return response;
    }

    @DeleteMapping(value = "/product/{id}/property")
    @ApiOperation(value = "删除指定商品的指定属性")
    public Response property(@ApiParam(value = "产品id") @PathVariable(value = "id") Integer productId,
                             @ApiParam(value = "属性id") @RequestParam(value = "property") Integer propertyId) {
        Response response = new Response();
        Integer result = productService.deleteProperty(productId, propertyId);
        System.out.println(result);
        if (result > 0) {
            response.success(1, "操作成功", null);
        } else {
            response.error(-1, "操作失败");
        }
        return response;
    }

    @DeleteMapping(value = "/product/{id}")
    @ApiOperation(value = "删除指定商品的所有信息")
    public Response deleteProduct(@ApiParam(value = "指定商品id") @PathVariable(value = "id") Integer id) {
        Response response = new Response();
        Boolean result = productService.deleteProduct(id);
        if (result) {
            response.success(1, "操作成功", null);
        } else {
            response.error(-1, "操作失败");
        }
        return response;
    }

    @PutMapping(value = "property")
    @ApiOperation(value = "修改指定属性")
    public Response property(@ApiParam(value = "属性对象") @RequestBody PropertyVO propertyVO) {
        Response response = new Response();
        PropertyUpdateDTO propertyUpdateDTO = ConvertUtil.convert(propertyVO);
        Integer result = productService.updateProperty(propertyUpdateDTO);
        if (result > 0) {
            response.success(1, "操作成功", null);
        } else {
            response.error(-1, "操作失败");
        }
        return response;
    }
}
