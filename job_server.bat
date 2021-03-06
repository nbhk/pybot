@echo off
rem サーバージョブ by GonBee

rem クラッシュしたことを警告するコマンド。
set warn_crashed_cmd=start /min powershell -Command "Add-Type -Assembly System.Windows.Forms; [System.Windows.Forms.MessageBox]::Show('%1-serverがクラッシュしました。', '警告')"

cd /d %~dp0

echo .>%1-server.run
:execute
%1-server
if exist %1-server.stop (
	del %1-server.stop>nul 2>&1
	goto end
)
if errorlevel 3 (
	%warn_crashed_cmd%
	goto execute
)
if errorlevel 2 (
	echo .>%1-server.end
	goto end
)
if errorlevel 1 (
	%warn_crashed_cmd%
	goto execute
)
:end
del %1-server.run>nul 2>&1
