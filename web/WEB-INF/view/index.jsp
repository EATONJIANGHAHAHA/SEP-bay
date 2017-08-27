<%-- 
    Document   : category aka index
    Created on : 27/08/2017, 6:10:01 PM
    Author     : PattyPutty
--%>
<!-- Import declaration -->
<%@ page import="java.util.*, java.text.*"  %>
<%@ page import="java.util.List, java.text.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>sepBay - your one stop shopping and selling platform</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Latest compiled and minified CSS CDN-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScriptCDN -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

        <!-- font awsome CDN -->
        <script src="https://use.fontawesome.com/fdad8c0f38.js"></script>

        <!-- main style -->
        <link rel="stylesheet" type="text/css" href="../../css/style.css">
    </head>

    <body>
        <div id="wrapper">

            <!--header in the header page-->
            <%@ include file = "../fragment/footer.html" %> <!-- declared in the web.xml in config file folder-->

            <!--<section class="banner">-->
            <!--    <div class="jumbotron">-->
            <!--        <div class="container">-->
            <!--            <p><a class="btn btn-primary btn-lg" href="#" role="button">Start Shopping!</a></p>-->
            <!--            <p>This is a full width banner</p>-->
            <!--        </div>-->
            <!--    </div>-->
            <!--</section>-->
<%
  Date now = new Date();
 
  DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss SSS");
  
  
%>
<h4>Current Time:</h4>
<%=df.format(now)%>
            <section class="main-content group-width">
                <div id="sidebar">
                    <h3>Categories</h3>
                    <ul class="nav nav-pills nav-stacked">
                        <li class="selected active">
                            <a href="">All</a>
                        </li>
                        <!-- {% for c in categories %} embbed JSP here for loop all the cateogry??? --> 
                        <li class="selected">

                            <a href="#">Category 1</a>  <!--can loop all the categories?-->

                            <!-- <a href="{{ c.get_absolute_url }}">{{ c.name }}</a> get the url link-->
                        </li>
                    </ul>
                </div>

                <div id="main" class="product-list">
                    <!--<h1>{% if category %}{{ category.name }}{% else %}Products{% endif %}</h1>-->
                    <h1>Products</h1>
                    <!--{% for product in products %} JSP should embed here for loop all the product and image--> 
                    <div class="item flex-container">
                        <div class="flex-item">
                            <a href="item.html" class="thumbnail"><!--<a href="{{ product.get_absolute_url }}">-->
                                <img src="img/no_image.png" alt="click to see product detail">
                            </a>
                            <!-- Use JSP to render product name and price <a href="{{ product.get_absolute_url }}">{{ product.name }}</a><br> ${{ product.price }}-->
                            <span>product.name</span><br>
                            <span>Price: $0.00</span>
                            <button type="button" class="btn btn-primary">Add cart</button>
                        </div>


                        <div class="flex-item">
                            <a href="item.html" class="thumbnail"><!-- click to see the specific item? Can JSP does it too??? <a href="{{ product.get_absolute_url }}">-->
                                <img src="img/no_image.png" alt="...">
                            </a>
                            <!-- Use JSP to render product name and price <a href="{{ product.get_absolute_url }}">{{ product.name }}</a><br> ${{ product.price }}-->
                            <span>product.name</span><br>
                            <span>Price: $0.00</span>
                            <button type="submit" class="btn btn-primary">Add cart</button>
                        </div>
                    </div> <!--flex container-->
                </div>

            </section>


            <footer>

            </footer>
        </div>
        <!-- /wrapper -->
    </body>

</html>

