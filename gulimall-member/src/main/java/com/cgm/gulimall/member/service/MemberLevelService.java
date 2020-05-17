package com.cgm.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cgm.common.utils.PageUtils;
import com.cgm.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-05-16 13:31:31
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

