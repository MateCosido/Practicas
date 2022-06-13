
package com.porfolio.seba.Servicio;

import com.porfolio.seba.DAO.UsuarioDAO;
import com.porfolio.seba.Modelo.Usuario;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("auth")
public class LoginServicio {
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response validar(Usuario usuario){
        
        boolean status = UsuarioDAO.validar(usuario.getUsername(), usuario.getPassword());
        if (status)
        {
            String KEY = "mi_clave";
            long tiempo = System.currentTimeMillis();
            String jwt = Jwts.builder()
                    .signWith(SignatureAlgorithm.HS256, KEY)
                    .setSubject("SebastianLarrosa")
                    .setIssuedAt(new Date(tiempo))
                    .setExpiration(new Date(tiempo+900000))
                    .claim("email", "sebas@sebas.com.ar")
                    .compact();
            
            JsonObject json = Json.createObjectBuilder()
                    .add("JWT", jwt).build();
            return Response.status(Response.Status.CREATED).entity(json).build();            
        }
        return Response.status(Response.Status.UNAUTHORIZED).build();
    }
}