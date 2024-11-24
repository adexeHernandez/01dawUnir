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
set /p dir_raiz="Introduce el nombre del directorio raiz: "

:: Crear la estructura de directorios
mkdir "%dir_raiz%" >nul 2>&1
mkdir "%dir_raiz%\RED" >nul 2>&1
mkdir "%dir_raiz%\SISTEMA" >nul 2>&1
mkdir "%dir_raiz%\ONLINE" >nul 2>&1

echo Estructura creada en "%dir_raiz%".
pause
goto MENU

:crear_informacion
cls
echo ===============================
echo         CREAR INFORMACION
echo ===============================

:: Verificar si la estructura existe
set /p dir_raiz="Introduce el nombre del directorio raiz (donde se guardara la informacion): "

if not exist "%dir_raiz%" (
    echo El directorio raiz no existe. Crea la estructura primero.
    pause
    goto MENU
)

:: Crear CONFIGRED.txt en la carpeta RED
ipconfig > "%dir_raiz%\RED\CONFIGRED.txt"
echo Archivo CONFIGRED.txt creado en "%dir_raiz%\RED".

:: Crear CHEQUEO.txt en la carpeta SISTEMA
set /p unidad="Introduce la letra de la unidad para ejecutar CHKDSK (ejemplo: C): "
chkdsk %unidad%: > "%dir_raiz%\SISTEMA\CHEQUEO.txt"
echo Archivo CHEQUEO.txt creado en "%dir_raiz%\SISTEMA".

:: Crear PING.txt en la carpeta ONLINE
set /p ip="Introduce la direccion IP o dominio para hacer el ping: "
ping %ip% > "%dir_raiz%\ONLINE\PING.txt"
echo Archivo PING.txt creado en "%dir_raiz%\ONLINE".

pause
goto MENU

:consola
    REM Cambiar al directorio raíz del sistema (generalmente C:)
    cls
    cd /d %SystemDrive%\
    cmd /k

:exit
    cls
    echo.
    echo Para salir del programa, responde este acertijo:
    echo.
    echo Tengo muchos nucleos, pero no soy un planeta.
    echo Quien soy?
    echo.
    set /p respuesta=Tu respuesta: 

        if /i "%respuesta%"=="procesador" (
            echo.
            echo Correcto! Tu logica es tan rapida como un i9-13900K.
            echo.
            echo Presiona cualquier tecla para salir...
            pause >nul
            exit
        ) else (
            echo.
            echo Respuesta incorrecta. Tu reloj interno debe estar desincronizado.
            echo.
            echo Presiona cualquier tecla para volver a intentarlo o crtl+c si te rindes.
            pause >nul
                goto :exit
        )