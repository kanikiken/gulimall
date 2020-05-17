package com.cgm.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cgm.common.utils.PageUtils;
import com.cgm.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-05-16 12:07:06
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

