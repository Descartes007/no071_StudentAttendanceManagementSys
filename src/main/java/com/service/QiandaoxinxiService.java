package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiandaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiandaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiandaoxinxiView;


/**
 * 签到信息
 *
 * @author 
 * @email 
 * @date 2022-03-28 16:41:16
 */
public interface QiandaoxinxiService extends IService<QiandaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiandaoxinxiVO> selectListVO(Wrapper<QiandaoxinxiEntity> wrapper);
   	
   	QiandaoxinxiVO selectVO(@Param("ew") Wrapper<QiandaoxinxiEntity> wrapper);
   	
   	List<QiandaoxinxiView> selectListView(Wrapper<QiandaoxinxiEntity> wrapper);
   	
   	QiandaoxinxiView selectView(@Param("ew") Wrapper<QiandaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiandaoxinxiEntity> wrapper);
   	

}

