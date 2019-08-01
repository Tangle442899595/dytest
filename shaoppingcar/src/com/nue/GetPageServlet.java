package com.nue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.entity.TbGoods;
import com.sun.javafx.collections.MappingChange.Map;


/**
 * Servlet implementation class GetPageServlet
 */
@WebServlet("/GetPageServlet")
public class GetPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
