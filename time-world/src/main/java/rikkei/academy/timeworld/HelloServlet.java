package rikkei.academy.timeworld;

import java.io.*;
import java.util.Date;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "time-world", value = "/time-world")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Hello World</h1>");
        writer.println("</html>");
        writer.println("<html>");
        Date today = new Date();
        writer.println("<h1>" + today +"</h1>");
        writer.println("</html>");
    }
}