package com.dao;

import com.entity.KaoqintongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoqintongjiVO;
import com.entity.view.KaoqintongjiView;


/**
 * 考勤统计
 * 
 * @author 
 * @email 
 * @date 2022-03-28 16:41:16
 */
public interface KaoqintongjiDao extends BaseMapper<KaoqintongjiEntity> {
	
	List<KaoqintongjiVO> selectListVO(@Param("ew") Wrapper<KaoqintongjiEntity> wrapper);
	
	KaoqintongjiVO selectVO(@Param("ew") Wrapper<KaoqintongjiEntity> wrapper);
	
	List<KaoqintongjiView> selectListView(@Param("ew") Wrapper<KaoqintongjiEntity> wrapper);

	List<KaoqintongjiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoqintongjiEntity> wrapper);
	
	KaoqintongjiView selectView(@Param("ew") Wrapper<KaoqintongjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoqintongjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoqintongjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoqintongjiEntity> wrapper);
}
