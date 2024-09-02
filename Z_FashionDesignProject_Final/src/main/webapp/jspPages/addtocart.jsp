<%@page import="jakarta.persistence.Id"%>
<%@page import="eCommerce.demo.model.Cart_table"%>
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
    <link rel="stylesheet" href="/jspPages/addtocart.css">
    <link rel="stylesheet" href="/jspPages/StyleMediaQuery.css">
    <link rel="icon" href="/assets/favicon.png" type="image/x-icon">
    <title>MAJESTIQUE | Cart</title>
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
         <%
        
		        List<Cart_table> listcart = (List<Cart_table>)request.getAttribute("listcart");

    	%>
                
                <li><a href="#">STORES</a></li>
                <li><a href="#"><i class="fa-solid fa-bag-shopping"></i></a><span class="bagitems"><%= listcart.size() %></span></li>
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
            <li><i class="fa-solid fa-bag-shopping"></i></li>
            <li><a href="#" class="action_btn">LOGIN</a></li>
        </div>
    </header> <hr>
   


    <!-- ########################################################################## -->
     
        <div class="cart">
        	<div class="carthead">
        		<h2>YOUR CART</h2>
        		<a href="/htmlpages/index.html"><p>Continue Shopping</p></a>
        	</div>
            <div class="cartcontent">

                <hr>
                <table class="carttable">

        
        /* List<Cart_table> listcart = (List<Cart_table>)request.getAttribute("listcart"); */
                    
        for(Cart_table c:listcart)
        {
    %>


                        <tr>
                           <td><img class="cartimg" src="/jspPages/jspImages/images/<%=c.getImage1()%>" style="width: 150px;"></td>
                            <td class="td1">
                                <ul>
                                    <h3>TITLE : <%=c.getTitle() %></h3>
                                    <p>Color : <%=c.getColor() %></p>
                                    <p>Size : XL</p>
                                    <a href="#">Remove</a>
                          </ul>
                            </td>
                            <td class="td2"> &#8377 <%=c.getPrice_dis() %></td>
                            <%-- <td class="td3"><input id="inputValue" type="number" value="1" name="qty" min="1" onchange="multiply(<%=c.getPrice_dis() %>)"></td>

                            <!-- <td><p>Result: <span id="result"></span></p></td> -->
                            
                            <% 
						    	String qty = request.getParameter("qty");
						    %>
                            
                            <td class="td4" id="result"> &#8377  </td> --%>
                            
                            <td class="td3">
							    <input id="inputValue<%= c.getId() %>" type="number" value="1" name="qty" min="1" onchange="multiply(<%=c.getPrice_dis() %>, <%= c.getId() %>)">
							</td>
							
							<%
							    String qty = request.getParameter("qty");
							%>
							
							<td class="td4" id="result<%= c.getId() %>">&#8377;<span id="resultValue<%= c.getId() %>" class="subTotal"><%=c.getPrice_dis() %></span></td>
							                            
                        </tr>
    <% 
        }
    %> 
                </table>
                <hr>
            </div>
            <div class="carttotal">
                <p class="tot">SUBTOTAL &emsp; : &emsp; &#8377 <span id="AllTotal">0</span></p>
                <p class="tax">Tax Included. Shipping calculated at checkout.</p>
                <a href="#"><button class="check">Check Out</button></a>
            </div>
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



 							<!-- <script type="text/javascript">
	                            function multiply(price) {
	                            	
	                                var qty = document.getElementById("inputValue").value;
	
	                                if (qty) {
	                                    var result = parseInt(qty) * price ;
	                                    document.getElementById("result").innerHTML = " &#8377 " + result;
	                                }
	                            }
							</script> -->
							
							
							<script type="text/javascript">
								
								addTotal = ()=>{
									inputs = document.getElementsByClassName("subTotal");
									let total = 0;
									for(i=0; i< inputs.length; i++){
										total += parseInt(inputs[i].innerHTML)
									}
										document.getElementById("AllTotal").innerHTML = total
										
								}
								addTotal()
							
							    function multiply(price, id) {
							        var qty = document.getElementById("inputValue"+id).value;
							
							        if (qty) {
							            var result = parseInt(qty) * price;
							            document.getElementById("resultValue" + id).innerHTML = result;
							            
							            addTotal()
							        }
							    }
							</script>
														


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