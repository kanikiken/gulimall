package com.cgm.gulimall.member.dao;

import com.cgm.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-05-16 13:31:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
