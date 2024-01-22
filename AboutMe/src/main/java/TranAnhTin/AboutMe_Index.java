package TranAnhTin;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AboutMe_Index
 */
public class AboutMe_Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AboutMe_Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=UTF-8");

	        try (PrintWriter out = response.getWriter()) {
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<title>About Me</title>");
	            out.println("</head>");
	            out.println("<body>");
	            out.println("<h2>Thông Tin Cá Nhân của Tôi</h2>");
	            out.println("<p>Họ và Tên: Trần Anh Tín</p>");
	            out.println("<p>Giới tính: Nam</p>");
	            out.println("<p>Tuổi: 22</p>");
	            out.println("</body>");
	            out.println("</html>");
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
