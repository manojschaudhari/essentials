java ^
-Xms512m -Xmx1024m ^
-cp "lib\*;src\main\java;src\main\java\com\home\webproject\Webproject.gwt.xml" ^
com.google.gwt.dev.Compiler ^
-logLevel INFO ^
-draftCompile ^
-localWorkers 10 ^
-war src/main/resources/static ^
com.home.webproject.Webproject ^