<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Que Tamal eres?!</title>
        <style>
            html{
                background: #F1FEEC
            }
            img{
                position: relative;
                bottom: 200px;
                left: 200px;
                max-height: 400px;
                max-width: 400px;
            }
        </style>
    </head>
    <body>
        <h1>¡DESCUBRE QUE TAMAL ERES!</h1
        <div>
            <p>Todo mexicano que se respete come todos los fines de semana un tamal con su atolito</p>
            <p>¿Verde, oaxaqueño, dulce, de queso?,¡No importa!, todos son deliciosos y hay de todos los sabores y colores, por lo que viene la pregunta del millon... ¿Que tipo de tamal eres?</p>
        </div>
        <span>¡Llena el siguiente formulario para continuar!</span>
        <form id="tamalito" action="RecData">
            <br>
            Nombre:
            <br>
            <input id="nombre" name="nombre" type="text">
            <br>
            Edad:
            <br>
            <input id="edad" name="edad" type="text">
            <br>
            Sexo:
            <br>
            <input id="sexo" name="sexo" type="text">
            <br>
            Mes de nacimiento:
            <br>
            <input id="mes" name="mes" type="text">
            <br>
            <br>
            <input type="submit" value="Descubrelo!" >
        </form>
        <div>
            <center><img src="Tamales.png" alt="Tamalitos"/></center>
        </div>
    </body>
</html>
