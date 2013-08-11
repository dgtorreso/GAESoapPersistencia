

@echo off

color 47
echo ==================================
echo =  Creado Por Dgto               =
echo =  Creacion de Webservices Soap  =
echo =                                =
echo ==================================
echo.
echo.


set rutaproyecto="C:\Users\Familia\workspace\Pruebas"
::variables que especifican los lugares que necesita acceder el wsgen

::rute de wsgen, especifique la ruta dentro del jdk
set	rutawsgen="C:\Program Files\Java\jdk1.7.0_25\bin\wsimport.exe"
set clases=./bin
set codigo=./src

cd %rutaproyecto%

::Esta linea debe reproducirse para cada uno de los servicios, al final se coloca el el nombre completo de la clase.
%rutawsgen% -d %clases% -s %codigo% -p com.dv.persistencia.cliente.auto -keep http://localhost:8888/UsuarioServicioService.wsdl
pause
