## Running the project
1. Install bundle to local maven repository  
```
mvn install
```  

2. Deploy to Karaf using maven (in Karaf terminal)    
```
bundle:install mvn:com.warycoder/helloworldosgi/1.0
```  

3. Starting the bundle  
```
bundle:start helloworldosgi
```
