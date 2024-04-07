Instrucciones Alfresco Processs Services (Activiti)

1. Para descargar las imágenes de Docker Hub, utilice los siguientes comandos:

docker pull alfresco/process-services:24.1.0
docker pull alfresco/process-services-admin:24.1.0

Para ejecutar los contenedores localmente usando Docker para escritorio, use los siguientes comandos especificando un puerto al que asignar:

docker run -p 8085:8080 alfresco/process-services:24.1.0
docker run -p 8086:8080 alfresco/process-services-admin:24.1.0


Una vez que los contenedores se hayan iniciado, visite las siguientes URL para acceder a las aplicaciones:

http://localhost:8085/activiti-app
http://localhost:8086/activiti-admin

Por ejemplo, http://localhost:8085/activiti-admin ejecuta la aplicación Administrador en el puerto 8085.