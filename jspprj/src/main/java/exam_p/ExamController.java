package exam_p;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import db_p.ExamDAO;
import di_p.ExamList;

/**
 * Servlet implementation class ExamController
 */
@WebServlet("/exam/*")
@MultipartConfig
public class ExamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExamController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// System.out.println(request.getRequestURI());	// /jspprj/exam/list
		// System.out.println(request.getContextPath()+"/exam/");	// /jspprj
		String service = request.getRequestURI().substring((request.getContextPath()+"/exam/").length());
		// System.out.println(service);	// list
		
		String mainUrl = "/views/"+service+".jsp";
		
		Action action;
		try {
			action = (Action)Class.forName("di_p."+service).newInstance();
			/*
			 	"di_p."+service 클래스를 동적으로 로딩해서
				기본 생성자를 호출하여 객체를 생성한다
			*/
			action.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(mainUrl);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
