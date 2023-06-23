package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.entity.AnnoucementEntity;
import com.entity.JuminEntity;
import com.entity.view.JuminView;
import com.entity.vo.JuminVO;
import com.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 居民
 */
public interface AnnouncementService extends IService<AnnoucementEntity> {


   	PageUtils queryPage(Map<String, Object> params,Wrapper<AnnoucementEntity> wrapper);

	void deleteBatchIdList(List<Long> ids);

	AnnoucementEntity queryById(Long id);

	void insertItem(AnnoucementEntity param);

	void updateItem(AnnoucementEntity param);

	List<AnnoucementEntity> queryList();

}

