package HelloApp;


/**
* HelloApp/HelloPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* 2014년 4월 14일 월요일 오전 2시 04분 00초 KST
*/

public class HelloPOATie extends HelloPOA
{

  // Constructors

  public HelloPOATie ( HelloApp.HelloOperations delegate ) {
      this._impl = delegate;
  }
  public HelloPOATie ( HelloApp.HelloOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public HelloApp.HelloOperations _delegate() {
      return this._impl;
  }
  public void _delegate (HelloApp.HelloOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public String sayHello ()
  {
    return _impl.sayHello();
  } // sayHello

  public void shutdown ()
  {
    _impl.shutdown();
  } // shutdown

  private HelloApp.HelloOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class HelloPOATie
