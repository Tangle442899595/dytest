package com.nue;

import java.util.List;

import com.neu.entity.TbGoods;

public interface TbGoodsDao {
	List<TbGoods> GetPage(int pageSize, int pageNum) throws Exception;
	int count() throws Exception;
	TbGoods GetById(String id) throws Exception;
	
}
