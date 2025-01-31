package org.gasan.ctrl.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gasan.dao.DataDAO;
import org.gasan.dto.Data;

@WebServlet("/DataList.do")
public class DataListCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DataListCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		DataDAO dao = new DataDAO();
		List<Data> dataList = new ArrayList<>();
		dataList = dao.getDataList();
		request.setAttribute("dataList", dataList);		
		RequestDispatcher view = request.getRequestDispatcher("/data/dataList.jsp");
		view.forward(request, response);
	}
}
