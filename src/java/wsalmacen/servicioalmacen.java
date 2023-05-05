/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsalmacen;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import entidades.Product;
import fachadas.ProductFacade;
import javax.ejb.EJB;
/**
 *
 * @author sdist
 */
@WebService(serviceName = "servicioalmacen")
public class servicioalmacen {
    @EJB
    private ProductFacade productFacade;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "almacen")
    public java.util.List<entidades.Product> almacen() {
        //TODO write your implementation code here:
        return productFacade.findAll();
    }
    
    
}
