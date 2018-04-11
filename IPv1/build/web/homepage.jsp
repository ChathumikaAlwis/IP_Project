<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
      .container-users {
    padding: 0px 50px;
}
.container-fluid {
    padding-top: 0px;
    padding-bottom: 20px;
    padding-left: 50px;
    padding-right: 50px;
}
.container-contact{
    padding: 20px 50px;
}
      .bg-grey {
    background-color: #000000;
}
.thumbnail {
    padding: 0 0 15px 0;
    border: none;
    border-radius: 0;
    background-color: #000000; 
    color: #ffffff;
}

.thumbnail img {
    width: 100%;
    height: 100%;
    margin-bottom: 10px;
}
.carousel-control.right, .carousel-control.left {
    background-image: none;
    color: #000000;
}

.carousel-indicators li {
    border-color: #000000;
}

.carousel-indicators li.active {
    background-color: #000000;
}

.item h4 {
    font-size: 19px;
    line-height: 1.375em;
    font-weight: 400;
    font-style: italic;
    margin: 70px 0;
}

.item span {
    font-style: normal;
}
.slideanim {visibility:hidden;}
.slide {
    /* The name of the animation */
    animation-name: slide;
    -webkit-animation-name: slide; 
    /* The duration of the animation */
    animation-duration: 1s; 
    -webkit-animation-duration: 1s;
    /* Make the element visible */
    visibility: visible; 
}

/* Go from 0% to 100% opacity (see-through) and specify the percentage from when to slide in the element along the Y-axis */
@keyframes slide {
    0% {
        opacity: 0;
        transform: translateY(70%);
    } 
    100% {
        opacity: 1;
        transform: translateY(0%);
    } 
}
@-webkit-keyframes slide {
    0% {
        opacity: 0;
        -webkit-transform: translateY(70%);
    } 
    100% {
        opacity: 1;
        -webkit-transform: translateY(0%);
    }
}

.person {
    border: 10px solid transparent;
    margin-bottom: 25px;
    width: 80%;
    height: 80%;
}
.person:hover {
    border-color: #808080;
}

  </style>
  <script>
      $(window).scroll(function() {
  $(".slideanim").each(function(){
    var pos = $(this).offset().top;

    var winTop = $(window).scrollTop();
    if (pos < winTop + 600) {
      $(this).addClass("slide");
    }
  });
});
      </script>
      <script> 
    $(function(){
      $("#includedHeader").load("header.jsp");
      $("#includedFooter").load("footer.html");
    });
    </script>
   
    </head>
    <body>
        <div id="includedHeader"></div>
        <div id="body">
            
        
  <div align="center" class="embed-responsive embed-responsive-16by9">
    <video autoplay loop class="embed-responsive-item" muted>
        <source src="videos/homepage.mp4" type="video/mp4">
    </video>
</div>
            
             
  <div class="container-fluid text-center bg-grey">
  <h1 class="slideanim" style="color:#ffffff">Menu</h1>
  <h3 class="slideanim" style="color:#ffffff">What We Have For You!</h3>
  <div class="row text-center slideanim">
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="images/food2.jpg" alt="rice">
        <h4><strong>Rice</strong></h4>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="images/food3.jpg" alt="noodles">
        <h4><strong>Noodles</strong></h4>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="images/food5.jpg" alt="koththu">
        <h4><strong>Koththu</strong></h4>
      </div>
    </div>    
</div> 
  <br/><br/>
  <div class="row text-center slideanim">
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="images/food6.jpg" alt="drinks">
        <h4><strong>Drinks</strong></h4>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="images/food4.jpg" alt="deserts">
        <h4><strong>Deserts</strong></h4>
      </div>
    </div>
    <div class="col-sm-4">
      <div class="thumbnail">
        <img src="images/food7.jpg" alt="appetizers">
        <h4><strong>Appetizers</strong></h4>
      </div>
    </div>
</div>
  </div>
      
            
            
            
<div class="container text-center " style="font-weight:bold">
    <br/>
  <h3 style="font-weight:bold" class="slideanim">MEET OUR CHEFS</h3>
  <br>
  <div class="row">
    <div class="col-sm-4">
      <h4 class="text-center slideanim"><strong>CHEF GORDON</strong></h4><br>
      <a href="#demo" data-toggle="collapse">
        <img src="images/chef1.jpg" class="img-circle person slideanim" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo" class="collapse">
        <p>CHINESE COUSINE</p>
      <p>15 YEARS WORK EXPERIENCE</p>
      <p>JOINED US IN 2006</p>
      <br/><br/>
      </div>
    </div>
    <div class="col-sm-4">
      <h4 class="text-center slideanim"><strong>CHEF MICHEAL</strong></h4><br>
      <a href="#demo2" data-toggle="collapse">
        <img src="images/chef3.jpg" class="img-circle person slideanim" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo2" class="collapse">
        <p>ITALIAN COUSINE AND DRINKS</p>
      <p>22 YEARS WORKS EXPERIENCE</p>
      <p>JOINED US IN 2003</p>
      <br/><br/>
      </div>
    </div>
    <div class="col-sm-4">
      <h4 class="text-center slideanim"><strong>CHEF GERALD</strong></h4><br>
      <a href="#demo3" data-toggle="collapse">
        <img src="images/chef2.jpg" class="img-circle person slideanim" alt="Random Name" width="255" height="255">
      </a>
      <div id="demo3" class="collapse">
        <p>DESERTS</p>
      <p>11 YEARS WORK EXPERIENCE</p>
      <p>JOINED US IN 2009</p>
      <br/><br/>
      </div>
    </div>
  </div>
</div>
      
              
            <div class="container-contact bg-grey slideanim" id="contactdiv">
                <h2 class="text-center" style="color:#ffffff">Have a question?</h2><br/>
  <div class="row">
    <div class="col-sm-5">
      <p style="color:#ffffff">Contact us and we'll get back to you within 24 hours.</p>
      <p style="color:#ffffff"><span class="glyphicon glyphicon-map-marker"></span> Sri Lanka, Earth</p>
      <p style="color:#ffffff"><span class="glyphicon glyphicon-phone"></span> +94 768856505</p>
      <p style="color:#ffffff"><span class="glyphicon glyphicon-envelope"></span> support@Resturant.com</p> 
    </div>
    <div class="col-sm-7">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div> 
    </div>
  </div>
</div> 
        
            
            
            <div class="container-users text-center slideanim">
        <h2>What our customers say</h2>
<div id="myCarousel" class="carousel slide text-center" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
    <h4>"This company is the best. I am so happy with the result!"<br><span style="font-style:normal;">Michael Roe, Vice President, Comment Box</span></h4>
    </div>
    <div class="item">
      <h4>"One word... WOW!!"<br><span style="font-style:normal;">John Doe, Salesman, Rep Inc</span></h4>
    </div>
    <div class="item">
      <h4>"Could I... BE any more happy with this company?"<br><span style="font-style:normal;">Chandler Bing, Actor, FriendsAlot</span></h4>
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
    </div>  
            
            
            
        </div>

        
        
        <div id="includedFooter"></div>
    </body>
</html>
