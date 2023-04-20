/**
 * StringImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sk;

public class StringImplServiceLocator extends org.apache.axis.client.Service implements com.sk.StringImplService {

    public StringImplServiceLocator() {
    }


    public StringImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StringImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StringImpl
    private java.lang.String StringImpl_address = "http://localhost:8080/SOAPSk/services/StringImpl";

    public java.lang.String getStringImplAddress() {
        return StringImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StringImplWSDDServiceName = "StringImpl";

    public java.lang.String getStringImplWSDDServiceName() {
        return StringImplWSDDServiceName;
    }

    public void setStringImplWSDDServiceName(java.lang.String name) {
        StringImplWSDDServiceName = name;
    }

    public com.sk.StringImpl getStringImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StringImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStringImpl(endpoint);
    }

    public com.sk.StringImpl getStringImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sk.StringImplSoapBindingStub _stub = new com.sk.StringImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getStringImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStringImplEndpointAddress(java.lang.String address) {
        StringImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sk.StringImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sk.StringImplSoapBindingStub _stub = new com.sk.StringImplSoapBindingStub(new java.net.URL(StringImpl_address), this);
                _stub.setPortName(getStringImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StringImpl".equals(inputPortName)) {
            return getStringImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sk.com", "StringImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sk.com", "StringImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StringImpl".equals(portName)) {
            setStringImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
