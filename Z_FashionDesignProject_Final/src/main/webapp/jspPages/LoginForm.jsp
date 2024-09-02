<%@page import="eCommerce.demo.model.Blazers_table"%>
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
    <link rel="stylesheet" href="../cssStyle/newtemp.css">

    <link rel="icon" href="/assets/favicon.png" type="image/x-icon">

    <title>Majestique | Blazers</title>
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
                
                <li><a href="jspPages/AdminAddProducts.html">ADMIN</a></li>

                <li><a href="#">STORES</a></li>
                <li><a href="/getCart"><i class="fa-solid fa-bag-shopping"></i></a></li>
            </ul>
            <a href="#" class="action_btn">LOGIN</a>
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
    <hr> 

    <!-- ########################################################################## -->
    
    <div class="reg">
        <h2>User LOGIN</h2>
    </div>

    <div class="regform">

        <form action="/login" class="regnewform">
            <p>Email</p>
            <input type="email" name="Email" placeholder="Email">
            <p>Password</p>
            <input type="password" name="Password" placeholder="Password">
            <br> <br> <br>
            <button type="submit" name="login">LOGIN</button>
        </form>
    </div>

    <div class="here">
        <p>Don't Have an Account, </p>
        <a href="/registration">&nbsp; &nbsp; Register Here</a>
    </div>

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

</body>
</html>