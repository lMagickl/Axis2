/**
 * CalculatorServiceRemoteExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package service;

public class CalculatorServiceRemoteExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1560327714590L;
    private service.CalculatorServiceStub.CalculatorServiceRemoteException faultMessage;

    public CalculatorServiceRemoteExceptionException() {
        super("CalculatorServiceRemoteExceptionException");
    }

    public CalculatorServiceRemoteExceptionException(java.lang.String s) {
        super(s);
    }

    public CalculatorServiceRemoteExceptionException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public CalculatorServiceRemoteExceptionException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        service.CalculatorServiceStub.CalculatorServiceRemoteException msg) {
        faultMessage = msg;
    }

    public service.CalculatorServiceStub.CalculatorServiceRemoteException getFaultMessage() {
        return faultMessage;
    }
}
