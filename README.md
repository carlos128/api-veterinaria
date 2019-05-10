# api-veterinaria

<h1>PRUEBA DE DESARROLLO</h1>
<p align="center">
  <img src="src/img/modelo_entida_relacion.png" width="500" title="hover text">
</p>

## AUTENTICACIÓN
<h4>Para la autenticacion del  usuario  los  puntos de entrada son<h4>
#REGISTRO DE USUARIO
<br>
/v1/api/usuario
<br>
Metodo POST
<br>
<h1>Formato  de entrada json<h1>
<br>
<pre>
{
	"userName":"gcralos3@yamail.com",
	"password":"123456",
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateDBy":"",
	"updateDt":""
}
Respuesta:
201
400
</pre>
<br>
#GENERAR  TOKEN
<br>
/login
<br>
Metodo POST<br>
<h1>Formato  de entrada json<h1>
<br>
<pre>
{
	"userName":"gcralos2@yamail.com",
	"password":"123456"
}
Respuesta:
200
403
400
</pre>
<br>
Salida
<pre>
{
  "acces_token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJnY3JhbG9zMkB5YW1haWwuY29tIiwiSWRSb2wiOltdLCJleHAiOjE1NTgzMjkxODR9.YYHYozTMyqaLik-UrBpf5BkwQh6BvYBYwzQqcIQcxJjbACe1LAcOIGGlaBjXFl_-ORe0O7jzkAcBVTgWWNe67g",
  "type": "Bearer"
}
</pre>
<br>
#Actulizar  un usuario<br>
/v1/api/usuario/id<br>
Metodo PUT<br>
<h1>Formato  de entrada json<h1><br>
En el header  enviar  el token  
<pre>
{
	"userName":"gcralos5@yamail.com",
	"password":"123459",
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateDBy":"",
	"updateDt":""
}
Respuesta:
200
403
400
</pre>
<br>
Salida el objetos con las modificaciones
<pre>
{
	"userName":"gcralos5@yamail.com",
	"password":"123459",
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateDBy":"",
	"updateDt":""
}
</pre>
<br>
#Eliminar  un usuario<br>
/v1/api/usuario/id<br>
Metodo DELETE<br>
En el header  enviar  el token  
<pre>
Respuesta:
200
403
400
</pre>
<br>
#DOCTOR<br>
<h1>Ingresar  doctor<h1><br>
/v1/api/doctor<br>
Metodo POST<br>
Formato  de entrada json<br>
En el header  enviar  el token  
<pre>
{
	"lastName":"Carlos Arturo",
	"firstName":"Gonzalez Alvarez",
	"birthdate":"1918-10-04",
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":"",
	"fk_id_user_doctor":38
}
Respuesta:
200
403
400
</pre>
<br>
<h1>Obtener todos los doctor<h1><br>
/v1/api/doctor<br>
Metodo GET<br>
En el header  enviar  el token  
<pre>
{
	"lastName":"Carlos Arturo",
	"firstName":"Gonzalez Alvarez",
	"birthdate":"1918-10-04",
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":"",
	"fk_id_user_doctor":38
}
Respuesta:
200
403
400
</pre>
<br>
<br>
<h1>Actualizar doctor<h1><br>
/v1/api/doctor/id<br>
Metodo PUT<br>
<h1>Formato  de entrada json<h1><br>
En el header  enviar  el token  
<pre>
{
	"lastName":"Carlos Arturo",
	"firstName":"Gonzalez Alvarez",
	"birthdate":"1918-10-04",
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":"",
	"fk_id_user_doctor":38
}
Respuesta:
200
403
400
</pre>
<br>
Salida el objetos con las modificaciones
<pre>
{
	"lastName":"Carlos Arturo",
	"firstName":"Gonzalez Alvarez",
	"birthdate":"1918-10-04",
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":"",
	"fk_id_user_doctor":38
}

</pre>
<br>
<h1>Eliminar doctor<h1><br>
/v1/api/doctor/id<br>
Metodo DELETE<br>
En el header  enviar  el token  
<pre>
Respuesta:
200
403
400
</pre>
<br>
#OWNER<br>
<h1>Ingresar  owner<h1><br>
/v1/api/owner<br>
Metodo POST<br>
<h4>Formato  de entrada json</h4><br>
En el header  enviar  el token  
<pre>
{
	"dni":"94552559",
	"lastName":"Carlos Arturo",
	"firstName":"Gonzalez Alvarez",
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":""
	
}
Respuesta:
200
403
400
</pre>
<br>
<h1>Listar  todos los   owner<h1><br>
/v1/api/owner<br>
Metodo GET<br>
En el header  enviar  el token  
<pre>
[
  
  {
    "id": 61,
    "dni": "94552559",
    "lastName": "Carlos Arturo",
    "firstName": "Gonzalez Alvarez",
    "createBy": "Carlos Arturo  Gonzales",
    "createDt": "2019-08-09",
    "updateBy": "",
    "updateDt": ""
  },
  {
    "id": 62,
    "dni": "94552559",
    "lastName": "Carlos Arturo",
    "firstName": "Gonzalez Alvarez",
    "createBy": "Carlos Arturo  Gonzales",
    "createDt": "2019-08-09",
    "updateBy": "",
    "updateDt": ""
  }
]
Respuesta:
200
403
400
</pre>
<br>
<h1>Actulizar  un  owner<h1><br>
/v1/api/owner/id<br>
Metodo PUT<br>
<h4>Formato  de entrada json</h4><br>
<h4>En el header  enviar  el token<h4>
<pre>
{
	"dni":"94552559",
	"lastName":"Carlos Arturo",
	"firstName":"Gonzalez Alvarez",
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":""
	
}
Respuesta:
200
403
400
</pre>
<br>
<h4>Salida el objetos con las modificaciones</h4>
<pre>
{
	"lastName":"Carlos Arturo",
	"firstName":"Gonzalez Alvarez",
	"birthdate":"1918-10-04",
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":"",
	"fk_id_user_doctor":38
}

</pre>
<br>
<h1>Eliminar owner<h1><br>
/v1/api/owner/id<br>
Metodo DELETE<br>
En el header  enviar  el token  
<pre>
Respuesta:
200
403
400
</pre>
<br>
#MASCOT
<h1>Ingresar  mascot<h1><br>
/v1/api/mascot<br>
Metodo POST<br>
<h4>Formato  de entrada json</h4><br>
En el header  enviar  el token  
<pre>
{
	"nameMascot":"firulais",
	"breedMascot":"criolla",
	"sortMascot":"perro",
	"mascotWeight": 40,
	"ageMascot":10,
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":"",
	"fk_id_owner_mascot":59 
	
}
Respuesta:
200
403
400
</pre>
<br>
<h1>Listar  todas   mascot<h1><br>
/v1/api/mascot<br>
Metodo GET<br>
En el header  enviar  el token  
<pre>
  {
    "id": 72,
    "nameMascot": "firulais",
    "breedMascot": "criolla",
    "sortMascot": "perro",
    "mascotWeight": 40,
    "ageMascot": "10",
    "createBy": "Carlos Arturo  Gonzales",
    "createDt": "2019-08-09",
    "updateBy": "",
    "updateDt": "",
    "ownerEntity": {
      "id": 59,
      "dni": "94552559",
      "lastName": "Marta cesilia",
      "firstName": "Gonzalez Alvarez",
      "createBy": "Carlos Arturo  Gonzales",
      "createDt": "2019-08-09",
      "updateBy": "",
      "updateDt": ""
    }
  },
  {
    "id": 73,
    "nameMascot": "firulais",
    "breedMascot": "criolla",
    "sortMascot": "perro",
    "mascotWeight": 40,
    "ageMascot": "10",
    "createBy": "Carlos Arturo  Gonzales",
    "createDt": "2019-08-09",
    "updateBy": "",
    "updateDt": "",
    "ownerEntity": {
      "id": 59,
      "dni": "94552559",
      "lastName": "Marta cesilia",
      "firstName": "Gonzalez Alvarez",
      "createBy": "Carlos Arturo  Gonzales",
      "createDt": "2019-08-09",
      "updateBy": "",
      "updateDt": ""
    }
  }
  
]
Respuesta:
200
403
400
</pre>
<br>
<h1>Actulizar  un  mascot<h1><br>
/v1/api/mascot/id<br>
Metodo PUT<br>
<h4>Formato  de entrada json</h4><br>
<h4>En el header  enviar  el token<h4>
<pre>
{
	"nameMascot":"MONARCA",
	"breedMascot":"Chiguagua",
	"sortMascot":"perro",
	"mascotWeight": 40,
	"ageMascot":10,
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":"",
	"fk_id_owner_mascot":59 
	
}
Respuesta:
200
403
400
</pre>
<br>
<h4>Salida el objetos con las modificaciones</h4>
<pre>
{
	"nameMascot":"MONARCA",
	"breedMascot":"Chiguagua",
	"sortMascot":"perro",
	"mascotWeight": 40,
	"ageMascot":10,
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":"",
	"fk_id_owner_mascot":59 
	
}
</pre>
<br>
<h1>Eliminar mascot<h1><br>
/v1/api/mascot/id<br>
Metodo DELETE<br>
En el header  enviar  el token  
<pre>
Respuesta:
200
403
400
</pre>
<br>
#HISTORY MEDICAL
<h1>Ingresar  history  medical<h1><br>
/v1/api/history-medical<br>
Metodo POST<br>
<h4>Formato  de entrada json</h4><br>
En el header  enviar  el token  
<pre>
{
	"time":"09:30:10",
	"date":"2019-10-10",
	"observations":"vacuanacion anti  rabia",
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":"",
	"fk_id_doctor_hm":46,
	"fk_id_mascot_hm":69

}
Respuesta:
201
403
400
</pre>
<br>
<h1>Listar las  history  medical<h1><br>
/v1/api/history-medical<br>
Metodo GET<br>
En el header  enviar  el token  
<pre>
[
  
  {
    "id": 76,
    "time": "09:30:10",
    "date": "2019-10-10",
    "observations": "vacuanacion anti  rabia",
    "createBy": "Carlos Arturo  Gonzales",
    "createDt": "2019-08-09",
    "updateBy": "",
    "updateDt": "",
    "doctorEntity": {
      "id": 46,
      "lastName": "Catalina Alvarez",
      "firstName": "Gonzalez Alvarez",
      "birthdate": "1918-10-04",
      "createBy": "Carlos Arturo  Gonzales",
      "createDt": "2019-08-09",
      "updateDt": null,
      "userEntity": null
    },
    "mascotEntity": {
      "id": 69,
      "nameMascot": "firulais",
      "breedMascot": "criolla",
      "sortMascot": "perro",
      "mascotWeight": 40,
      "ageMascot": "10",
      "createBy": "Carlos Arturo  Gonzales",
      "createDt": "2019-08-09",
      "updateBy": "",
      "updateDt": "",
      "ownerEntity": {
        "id": 59,
        "dni": "94552559",
        "lastName": "Marta cesilia",
        "firstName": "Gonzalez Alvarez",
        "createBy": "Carlos Arturo  Gonzales",
        "createDt": "2019-08-09",
        "updateBy": "",
        "updateDt": ""
      }
    }
  },
  {
    "id": 74,
    "time": "09:30:10",
    "date": "2019-10-10",
    "observations": "vacunacion anti  rabia",
    "createBy": "Carlos Arturo  Gonzales",
    "createDt": "2019-08-09",
    "updateBy": "",
    "updateDt": "",
    "doctorEntity": null,
    "mascotEntity": null
  }
]
Respuesta:
200
403
400
</pre>
<br>
<h1>Listar las  history  medical<h1><br>
/v1/api/history-medical/id<br>
Metodo PUT<br>
<h4>Formato  de entrada json</h4><br>
<h4>En el header  enviar  el token<h4>
<pre>
{
	"nameMascot":"MONARCA",
	"breedMascot":"Chiguagua",
	"sortMascot":"perro",
	"mascotWeight": 40,
	"ageMascot":10,
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":"",
	"fk_id_owner_mascot":59 
	
}
Respuesta:
200
403
400
</pre>
<br>
<h4>Salida el objetos con las modificaciones</h4>
<pre>
{
	"nameMascot":"MONARCA",
	"breedMascot":"Chiguagua",
	"sortMascot":"perro",
	"mascotWeight": 40,
	"ageMascot":10,
	"createBy":"Carlos Arturo  Gonzales",
	"createDt":"2019-08-09",
	"updateBy":"",
	"updateDt":"",
	"fk_id_owner_mascot":59 
	
}
</pre>
<br>
<h1>Listar las  history  medical<h1><br>
/v1/api/history-medical/id<br>
Metodo DELETE<br>
En el header  enviar  el token  
<pre>
Respuesta:
200
403
400
</pre>
<br>

