Instrucciones Alfresco Content Services

Abrir una terminal.

1. Ubicarse en el lugar donde está el archivo docker-compose.yml

	Ejeutar el comando:

	docker login quay.io -u="alfresco+acs_v6_trial"

	copiar y pegar la siguiente credencial:

	MDF9RNGUJPKZ83KK8UVGUVWO9AYKUZ0VN6WG5VOOCUT6BX19JJLU5ZL0HKU7N20C

2. Ejecutar el siguiente comando:
	
	docker-compose up


3. Comprobar servicios

	username/password is: admin/admin
	
	http://localhost:8080/workspace/
	http://localhost:8080/alfresco/
	http://localhost:8080/share/page/
		Crear el usuario analista.marketing con clave analista.marketing en admin tools - users
		


