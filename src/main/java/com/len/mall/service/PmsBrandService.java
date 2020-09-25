package com.len.mall.service;

import com.len.mall.mybatis_generator.model.PmsBrand;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liyong
 * @version 1.0
 * @className PmsBrandService
 * @description PmsBrandService
 * @date 2020/9/25 10:43
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
