<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Login</title>
        <% session.invalidate(); %>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <script> 
    $(function(){
      $("#includedHeader").load("header.html");
      $("#includedFooter").load("footer.html");
    });
    </script>
   
    </head>
    <body  style="background-color: #000000">
                
    <div id="includedHeader"></div>
    <br/><br/>
    <br/><br/>
        <div class="container">    
        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info">
                    <div class="panel-heading" style="background-color: #000000">
                        <div class="panel-title" style="background-color: #000000; color: #ffffff">Sign In</div>
                        <div style="float:right; font-size: 80%; position: relative; top:-10px;"><a href="#">Forgot password?</a></div>
                    </div>     

                    <div style="padding-top:30px; background-color: #000000" class="panel-body">

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                        
                                    
                            <% String status = (String)request.getAttribute("status");
                            if(status!=null){
                            %>
                            <h5 class="text-danger"><%= status %></h5>  <%}%>
 <form name="loginform" id ="loginform" class="form-horizontal" rple="form" action="loginServlet" method="POST">
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="login-username" type="text" class="form-control" name="username" value="" placeholder="username or email">                                        
                                    </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="password" placeholder="password">
                                    </div>
                                
                            <div class="input-group">
                                <div class="checkbox" style="color: #ffffff">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                        </label>
                                      </div>
                                    </div>


                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                        </a><input type="submit" id="btn-login" class="btn-success" value="Login" name="login" />
                                    </div>
                                </div>
</form>

                                <div class="form-group">
                                    <div class="col-md-12 control">
                                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%; color: #ffffff" >
                                            Don't have an account! 
                                        <a href="register.html">
                                            Sign Up Here
                                        </a>
                                        </div>
                                    </div>
                                </div>    
                                 



                        </div>                     
                    </div>  
        </div>
        </div>
    <br/><br/>
    <br/><br/>
     <div id="includedFooter"></div>
    </body>
</html>
