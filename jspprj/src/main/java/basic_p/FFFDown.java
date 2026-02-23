package basic_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Servlet implementation class FFFDown
 */
@WebServlet("/FFFDown")
public class FFFDown extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FFFDown() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fName = request.getParameter("fName");
		String en = URLEncoder.encode(fName, "UTF-8");
		
		response.setHeader("Content-Disposition", "attachment;filename="+en);
		String dir = request.getServletContext().getRealPath("fff/"+fName);
		FileInputStream fis = new FileInputStream(dir);
		ServletOutputStream sos = response.getOutputStream();
		byte [] buf = new byte[1024];
		
		while(fis.available() > 0) {
			int len = fis.read(buf);
			sos.write(buf, 0, len);
		}
		
		sos.close();
		fis.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
