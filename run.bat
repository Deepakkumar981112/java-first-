@echo off
set /p file=Enter filename (without .java):
set /p classname=Enter class with main() to run:

echo Compiling %file%.java...
javac %file%.java

if %errorlevel% neq 0 (
    echo ❌ Compilation failed!
    exit /b
)

echo Running %classname%...
java %classname%
