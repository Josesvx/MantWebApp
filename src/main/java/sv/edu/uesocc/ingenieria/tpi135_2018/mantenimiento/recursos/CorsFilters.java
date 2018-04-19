/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

/**
 *
 * @author jose
 */
public class CorsFilters  implements ContainerResponseFilter{

    @Override
    public void filter(ContainerRequestContext crc, ContainerResponseContext crc1) throws IOException {
        crc1.getHeaders().add("Access-Control-Allow-Origin", "*");
        crc1.getHeaders().add("Access-Control-Allow-Credentials", "true");
        crc1.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
        crc1.getHeaders().add("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE, HEAD");

    }
    }
    
