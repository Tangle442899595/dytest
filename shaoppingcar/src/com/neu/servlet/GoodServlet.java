package com.neu.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.entity.TbGoods;
import com.nue.CartItem;
import com.nue.TbGoodsDao;
import com.nue.TbGoodsDaoImpl;

/**
 * Servlet implementation class GoodServlet
 */
@WebServlet("/GoodServlet")
public class GoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method = request.getParameter("method");
		
		if("getPaged".equals(method)) {
			doGetPaged(request,response);
		}else if("add".equals(method)) {
			doAdd(request,response);
		}
	}

	private void doAdd(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		TbGoodsDao tbGoods = new TbGoodsDaoImpl();
		try {
			TbGoods goods = tbGoods.GetById(id);
			
			HttpSession session = request.getSession();
			Map<String, CartItem> map = (Map<String, CartItem> )session.getAttribute("map");
			
			if(map == null) {
				map = new HashMap<>();
				session.setAttribute("map", map);
			}
			//根据商品，得到该商品的购物项
			CartItem cartItem = map.get(goods.getId());
			
			if(cartItem==null) {//原来已经购买过该商品
				cartItem = new CartItem(goods, 1, goods.getPrice()*1);
			}else {
				cartItem.setNum(cartItem.getNum()+1);
				cartItem.setTotal(cartItem.getNum()*goods.getPrice());
			}
			//把购物项添加到map集合中
			map.put(goods.getId(), cartItem);
//			map.put(goods.getId(), new CartItem(goods, num, total))
			double sum = 0;
			
			for(CartItem item :map.values()) {
				sum += item.getTotal();
			}
			
//			request.setAttribute("map", map);
			request.setAttribute("sum", sum);
			request.getRequestDispatcher("/gouwu.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void doGetPaged(HttpServletRequest request, HttpServletResponse response) {
		List<TbGoods> list1 = new ArrayList<>();
		
		HttpSession session = request.getSession();
		session.setAttribute("list1",list1);
		TbGoodsDao tbGoods = new TbGoodsDaoImpl();
		try {
			int pageSize = 2;
			int pageNum = 1;
			
			
			
			String num = request.getParameter("pageNum");
			if(num!=null) {
				pageNum = Integer.parseInt(num);
				
			}
			List<TbGoods> list = tbGoods.GetPage(pageSize, pageNum);
			request.setAttribute("list", list);
			
			int count = tbGoods.count();
			
			int page = count % pageSize == 0?count / pageSize:count / pageSize +1;
			request.setAttribute("page", page);
			request.setAttribute("pageNum", pageNum);
			request.getRequestDispatcher("/showAll.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
