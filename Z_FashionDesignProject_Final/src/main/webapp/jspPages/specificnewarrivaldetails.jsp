<%@page import="eCommerce.demo.model.Newarrival_table"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,500;0,600;1,100&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../cssStyle/indexStyle.css">
    <link rel="stylesheet" href="../cssStyle/indexStyleMediaQuery.css">
    <link rel="stylesheet" href="../cssStyle/getproductsstyle.css">
    <link rel="stylesheet" href="/jspPages/style1.css">
    <link rel="stylesheet" href="/jspPages/StyleMediaQuery.css">
    <link rel="icon" href="/assets/favicon.png" type="image/x-icon">
    <title>Details</title>
</head>
<body>
    <div class="mlogo">MAJESTIQUE</div>
    <header>
        <div class="navbar">
            <div class="logo"><a href="/htmlpages/index.html">MAJESTIQUE</a></div>
            <ul class="links">
                <li><a href="/getNewArrival">NEW ARRIVALS</a></li>
                <!-- <li><a href="#">MEN</a></li> -->
                
                <div class="dropdown">
                    <button class="dropbtn">MEN</button>
                    <div class="dropdown-content">
                      <a href="/getTshirts">T-SHIRTS</a>
                      <a href="/getMenJeans">JEANS</a>
                      <a href="/getshirts">SHIRTS</a>
                      <a href="/getBlazer">BLAZERS</a>
                      <a href="/getTrousers">TROUSERS</a>
                    </div>
                </div>
                
                <!-- <li><a href="#">WOMEN</a></li> -->
                
                <div class="dropdown">
                    <button class="dropbtn">WOMEN</button>
                    <div class="dropdown-content">
                      <a href="/getTops">TOPS</a>
                      <a href="/getWomenjeans">JEANS</a>
                      <a href="/getWomenshirts">SHIRTS</a>
                      <a href="/getDresses">DRESSES</a>
                      <a href="/getTunics">TUNICS</a>
                    </div>
                </div>
                
                <!-- <li><a href="#">EXPLORE MORE</a></li> -->
                
                <div class="dropdown">
                    <button class="dropbtn">EXPLORE MORE</button>
                    <div class="dropdown-content">
                      <a href="#">ABOUT US</a>
                      <a href="#">CONTACT</a>
                      <a href="#">BLOGS</a>
                    </div>
                </div>
                
                
                <li><a href="#">STORES</a></li>
                <li><a href="/getCart"><i class="fa-solid fa-bag-shopping"></i></a></li>
            </ul>
            <a href="/login" class="action_btn">LOGIN</a>
            <div class="toggle_btn">
                <i class="fa-solid fa-bars"></i>
            </div>
        </div>

        <div class="dropdown_menu open">
            <li><a href="/getNewArrival">NEW ARRIVALS</a></li>
            <li><a href="/getBlazer">MEN</a></li>
            <li><a href="/getTops">WOMEN</a></li>
            <li><a href="#">EXPLORE MORE</a></li>
            <li><a href="#">STORES</a></li>
            <li><a href="/getCart"><i class="fa-solid fa-bag-shopping"></i></a></li>
            <li><a href="#" class="action_btn">LOGIN</a></li>
        </div>
    </header>
   


    <!-- ########################################################################## -->
     
        <%        
            Newarrival_table b = (Newarrival_table)request.getAttribute("arrival");   
        %>

    <div class="dropdown_menu open">
        <li><a href="#">NEW ARRIVALS</a></li>
        <li><a href="#">MEN</a></li>
        <li><a href="#">WOMEN</a></li>
        <li><a href="#">EXPLORE MORE</a></li>
        <li><a href="#">STORES</a></li>
        <li><a href="/getCart"><i class="fa-solid fa-bag-shopping"></i></a></li>
        <li><a href="#" class="action_btn">LOGIN</a></li>
    </div>
</header>
<hr>
<section id="prodetails" class="section-p1">
    <div class="single-pro-image">
        <img src="/jspPages/jspImages/images/<%=b.getImage1()%>" alt="Image" width="100%" id="MainImg">

        <div class="small-img-group">
            <div class="small-img-col">
                <img src="/jspPages/jspImages/images/<%=b.getImage2()%>" alt="Image" width="100%" class="small-img">

            </div>
            <div class="small-img-col">
                <img src="/jspPages/jspImages/images/<%=b.getImage3()%>" alt="Image" width="100%" class="small-img">

            </div>
            <div class="small-img-col">
                <img src="/jspPages/jspImages/images/<%=b.getImage4()%>" alt="Image" width="100%" class="small-img">

            </div>
            <div class="small-img-col">
                <img src="/jspPages/jspImages/images/<%=b.getImage5()%>" alt="Image" width="100%" class="small-img">
            </div>
        </div>
    </div>
    <div class="single-pro-details">
        <h1>Product Details :</h1><br>
        <h3>&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; Title : <%= b.getTitle() %></h3><br>
        <h3>&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; Original Price : &#8377 <%= b.getPrice_dis() %></h3><br>
        <h3>&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; Discount Price : &#8377 <%= b.getPrice_ori() %></h3><br>
        <h3>&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; OFF : <%= b.getOff() %> %</h3><br>
        <h3>&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; <%= b.getTitle() %></h3><br>
        <select>
            <option>Select size</option>
            <option>S</option>
            <option>M</option>
            <option>L</option>
            <option>XL</option>
            <option>XXL</option>
            <option>XXXL</option>
        </select>   
        <div class="feat">
            <h3>Product Features</h3>
            <h5>&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; product name : <%= b.getStyle_name() %></h5>
            <h5>&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; product Color : <%= b.getColor() %></h5>
            <h5>&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; product Category : <%= b.getCategory() %></h5>
            <h5>&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; product Pattern : <%= b.getPattern() %></h5>
        </div>
        <div class="buybut">
            <button class="normal" id="btn1">Add to Cart</button><br>
            <a href="../htmlpages/index.html"><button class="normal" id="btn">Continue to shopping</button></a>
        </div>
    </div>
</section>

    <!-- ################################################################################ -->


    <footer>
        <div class="footer-contents">
            <img src="/assets/favicon.png" alt="Logo" style="height: 150px;">
            <h2>MAJESTIQUE</h2>
            <p>You car buy premium quality clothing from our website and you can also visit our nearest stores.</p>
            <ul class="footerlinks">
                <li><a href="#">About Us</a></li>
                <li><a href="#">Contact</a></li>
                <li><a href="#">Blogs</a></li>
                <li><a href="#">More Brands</a></li>
                <li><a href="#">Information</a></li>
            </ul>
        </div>
        <div class="footer-bottom">
            <p>copyright &copy;2023 Spark. designed by <span>Gururaj</span></p>
        </div>
    </footer>










    <script>
    // Script for drop down menu

        const toggleBtn = document.querySelector('.toggle_btn')
        const toggleBtnIcon = document.querySelector('.toggle_btn i')
        const dropDownMenu = document.querySelector('.dropdown_menu')
        
        toggleBtn.onclick = function()
        {
            dropDownMenu.classList.toggle('open')
            const isOpen = dropDownMenu.classList.contains('open')

            toggleBtnIcon.classList = isOpen
            ? 'fa-solid fa-xmark'
            : 'fa-solid fa-bars'
        }

        </script>
        <script>
            var MainImg = document.getElementById("MainImg");
            var smalling = document.getElementsByClassName("small-img");
            smalling[0].onclick = function () {
                MainImg.src = smalling[0].src;
            }
            smalling[1].onclick = function () {
                MainImg.src = smalling[1].src;
            }
            smalling[2].onclick = function () {
                MainImg.src = smalling[2].src;
            }
            smalling[3].onclick = function () {
                MainImg.src = smalling[3].src;
            }
        </script>

</body>
</html>