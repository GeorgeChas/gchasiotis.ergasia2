package web;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import web.dao.ProductDao;

public class createServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		boolean check_res = false; 
		ProductDao dao = new ProductDao(); 		
		
		String barcode_string = req.getParameter("barcode");
		
		try {
			check_res = dao.barcode_exist(barcode_string);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(barcode_string=="") {
			res.sendRedirect("EmptyBarcode.jsp");
		}else {
			if (check_res==true){
				res.sendRedirect("Barcode_Exist.jsp");
			}else {
				
				String name_=req.getParameter("name");
				String color_=req.getParameter("color");
				String des_=req.getParameter("description");
				
				try {
					dao.add_product(name_, barcode_string, color_, des_);
					
					HttpSession session = req.getSession();
					if(name_==null || name_=="") {
						name_ = "Δεν δόθηκε όνομα.";
					}
					if(color_==null || color_=="") {
						color_= "Δεν δόθηκε χρώμα.";
					}
					if(des_==null || des_=="") {
						des_ = "Δεν δόθηκε περιγραφή.";
					}
					session.setAttribute("name", name_);
					session.setAttribute("barcode", barcode_string);
					session.setAttribute("color", color_ );
					session.setAttribute("description", des_);
	
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				res.sendRedirect("Product.jsp");
			}
		}
	}
}




