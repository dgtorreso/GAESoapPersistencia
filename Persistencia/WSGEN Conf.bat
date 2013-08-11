@echo off
::este archivo debe estar ubicado en el directorio raiz del proyecto
color 47
echo ==================================
echo =  Creado Por Dgto               =
echo =  Creacion de Webservices Soap  =
echo =                                =
echo ==================================
echo.
echo.


set rutaproyecto="C:\Users\Familia\workspace\Persistencia"
::variables que especifican los lugares que necesita acceder el wsgen

::rute de wsgen, especifique la ruta dentro del jdk
set	rutawsgen="C:\Program Files\Java\jdk1.7.0_25\bin\wsgen.exe"
set clases=./war/WEB-INF/classes
set codigo=./src
set war=./war


cd %rutaproyecto%

::Esta linea debe reproducirse para cada uno de los servicios, al final se coloca el el nombre completo de la clase.
%rutawsgen% -cp %clases% -wsdl -keep -r %war% -d %clases% -s %codigo%  com.dv.persistencia.servicios.usuarios.UsuarioServicio
::%rutawsgen% -cp %clases% -wsdl -keep -r %war% -d %clases% -s %codigo%  com.dv.persistencia.servicios.notas.NotasServicio
pause
