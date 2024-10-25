package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QingjiaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QingjiaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QingjiaxinxiView;


/**
 * 请假信息
 *
 * @author 
 * @email 
 * @date 2022-03-28 16:41:16
 */
public interface QingjiaxinxiService extends IService<QingjiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QingjiaxinxiVO> selectListVO(Wrapper<QingjiaxinxiEntity> wrapper);
   	
   	QingjiaxinxiVO selectVO(@Param("ew") Wrapper<QingjiaxinxiEntity> wrapper);
   	
   	List<QingjiaxinxiView> selectListView(Wrapper<QingjiaxinxiEntity> wrapper);
   	
   	QingjiaxinxiView selectView(@Param("ew") Wrapper<QingjiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QingjiaxinxiEntity> wrapper);
   	

}

