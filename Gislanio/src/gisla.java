

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class gisla
 */
public class gisla extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter(); 
		
		java.util.Date hoje = new java.util.Date(); 
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> na marra</h1>" + "<br>" + hoje);
		out.println("<br>");		
		
		String nome = request.getParameter( "nome" );
		
		if ( nome != null ) out.println("Olá " + nome );
		else
			out.println(" Desconhecido");
			out.println("<br>");
			out.println("Estamos utilizando o IP " + request.getRemoteAddr() );

		out.println("</body></html>" );
	}

}
