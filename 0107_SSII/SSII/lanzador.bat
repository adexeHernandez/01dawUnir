@echo off
cls
REM MENU "OLD SCHOOL"

:MENU
cls
echo ===================================
echo    __  __  ______  _   _   _    _ 
echo   :  \/  : :  ____: : \ : : :  : :
echo   : :  : : : :__   :  \: : :  : :
echo   : :\/: : :  __:  : . ` : :  : :
echo   : :  : : : :____ : :\  : :__: :
echo   :_:  :_: :______:_: \_: :____: 
echo ===================================
echo.
echo 1. CREAR ESTRUCTURA
echo 2. CREAR INFORMACION
echo 3. VOLVER A LA CONSOLA
echo 4. SALIR 

choice /c 1234 /M "Elige una opcion"

if errorlevel 4 goto :exit
if errorlevel 3 goto :consola
if errorlevel 2 goto :crear_informacion
if errorlevel 1 goto :crear_estructura

:crear_estructura
cls
echo ===============================
echo         CREAR ESTRUCTURA
echo ===============================
set /p directorio="Introduce el nombre del directorio raiz: "

:: Guardar el nombre en una variable global
set "directorio=%~dp0%directorio%"

:: Crear la estructura de directorios
mkdir "%directorio%" >nul 2>&1
mkdir "%directorio%\RED" >nul 2>&1
mkdir "%directorio%\SISTEMA" >nul 2>&1
mkdir "%directorio%\ONLINE" >nul 2>&1

echo.
echo Estructura creada en "%directorio%".
pause
goto MENU

:crear_informacion
cls
echo ===============================
echo         CREAR INFORMACION
echo ===============================

:: Verificar si la estructura ya fue creada
if not defined directorio (
    echo No hay ninguna estructura creada. Por favor, usa la opcion 1 primero.
    pause
    goto MENU
)

:: Verificar si el directorio realmente existe
if not exist "%directorio%" (
    echo El directorio "%directorio%" no existe. Por favor, crea la estructura primero.
    pause
    goto MENU
)

:: Crear CONFIGRED.txt en la carpeta RED
ipconfig > "%directorio%\RED\CONFIGRED.txt"
echo Archivo CONFIGRED.txt creado en "%directorio%\RED".

:: Crear CHEQUEO.txt en la carpeta SISTEMA
set /p unidad="Introduce la letra de la unidad para ejecutar CHKDSK (ejemplo: C): "
chkdsk %unidad%: > "%directorio%\SISTEMA\CHEQUEO.txt"
echo Archivo CHEQUEO.txt creado en "%directorio%\SISTEMA".

:: Crear PING.txt en la carpeta ONLINE
set /p ip="Introduce la direccion IP o dominio para hacer el ping: "
ping %ip% > "%directorio%\ONLINE\PING.txt"
echo Archivo PING.txt creado en "%directorio%\ONLINE".
pause
goto MENU


:consola
    REM Cambiar al directorio raíz del sistema
    cls
    cd /d %SystemDrive%\
    cmd /k

:exit
cls
    echo.
    echo Para salir del programa, responde esta adivinanza:
    echo.
    echo Tengo muchos nucleos, pero no soy un planeta.
    echo Quien soy?
    echo.
    set /p respuesta=Tu respuesta: 

    if /i "%respuesta%"=="procesador" (
        goto correcto
    ) else if /i "%respuesta%"=="El procesador" (
        goto correcto
    ) else if /i "%respuesta%"=="el procesador" (
        goto correcto
    ) else (
        echo.
        echo Respuesta incorrecta. Tu reloj interno debe estar desincronizado.
        echo.
        echo Presiona cualquier tecla para volver a intentarlo o ctrl+c si te rindes.
        pause >nul
        goto :exit
)

:correcto
    echo.
    echo Correcto! Tu logica es tan rapida como un i9-13900K.
    echo.
    echo Presiona cualquier tecla para salir...
    pause >nul
    exit

    :: Tenia problemas con el chequeo en Windows 11, hay que ejecutarlo con privilegios de Administrador.
    :: Aunque la idea y el desarrollo es mio, la adivinaza esta patrocinada por chatGPT.
    :: Ejecutando el .bat desde la carpeta y no desde terminal, no consegi hacer que saliera solod el programa y no del CMD, ni siquiera con exit /b