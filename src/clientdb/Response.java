/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientdb;

/**
 *
 * @author Jorke11
 */
public class Response {

    public String number;
    public String property;
    public double value;

    public Response() {

    }

    public Response(String number, String property, double value) {
        this.number = number;
        this.property = property;
        this.value = value;
    }
    
    

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
