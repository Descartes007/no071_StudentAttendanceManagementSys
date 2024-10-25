package com.dao;

import com.entity.QingjiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QingjiaxinxiVO;
import com.entity.view.QingjiaxinxiView;


/**
 * 请假信息
 * 
 * @author 
 * @email 
 * @date 2022-03-28 16:41:16
 */
public interface QingjiaxinxiDao extends BaseMapper<QingjiaxinxiEntity> {
	
	List<QingjiaxinxiVO> selectListVO(@Param("ew") Wrapper<QingjiaxinxiEntity> wrapper);
	
	QingjiaxinxiVO selectVO(@Param("ew") Wrapper<QingjiaxinxiEntity> wrapper);
	
	List<QingjiaxinxiView> selectListView(@Param("ew") Wrapper<QingjiaxinxiEntity> wrapper);

	List<QingjiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QingjiaxinxiEntity> wrapper);
	
	QingjiaxinxiView selectView(@Param("ew") Wrapper<QingjiaxinxiEntity> wrapper);
	

}
