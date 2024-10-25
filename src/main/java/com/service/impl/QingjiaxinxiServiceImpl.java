package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QingjiaxinxiDao;
import com.entity.QingjiaxinxiEntity;
import com.service.QingjiaxinxiService;
import com.entity.vo.QingjiaxinxiVO;
import com.entity.view.QingjiaxinxiView;

@Service("qingjiaxinxiService")
public class QingjiaxinxiServiceImpl extends ServiceImpl<QingjiaxinxiDao, QingjiaxinxiEntity> implements QingjiaxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QingjiaxinxiEntity> page = this.selectPage(
                new Query<QingjiaxinxiEntity>(params).getPage(),
                new EntityWrapper<QingjiaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QingjiaxinxiEntity> wrapper) {
		  Page<QingjiaxinxiView> page =new Query<QingjiaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QingjiaxinxiVO> selectListVO(Wrapper<QingjiaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QingjiaxinxiVO selectVO(Wrapper<QingjiaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QingjiaxinxiView> selectListView(Wrapper<QingjiaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QingjiaxinxiView selectView(Wrapper<QingjiaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
