/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package car.services;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author DELL
 */
@WebService(serviceName = "CarShareWS")
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
