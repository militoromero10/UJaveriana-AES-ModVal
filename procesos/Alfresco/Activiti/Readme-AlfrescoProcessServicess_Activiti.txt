Instrucciones Alfresco Processs Services (Activiti)

----------------------------------------------------------------------------------------------------------------------------------------------------
Instalacion.
----------------------------------------------------------------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------------------------------------------------------------
Opcion A de Instalacion.
----------------------------------------------------------------------------------------------------------------------------------------------------

Para descargar las imágenes de Docker Hub, utilice los siguientes comandos:

docker pull alfresco/process-services:24.1.0
docker pull alfresco/process-services-admin:24.1.0

Para ejecutar los contenedores localmente usando Docker para escritorio, use los siguientes comandos especificando un puerto al que asignar:

docker run -p 8085:8080 alfresco/process-services:24.1.0
docker run -p 8086:8080 alfresco/process-services-admin:24.1.0


Una vez que los contenedores se hayan iniciado, use las siguientes URL para acceder a las aplicaciones:

http://localhost:8085/activiti-app
http://localhost:8086/activiti-admin

Por ejemplo, http://localhost:8085/activiti-admin ejecuta la aplicación Administrador en el puerto 8086.


----------------------------------------------------------------------------------------------------------------------------------------------------
Opcion B de Instalacion.
----------------------------------------------------------------------------------------------------------------------------------------------------

Instalacion Windows. Ejecute el archvio alfresco-process-services-2.4.0-windows-installer.exe y siga las instrucciones. 
Puede cambiar su directorio de instalacion, por ejemplo: C:\process-services-2.4.0

En el archivo server.xml de la instalacion de tomcat cambiar puertos del servidor. C:\process-services-2.4.0\tomcat\conf\server.xml

Cambiar puesto de parada a 8006
<Server port="8006" shutdown="SHUTDOWN">

Cambiar puesto de escucha a 8085
    <Connector port="8085" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443"
               maxParameterCount="1000"
               />

En \tomcat\webapps cambiar el nombre del archivo activiti-admin.war.undeployed a activiti-admin.war, esto para desplegar el modulo admin del activiti


----------------------------------------------------------------------------------------------------------------------------------------------------
Licencia:
----------------------------------------------------------------------------------------------------------------------------------------------------
En el directorio de instalacion de Tomcat copiar el archivo de licencia activiti.lic
<Tomcat install location>\lib\

----------------------------------------------------------------------------------------------------------------------------------------------------
Accesos:
----------------------------------------------------------------------------------------------------------------------------------------------------

http://localhost:8085/activiti-app
user: admin@app.activiti.com
pass: admin

Crear Usuario para proceso
Nombre: Analista
Apellido: Marketing
Correo/Usuario: analista.marketing@saringenieria.com
pass: Analista.Makerting

http://localhost:8086/activiti-admin
user: admin
pass: admin

----------------------------------------------------------------------------------------------------------------------------------------------------
Modelo BPM en Alfresco
----------------------------------------------------------------------------------------------------------------------------------------------------
En http://localhost:8085/activiti-app/

Ir a App Designer, luego importar el modelo ValidateDesign.bpmn

Luego, en la pestaña Apps crear una nueva aplicacion con el nombre validateMarketingDesign

Editar modulos incluidos de la aplicacion creada para agregar el model validateMarketingDesign

Guardar y luego Publicar la aplicacion haciendo click en Publish.

Ir a la pagina de inicio y alli ya estara la aplicacion.

Para iniciar una instancia del proceso de manera manual, vaya a la aplicacion creada, en la pestana procesos de clic en start process

Se puede consultar tambien el estado de las instancias y tareas en http://localhost:8086/activiti-admin

----------------------------------------------------------------------------------------------------------------------------------------------------
Iniciar una instancia desde proceso bonita
----------------------------------------------------------------------------------------------------------------------------------------------------
Una vez finalizada la tarea de diseno del analista de marketing se invoca via REST la ejecucion del proceso con ID validateMarketingDesign en Alfresco Process Services.
Ejemplo de configraucion en conector de salida

URL: http://localhost:8085/activiti-app/api/enterprise/process-instances/
Autenticacion BASIC
	admin@app.activiti.com
	admin

Payload: {"processDefinitionKey":"validateMarketingDesign"}

{
  "processDefinitionKey": "validateMarketingDesign",
  "variables": [
    {
      "name": "bonitaInstanceId",
      "value": "13465"
    }
  ]
}
