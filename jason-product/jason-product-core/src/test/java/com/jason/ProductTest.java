package com.jason;

import com.jason.product.ProductServiceApp;
import com.jason.product.dao.ProductDao;
import com.jason.product.dto.ProductDetailDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author Jason
 * @CreateTime 2019/8/30 16:10
 * @Modify 2019/8/30 16:10
 * @Version 1.0
 */
@SpringBootTest(classes = ProductServiceApp.class)
@RunWith(value = SpringRunner.class)
public class ProductTest {

    @Resource
    ProductDao productDao;

    @Test
    public void test(){
//        System.out.println(productDao.getById(1));
        ProductDetailDTO detailDTO = productDao.getDetail(1);
        System.out.println(detailDTO);
    }
}
