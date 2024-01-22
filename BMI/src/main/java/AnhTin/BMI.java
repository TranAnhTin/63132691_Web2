package AnhTin;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class BMI
 */
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMI() {
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
            out.println("<title>Calculate BMI</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Calculate BMI</h2>");
            out.println("<form method='post' action='BMI'>");
            out.println("Chiều cao (m): <input type='text' name='ChieuCao'><br>");
            out.println("Cân nặng (kg): <input type='text' name='CanNang'><br>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");

        // Lấy dữ liệu từ form POST
        String heightStr = request.getParameter("ChieuCao");
        String weightStr = request.getParameter("CanNang");

        // Chuyển đổi dữ liệu sang kiểu số
        double height = Double.parseDouble(heightStr);
        double weight = Double.parseDouble(weightStr);

        // Tính toán BMI
        double bmi = weight / (height * height);

        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculate BMI Result</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Calculate BMI Result</h2>");
            out.println("<p>Chiều cao: " + height + " m</p>");
            out.println("<p>Cân nặng: " + weight + " kg</p>");
            out.println("<p>BMI: " + bmi + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
	}

}
