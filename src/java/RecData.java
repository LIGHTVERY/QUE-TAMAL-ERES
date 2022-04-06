/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chemi
 */
@WebServlet(urlPatterns = {"/RecData"})
public class RecData extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>!Eres un tamal?</title>"); 
            String tamal = request.getParameter("mes");
            String tip_tamal = null;
            out.println("<style>html{background: #F1FEEC}</style>");
            out.print("<style> .hover-img {\n" +
"  color: #fff;\n" +
"  display: inline-block;\n" +
"  margin: 8px;\n" +
"  left: 25%; \n" +
"  max-width: 700px;\n" +
"  min-width: 600px;\n" +
"  overflow: hidden;\n" +
"  position: relative;\n" +
"  text-align: center;\n" +
"  width: 100%;\n" +
"}\n" +
"\n" +
".hover-img * {\n" +
"  box-sizing: border-box;\n" +
"  transition: all 0.45s ease;\n" +
"}\n" +
"\n" +
".hover-img:before,\n" +
".hover-img:after {\n" +
"  background-color: rgba(0, 0, 0, 0.5);\n" +
"  border-top: 32px solid rgba(0, 0, 0, 0.5);\n" +
"  border-bottom: 32px solid rgba(0, 0, 0, 0.5);\n" +
"  position: absolute;\n" +
"  top: 0;\n" +
"  bottom: 0;\n" +
"  left: 0;\n" +
"  right: 0;\n" +
"  content: '';\n" +
"  transition: all 0.3s ease;\n" +
"  z-index: 1;\n" +
"  opacity: 0;\n" +
"  transform: scaleY(2);\n" +
"}\n" +
"\n" +
".hover-img img {\n" +
"  vertical-align: top;\n" +
"  max-width: 100%;\n" +
"  backface-visibility: hidden;\n" +
"}\n" +
"\n" +
".hover-img figcaption {\n" +
"  position: absolute;\n" +
"  top: 0;\n" +
"  bottom: 0;\n" +
"  left: 0;\n" +
"  right: 0;\n" +
"  align-items: center;\n" +
"  z-index: 1;\n" +
"  display: flex;\n" +
"  flex-direction: column;\n" +
"  justify-content: center;\n" +
"  line-height: 1.1em;\n" +
"  opacity: 0;\n" +
"  z-index: 2;\n" +
"  transition-delay: 0.1s;\n" +
"  font-size: 24px;\n" +
"  font-family: sans-serif;\n" +
"  font-weight: 400;\n" +
"  letter-spacing: 1px;\n" +
"  text-transform: uppercase;\n" +
"}\n" +
"\n" +
".hover-img:hover:before,\n" +
".hover-img:hover:after {\n" +
"  transform: scale(1);\n" +
"  opacity: 1;\n" +
"}\n" +
"\n" +
".hover-img:hover > img {\n" +
"  opacity: 0.7;\n" +
"}\n" +
"\n" +
".hover-img:hover figcaption {\n" +
"  opacity: 1;\n" +
"}</style>");
            out.println("</head>");
            out.println("<body>");
            if ("Enero".equals(tamal) || "enero".equals(tamal)){
                tip_tamal = "Rojo";
                out.println("<center><h1>!"+ request.getParameter("nombre")+" eres un tamal de " + tip_tamal +"¡</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='rojo.jpg' alt='rojo'>");
                out.println("</div><figcaption>");
                out.println("<p>- Te gustan los memes. \n<br>" +
"- Te crees único y especial. \n<br>" +
"- Desesperas a los demás. \n<br>" +
"- Todo te da risa.</p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Febrero".equals(tamal) || "febrero".equals(tamal)){
                tip_tamal = "Mole";
                out.println("<center><h1>!"+ request.getParameter("nombre")+" eres un tamal de " + tip_tamal +"¡</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='Mole.jpeg' alt='mole'>");
                out.println("</div><figcaption>");
                out.println("<p>- Eres medio pesado pero a veces dulce. \n<br>" +
"- Te quejas de todo.\n<br>" +
"- Eres impuntual. \n<br>" +
"- Te gusta ser el centro de atención.</p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Marzo".equals(tamal) || "marzo".equals(tamal)){
                tip_tamal = "Oaxaqueño";
                out.println("<center><h1>!"+ request.getParameter("nombre")+" eres un tamal de " + tip_tamal +"¡</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='oaxaqueño.jpg' alt='oaxaqueño'>");
                out.println("</div><figcaption>");
                out.println("<p>- Eres de provincia. \n <br>" +
"- Le caes bien a todos. \n <br>" +
"- Siempre estás a dieta. \n <br>" +
"- Vives con sueño. </p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Abril".equals(tamal) || "abril".equals(tamal)){
                tip_tamal = "Dulce";
                out.println("<center><h1>!"+ request.getParameter("nombre")+" eres un tamal de " + tip_tamal +"¡</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='dulce.jpg' alt='dulce'>");
                out.println("</div><figcaption>");
                out.println("<p>- Le caes bien a las señoras. \n <br>" +
"- Eres sencillo. \n <br>" +
"- Siempre sonríes.\n <br>" +
"- 100% godín.</p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Mayo".equals(tamal) || "mayo".equals(tamal)){
                tip_tamal = "Guajolota";
                out.println("<center><h1>!"+ request.getParameter("nombre")+" eres un tamal de " + tip_tamal +"¡</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='guajolota.jpg'> alt='guajolota'");
                out.println("</div><figcaption>");
                out.println("<p>- No te andas con rodeos. \n <br>" +
"- Los de provincia no te entienden. \n <br>" +
"- Eres versátil. \n <br>" +
"- Sacas de apuros.</p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Junio".equals(tamal) || "junio".equals(tamal)){
                tip_tamal = "Mini Tamal";
                out.println("<center><h1>!"+ request.getParameter("nombre")+" eres un tamal de " + tip_tamal +"¡</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='Minitamal.jpg' alt='Mini tamal'>");
                out.println("</div><figcaption>");
                out.println("<p>- Eres unico y diferente\n <br>"
                        + "- Pides bebida 'sin popote'\n <br>"
                        + "- Comes Gluten-free</p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Julio".equals(tamal) || "julio".equals(tamal)){
                tip_tamal = "Rajas";
                out.println("<center><h1>!"+ request.getParameter("nombre")+" eres un tamal de " + tip_tamal +"¡</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='rajas.jpg' alt='rajas'>");
                out.println("</div><figcaption>");
                out.println("<p>- Le entras a todo. \n <br>" +
"- Eres de barrio. \n <br>" +
"- Siempre te desvelas. \n <br>" +
"- Tienes gastritis. </p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Agosto".equals(tamal) || "agosto".equals(tamal)){
                tip_tamal = "Corunda";
                out.println("<center><h1>!"+ request.getParameter("nombre")+" eres un tamal de " + tip_tamal +"¡</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='corunda.jpg' alt='corunda'>");
                out.println("</div><figcaption>");
                out.println("<p>- Te cotizas \n <br>"
                        + "- Eres sarcastico \n <br>"
                        + "- No sales a cualquier lado \n <br>/p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Septiembre".equals(tamal) || "septiembre".equals(tamal)){
                tip_tamal = "Bola";
                out.println("<center><h1>!"+ request.getParameter("nombre")+" eres un tamal de " + tip_tamal +"¡</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='bola.jpg' alt='bola'>");
                out.println("</div><figcaption>");
                out.println("<p>- Te gustan los memes. \n <br>" +
"- Te crees único y especial. \n <br>" +
"- Desesperas a los demás. \n <br>" +
"- Todo te da risa. </p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Octubre".equals(tamal) || "octubre".equals(tamal)){
                tip_tamal = "Zacahuil";
                out.println("<center><h1>!"+ request.getParameter("nombre")+" eres un tamal de " + tip_tamal +"¡</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='zacahuil.jpg' alt='zacahuil'>");
                out.println("</div><figcaption>");
                out.println("<p>- No te importa la dieta \n <br>"
                        + "- Disfrutas de la vida \n <br>"
                        + "- Adoras a tu familia</p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Noviembre".equals(tamal) || "noviembre".equals(tamal)){
                tip_tamal = "Nejo";
                out.println("<center><h1>!"+ request.getParameter("nombre")+" eres un tamal de " + tip_tamal +"¡</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='nejo.jpg'> alt='nejo'");
                out.println("</div><figcaption>");
                out.println("<p>- Andas en bici. \n <br>" +
"- Siempre estás ocupado. \n <br>" +
"- Eres bien hablador/a.</p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("Diciembre".equals(tamal) || "diciembre".equals(tamal)){
                tip_tamal = "verde";
                out.println("<center><h1>!"+ request.getParameter("nombre")+" eres un tamal de " + tip_tamal +"¡</h1></center>");
                out.println("<figure class='hover-img'><div>");
                out.println("<img src='verde.jpg'> alt='verde'");
                out.println("</div><figcaption>");
                out.println("<p>- A veces caes gordo. \n <br>" +
"- Te gusta bailar salsa.\n <br>" +
"- Te peinas con mucho gel. \n <br>" +
"- Siempre ligas.</p>");
                out.println("</figcaption>");
                out.println("</figure>");
            }
            if ("".equals(tamal))
                out.println("<center><h1>No has puesto nada :C</h1></center>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
