package com.cgm.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cgm.common.utils.PageUtils;
import com.cgm.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-05-16 13:31:30
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

