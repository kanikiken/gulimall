package com.cgm.gulimall.product.dao;

import com.cgm.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-05-16 12:07:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
