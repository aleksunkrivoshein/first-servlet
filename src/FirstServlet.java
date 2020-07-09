import somePackage.Cart;

import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();

        String user = (String) session.getAttribute("current_user");

        if (user == null) {
            //response для анонимного пользователя
            // авторизация
            // регистрация
            // session.setAttribute("current_user", ID);
        } else {
            // response для авторизованного пользователя
        }

//        Cart cart = (Cart) session.getAttribute("cart");

//        String name = request.getParameter("name");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//        if (cart == null) {
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }
//
//        session.setAttribute("cart", cart);


//
//        PrintWriter pw = response.getWriter();
//
//        pw.println("<html>");
//        pw.println("<hq> Your count is: " +  + " </h1>");
//        pw.println("<html>");

        //response.sendRedirect("/testJsp.jsp");

//        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
    }
}
