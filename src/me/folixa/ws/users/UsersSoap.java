
package me.folixa.ws.users;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UsersSoap", targetNamespace = "http://folixa.me/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UsersSoap {


    /**
     * 
     * @param password
     * @param email
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SignUp", action = "http://folixa.me/SignUp")
    @WebResult(name = "SignUpResult", targetNamespace = "http://folixa.me/")
    @RequestWrapper(localName = "SignUp", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.SignUp")
    @ResponseWrapper(localName = "SignUpResponse", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.SignUpResponse")
    public String signUp(
        @WebParam(name = "email", targetNamespace = "http://folixa.me/")
        String email,
        @WebParam(name = "password", targetNamespace = "http://folixa.me/")
        String password);

    /**
     * 
     * @param security
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "LogIn", action = "http://folixa.me/LogIn")
    @WebResult(name = "LogInResult", targetNamespace = "http://folixa.me/")
    @RequestWrapper(localName = "LogIn", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.LogIn")
    @ResponseWrapper(localName = "LogInResponse", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.LogInResponse")
    public String logIn(
        @WebParam(name = "Security", targetNamespace = "http://schemas.xmlsoap.org/ws/2002/04/secext", header = true, partName = "Security")
        Security security);

    /**
     * 
     * @param security
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Delete", action = "http://folixa.me/Delete")
    @WebResult(name = "DeleteResult", targetNamespace = "http://folixa.me/")
    @RequestWrapper(localName = "Delete", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.Delete")
    @ResponseWrapper(localName = "DeleteResponse", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.DeleteResponse")
    public String delete(
        @WebParam(name = "Security", targetNamespace = "http://schemas.xmlsoap.org/ws/2002/04/secext", header = true, partName = "Security")
        Security security);

    /**
     * 
     * @param security
     * @param inputEmail
     * @param inputPassword
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Update", action = "http://folixa.me/Update")
    @WebResult(name = "UpdateResult", targetNamespace = "http://folixa.me/")
    @RequestWrapper(localName = "Update", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.Update")
    @ResponseWrapper(localName = "UpdateResponse", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.UpdateResponse")
    public String update(
        @WebParam(name = "inputEmail", targetNamespace = "http://folixa.me/")
        String inputEmail,
        @WebParam(name = "inputPassword", targetNamespace = "http://folixa.me/")
        String inputPassword,
        @WebParam(name = "Security", targetNamespace = "http://schemas.xmlsoap.org/ws/2002/04/secext", header = true, partName = "Security")
        Security security);

    /**
     * 
     * @return
     *     returns me.folixa.ws.users.ArrayOfProfile
     */
    @WebMethod(operationName = "GetProfiles", action = "http://folixa.me/GetProfiles")
    @WebResult(name = "GetProfilesResult", targetNamespace = "http://folixa.me/")
    @RequestWrapper(localName = "GetProfiles", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.GetProfiles")
    @ResponseWrapper(localName = "GetProfilesResponse", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.GetProfilesResponse")
    public ArrayOfProfile getProfiles();

    /**
     * 
     * @param email
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetUserPermission", action = "http://folixa.me/GetUserPermission")
    @WebResult(name = "GetUserPermissionResult", targetNamespace = "http://folixa.me/")
    @RequestWrapper(localName = "GetUserPermission", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.GetUserPermission")
    @ResponseWrapper(localName = "GetUserPermissionResponse", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.GetUserPermissionResponse")
    public String getUserPermission(
        @WebParam(name = "email", targetNamespace = "http://folixa.me/")
        String email);

    /**
     * 
     * @param email
     * @return
     *     returns me.folixa.ws.users.Profile
     */
    @WebMethod(operationName = "GetProfile", action = "http://folixa.me/GetProfile")
    @WebResult(name = "GetProfileResult", targetNamespace = "http://folixa.me/")
    @RequestWrapper(localName = "GetProfile", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.GetProfile")
    @ResponseWrapper(localName = "GetProfileResponse", targetNamespace = "http://folixa.me/", className = "me.folixa.ws.users.GetProfileResponse")
    public Profile getProfile(
        @WebParam(name = "email", targetNamespace = "http://folixa.me/")
        String email);

}