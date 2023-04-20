package com.sk;

public class StringImplProxy implements com.sk.StringImpl {
  private String _endpoint = null;
  private com.sk.StringImpl stringImpl = null;
  
  public StringImplProxy() {
    _initStringImplProxy();
  }
  
  public StringImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initStringImplProxy();
  }
  
  private void _initStringImplProxy() {
    try {
      stringImpl = (new com.sk.StringImplServiceLocator()).getStringImpl();
      if (stringImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stringImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stringImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stringImpl != null)
      ((javax.xml.rpc.Stub)stringImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sk.StringImpl getStringImpl() {
    if (stringImpl == null)
      _initStringImplProxy();
    return stringImpl;
  }
  
  public java.lang.String removeFirst(java.lang.String str) throws java.rmi.RemoteException{
    if (stringImpl == null)
      _initStringImplProxy();
    return stringImpl.removeFirst(str);
  }
  
  public java.lang.String removeLast(java.lang.String str) throws java.rmi.RemoteException{
    if (stringImpl == null)
      _initStringImplProxy();
    return stringImpl.removeLast(str);
  }
  
  
}