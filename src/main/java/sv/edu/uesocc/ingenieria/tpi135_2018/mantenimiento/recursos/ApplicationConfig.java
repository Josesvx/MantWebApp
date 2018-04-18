/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author joker
 */
@javax.ws.rs.ApplicationPath("ws")

public class ApplicationConfig extends Application{
    
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourcesClasses(resources);
        return resources;
    }

    private void addRestResourcesClasses(Set<Class<?>> resources) {
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.DiagnosticoParteResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.DiagnosticoParteResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.DiagnosticoResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.EquipoDetalleResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.EquipoResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.EstadoMantenimientoDetalleResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.EstadoResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.MantenimientoDetalleResources.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.MarcaResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.ModeloResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.OrdenTrabajoResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.ParteResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.PasoResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.PrioridadResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.ProcedimientoResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.ResponsableResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.SolicitudResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.SubTipoMantenimientoResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.TipoMantenimientoResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.TipoParteResource.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.TipoResponsableResorce.class);
       resources.add(sv.edu.uesocc.ingenieria.tpi135_2018.mantenimiento.recursos.UnidadResource.class);
       

              
       
       
       
       
    }
}
