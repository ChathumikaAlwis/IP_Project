/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    <script>
            function clicke(){
                document.getElementById("addbtn").disabled = true;
                //    document.getElementById("addbtn").disbled = true;
                    /*     int key= Integer.parseInt(request.getParameter("k"));
                    System.out.println(item+"ye"+k);
                    Cookie c = new Cookie("item"+key,item);
                    c.setMaxAge(24 * 60 * 60);
                    response.addCookie(c);
                    k++;*/
            alert('ds');        
                    <%
        if(session.getAttribute("username")==null){response.sendRedirect("login.jsp");}
        try{
            String unn = (String)session.getAttribute("username");
        String sq33 = "SELECT cusId FROM customer WHERE username='"+ unn  +"';";
        
        ResultSet rs33 = con.executeSelect(sq33);
        rs33.next();
        String userId = rs33.getString(1);
        System.out.println(userId);
 
        
                           String item =null;
                    item =request.getParameter("itemid");                    
                    String s = "INSERT INTO cart(userId,itemId) VALUES("+userId+","+item+");";
                    String rest = con.execInsert(s);
                    System.out.println(rest+"res");
        
        }
        catch(Exception e){System.out.println(e.getLocalizedMessage()+"asd");}
 
                    %>
          location.refresh(true);                  };

          
          </script>


