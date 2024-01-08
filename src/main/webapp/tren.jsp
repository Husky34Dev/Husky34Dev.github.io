<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Tren</title>
        <link rel="stylesheet" href="styles/style.css">
</head>
<body>
    <div id="container">
<h1>Formulario de Tren</h1>

<form action="SvTerminarTren" method="post">

    <label for="destino">Destino:</label>
    <input type="text" id="destino" name="destino" required><br>

    <label for="horaLlegada">Hora de Llegada:</label>
    <input type="time" id="horaLlegada" name="horaLlegada" required><br>

    <label for="horaSalida">Hora de Salida:</label>
    <input type="time" id="horaSalida" name="horaSalida" required><br>

    <label for="numeroVia">Número de Vía:</label>
    <input type="number" id="numeroVia" name="numeroVia" required><br>

    <input type="submit" value="Enviar">
</form>
    </div>

</body>
</html>
