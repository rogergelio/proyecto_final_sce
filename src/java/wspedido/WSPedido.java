/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wspedido;

import fachadas.AbstractFacade;
import fachadas.CategoryFacade;
import fachadas.CustomerFacade;
import fachadas.CustomerOrderFacade;
import fachadas.OrderedProductFacade;
import fachadas.ProductFacade;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author sdist
 */
public class WSPedido {
    
    @EJB
    private ProductFacade productFacade;// Add business logic below. (Right-click in editor and choose
    @EJB
    private OrderedProductFacade orderedProductFacade;
    @EJB
    private CustomerOrderFacade customerOrderFacade;
    @EJB
    private CustomerFacade customerFacade;
    @EJB
    private CategoryFacade categoryFacade; 
    @EJB 
    private AbstractFacade abstractfacade; 

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    
    
}
