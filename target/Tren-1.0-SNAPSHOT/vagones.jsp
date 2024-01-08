<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/style.css">
    </head>
    <body>
        <div id="container">
            <h1>I like trains, hope you too</h1>

            <!-- Formulario para crear vagones -->
            <form action="SvVagones" method="POST">
                <p>Elige el tipo de vagón que deseas crear:</p>
                <label>Tipo de vagón:</label>
                <select name="tipoVagon">
                    <option value="mercancias">Vagón de Mercancías</option>
                    <option value="pasajeros" selected>Vagón de Pasajeros</option>
                </select>

                <!-- Campos comunes para ambos tipos de vagones -->
                <label>Código de vagon</label>
                <input type="number" name="codigoVagon"/>
                <label>Marca del vagon</label>
                <input type="text" name="marcaVagon"/>
                <label>Modelo del vagon</label>
                <input type="text" name="modeloVagon"/>

                <!-- Campos específicos para VagonMercancias -->
                <div id="mercanciasFields" style="display:none;">
                    <label>Capacidad de carga</label>
                    <input type="number" name="capacidadCargaVagon"/>
                    <label>Tipo de mercancia (separado por comas)</label>
                    <input type="text" name="tipoMercanciaVagon"/>
                </div>

                <!-- Campos específicos para VagonPasajeros -->
                <div id="pasajerosFields" style="display:none;">
                    <label>Número de asientos</label>
                    <input type="number" name="numeroAsientosVagon"/>
                </div>

                <input type="submit" name="CrearVagon" value="Añadir vagon">
                <input type="button" id="trenCompleto" value="Terminar"/>
            </form>

            <script>
                document.addEventListener('DOMContentLoaded', () => {
                    let pasajerosFields = document.getElementById('pasajerosFields');
                    let terminar=document.getElementById("trenCompleto");
                    terminar.addEventListener('click',()=>{
                        window.location.href="tren.jsp";
                    })
                    

                    pasajerosFields.style.display = 'block';


                    // Mostrar u ocultar campos específicos según el tipo de vagón seleccionado
                    document.querySelector('select[name="tipoVagon"]').addEventListener('change', function () {
                        var mercanciasFields = document.getElementById('mercanciasFields');

                        if (this.value === 'mercancias') {
                            mercanciasFields.style.display = 'block';
                            pasajerosFields.style.display = 'none';
                        } else if (this.value === 'pasajeros') {
                            mercanciasFields.style.display = 'none';
                            pasajerosFields.style.display = 'block';

                        }
                    });
                });

            </script>

        </div>
    </body>
</html>
