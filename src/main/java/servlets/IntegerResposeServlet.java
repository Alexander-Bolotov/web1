package servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mult")
public class IntegerResposeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String valueParam = request.getParameter("value");
        if (valueParam == null || !valueParam.matches("[+-]?\\d+")) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().print(0);
        } else {
            response.setStatus(HttpServletResponse.SC_OK);
            response.getWriter().print(Integer.parseInt(valueParam) * 2);
        }
        response.setContentType("text/html;charset=utf-8");
    }
}
