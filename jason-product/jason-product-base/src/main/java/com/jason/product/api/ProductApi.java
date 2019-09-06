package com.jason.product.api;

import com.jason.common.model.Response;
import com.jason.product.vo.ProductAddVO;
import com.jason.product.vo.ProductUpdateVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Jason
 * @CreateTime 2019/9/6 9:59
 * @Modify 2019/9/6 9:59
 * @Version 1.0
 */
@FeignClient(value = "product-service")
public interface ProductApi {

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    Response simple(@RequestParam(value = "id")Integer id);

    @RequestMapping(value = "/product", method = RequestMethod.PUT)
    Response updateProduct(@RequestBody ProductUpdateVO productUpdateVO);

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    Response addProduct(@RequestBody ProductAddVO addVO);

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    Response detail(@PathVariable(value = "id")Integer id);
}
