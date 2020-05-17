package com.cgm.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cgm.common.utils.PageUtils;
import com.cgm.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-05-16 12:07:05
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

