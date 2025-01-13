package com.example.bai_thi_module3.Controller;

import com.example.bai_thi_module3.Entity.Land;
import com.example.bai_thi_module3.Service.ILand;
import com.example.bai_thi_module3.Service.LandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet(name = "LandController", urlPatterns = "/land")
public class LandController extends HttpServlet {
    private ILand landservice = new LandService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete":
                String id = req.getParameter("id");
                landservice.remove(id);
                resp.sendRedirect("/land?message=deleted");
                break;
            case "create":
                req.getRequestDispatcher("/WEB-INF/View/CreateLand.jsp").forward(req, resp);
                break;
            default:
                String message = req.getParameter("message");
                if (message != null) {
                    if (message.equals("deleted")) {
                        req.setAttribute("message", "Xóa thành công");
                    } else if (message.equals("created")) {
                        req.setAttribute("message", "Thêm mới thành công");
                    }
                }
                List<Land> lands = landservice.getAll();
                req.setAttribute("lands", lands);
                req.getRequestDispatcher("/WEB-INF/View/LandDisplay.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                String id_land = req.getParameter("id_land");
                String status = req.getParameter("status");
                String area = req.getParameter("area");
                int floor = Integer.parseInt(req.getParameter("floor"));
                String type = req.getParameter("type");
                int price = Integer.parseInt(req.getParameter("price"));
                String start_date = req.getParameter("start_date");
                String end_date = req.getParameter("end_date");
                String description = req.getParameter("description");
                Land land = new Land(id_land, status, area, floor, type, price, start_date, end_date, description);
                landservice.save(land);
                resp.sendRedirect("/land?message=created");
                break;
        }
    }

}
