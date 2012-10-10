/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package car.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "CarShare")
@Stateless()
public class CarShare {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllReservation")
    public String getAllReservation() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMemberReservation")
    public String getMemberReservation() {
        //TODO write your implementation code here:
        return null;
    }
}
