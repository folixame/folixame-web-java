
package me.folixa.ws.users;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the me.folixa.ws.users package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Security_QNAME = new QName("http://schemas.xmlsoap.org/ws/2002/04/secext", "Security");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: me.folixa.ws.users
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link SignUp }
     * 
     */
    public SignUp createSignUp() {
        return new SignUp();
    }

    /**
     * Create an instance of {@link AddFavouriteResponse }
     * 
     */
    public AddFavouriteResponse createAddFavouriteResponse() {
        return new AddFavouriteResponse();
    }

    /**
     * Create an instance of {@link GetProfiles }
     * 
     */
    public GetProfiles createGetProfiles() {
        return new GetProfiles();
    }

    /**
     * Create an instance of {@link GetUserId }
     * 
     */
    public GetUserId createGetUserId() {
        return new GetUserId();
    }

    /**
     * Create an instance of {@link GetUserPermission }
     * 
     */
    public GetUserPermission createGetUserPermission() {
        return new GetUserPermission();
    }

    /**
     * Create an instance of {@link LogIn }
     * 
     */
    public LogIn createLogIn() {
        return new LogIn();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link GetProfileResponse }
     * 
     */
    public GetProfileResponse createGetProfileResponse() {
        return new GetProfileResponse();
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

    /**
     * Create an instance of {@link GetFavourites }
     * 
     */
    public GetFavourites createGetFavourites() {
        return new GetFavourites();
    }

    /**
     * Create an instance of {@link LogInResponse }
     * 
     */
    public LogInResponse createLogInResponse() {
        return new LogInResponse();
    }

    /**
     * Create an instance of {@link AddFavourite }
     * 
     */
    public AddFavourite createAddFavourite() {
        return new AddFavourite();
    }

    /**
     * Create an instance of {@link SignUpResponse }
     * 
     */
    public SignUpResponse createSignUpResponse() {
        return new SignUpResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetProfilesResponse }
     * 
     */
    public GetProfilesResponse createGetProfilesResponse() {
        return new GetProfilesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProfile }
     * 
     */
    public ArrayOfProfile createArrayOfProfile() {
        return new ArrayOfProfile();
    }

    /**
     * Create an instance of {@link GetFavouritesResponse }
     * 
     */
    public GetFavouritesResponse createGetFavouritesResponse() {
        return new GetFavouritesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFavourite }
     * 
     */
    public ArrayOfFavourite createArrayOfFavourite() {
        return new ArrayOfFavourite();
    }

    /**
     * Create an instance of {@link GetUserIdResponse }
     * 
     */
    public GetUserIdResponse createGetUserIdResponse() {
        return new GetUserIdResponse();
    }

    /**
     * Create an instance of {@link GetProfile }
     * 
     */
    public GetProfile createGetProfile() {
        return new GetProfile();
    }

    /**
     * Create an instance of {@link GetUserPermissionResponse }
     * 
     */
    public GetUserPermissionResponse createGetUserPermissionResponse() {
        return new GetUserPermissionResponse();
    }

    /**
     * Create an instance of {@link Favourite }
     * 
     */
    public Favourite createFavourite() {
        return new Favourite();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Security }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2002/04/secext", name = "Security")
    public JAXBElement<Security> createSecurity(Security value) {
        return new JAXBElement<Security>(_Security_QNAME, Security.class, null, value);
    }

}
