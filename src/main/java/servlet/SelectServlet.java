package servlet;

import entity.Maven;
import service.MavenService;
import service.impl.MavenServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SelectServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("name");
        Integer  pwd=Integer.parseInt(request.getParameter("pwd"));
        MavenService ms=new MavenServiceImpl();
        int count=ms.select(name,pwd);
        if (count>0){
            out.print("<script type='text/javascript'>alert('登入成功!');</script>");
        }else{
            out.print("<script type='text/javascript'>alert('登录失败!');</script>");
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    doPost(request,response);
    }
}
