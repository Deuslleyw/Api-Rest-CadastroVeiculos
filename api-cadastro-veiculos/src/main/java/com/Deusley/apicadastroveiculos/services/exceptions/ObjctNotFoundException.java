package com.Deusley.apicadastroveiculos.services.exceptions;

public class ObjctNotFoundException extends RuntimeException {

 public ObjctNotFoundException(String msg){
     super(msg);
 }
 public ObjctNotFoundException(String msg, Throwable cause){
     super(msg, cause);

 }


}
