package com.cgm.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cgm.common.utils.PageUtils;
import com.cgm.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-05-16 12:07:05
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

