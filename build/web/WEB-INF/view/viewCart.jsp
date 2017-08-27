<%-- 
    Document   : viewCart
    Created on : 27/08/2017, 6:14:15 PM
    Author     : PattyPutty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>

    <head>
        <title>sepBay - your one stop shopping and selling platform</title>
        <meta charset="UTF-8">
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


            <!--Main Content Here-->
            <section class="main-content group-width">
                {% extends "shop/base.html" %} {% load static %} {% block title %} Your shopping cart {% endblock %} {% block content %}
                <h1>Your shopping cart</h1>
                <table class="cart">
                    <thead>
                        <tr>
                            <th>Image</th>
                            <th>Product</th>
                            <th>Quantity</th>
                            <th>Remove</th>
                            <th>Unit price</th>
                            <th>Price</th>
                        </tr>
                    </thead>
                    <tbody>
                        {% for item in cart %} {% with product=item.product %}
                        <tr>
                            <td>
                                <a href="{{ product.get_absolute_url }}">
                                    <img src="{% if product.image %}{{ product.image.url }}{% else %}{% static "img/no_image.png" %}{% endif %}">
                                </a>
                            </td>
                            <td>{{ product.name }}</td>
                            <td>
                                <form action="{% url " cart:cart_add " product.id %}" method="post">
                                      {{ item.update_quantity_form.quantity }} {{ item.update_quantity_form.update }}
                                      <input type="submit" value="Update"> {% csrf_token %}
                                </form>
                            </td>
                            <td><a href="{% url " cart:cart_remove " product.id %}">Remove</a></td>
                            <td class="num">${{ item.price }}</td>
                            <td class="num">${{ item.total_price }}</td>
                        </tr>
                        {% endwith %} {% endfor %}
                        <tr class="total">
                            <td>Total</td>
                            <td colspan="4"></td>
                            <td class="num">${{ cart.get_total_price }}</td>
                        </tr>
                    </tbody>
                </table>
                <p class="text-right">
                    <a href="{% url " shop:product_list " %}" class="button light">Continue shopping</a>
                    <a href="{% url " orders:order_create " %}" class="button">Checkout</a>
                </p>
                {% endblock %}

            </section>
            <!--End Main content-->

            <footer>

            </footer>
        </div>
        <!-- /wrapper -->
    </body>

</html>

