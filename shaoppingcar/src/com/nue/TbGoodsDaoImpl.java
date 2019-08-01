package com.nue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.TbGoods;

public class TbGoodsDaoImpl implements TbGoodsDao {
	DBUtils db = new DBUtils();
	@Override
	public List<TbGoods> GetPage(int pageSize, int pageNum) throws Exception {
		List<TbGoods> list = new ArrayList<>();
		String sql = "select * from tb_goods order by id limit ?,?";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql, (pageNum-1)*pageSize,pageSize);
		TbGoods tbGoods = null;
		while(rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			Double price = rs.getDouble(3);
			String company = rs.getString(4);
			String leaveDate= rs.getString(5);
			String desc= rs.getString(6);
			tbGoods = new TbGoods(id, name, price, company, leaveDate, desc);
			list.add(tbGoods);
			
		}
		
		db.closeConnection(connection);
		return list;
	}



	@Override
	public int count() throws Exception {
		Connection connection = db.getConnection();
		String sql = "select count(*) from tb_goods";
		
		ResultSet rs = db.executeQuery(connection, sql);
		int count = 0;
		if(rs.next()) {
			count = rs.getInt(1);
		}
		
		
		db.closeConnection(connection);
		return count;
		
	}

	@Override
	public TbGoods GetById(String id) throws Exception {
		String sql = "select * from tb_goods where id =?";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql, id);
		TbGoods tbGoods = null;
		if(rs.next()) {
			
			String name = rs.getString(2);
			Double price = rs.getDouble(3);
			String company = rs.getString(4);
			String leaveDate= rs.getString(5);
			String desc= rs.getString(6);
			tbGoods = new TbGoods(id, name, price, company, leaveDate, desc);
			
			
		}
		
		db.closeConnection(connection);
		return tbGoods;
	}

}
