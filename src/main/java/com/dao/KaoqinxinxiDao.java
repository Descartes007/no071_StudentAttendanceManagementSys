package com.dao;

import com.entity.KaoqinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoqinxinxiVO;
import com.entity.view.KaoqinxinxiView;


/**
 * 考勤信息
 * 
 * @author 
 * @email 
 * @date 2022-03-28 16:41:16
 */
public interface KaoqinxinxiDao extends BaseMapper<KaoqinxinxiEntity> {
	
	List<KaoqinxinxiVO> selectListVO(@Param("ew") Wrapper<KaoqinxinxiEntity> wrapper);
	
	KaoqinxinxiVO selectVO(@Param("ew") Wrapper<KaoqinxinxiEntity> wrapper);
	
	List<KaoqinxinxiView> selectListView(@Param("ew") Wrapper<KaoqinxinxiEntity> wrapper);

	List<KaoqinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoqinxinxiEntity> wrapper);
	
	KaoqinxinxiView selectView(@Param("ew") Wrapper<KaoqinxinxiEntity> wrapper);
	

}
