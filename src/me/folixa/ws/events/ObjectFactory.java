
package me.folixa.ws.events;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the me.folixa.ws.events package. 
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

    private final static QName _CreateImageResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "createImageResponse");
    private final static QName _ReadEventsBetweenDates_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventsBetweenDates");
    private final static QName _UpdateEventById_QNAME = new QName("http://webservices.events.folixame.ws/", "updateEventById");
    private final static QName _CreateEventResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "createEventResponse");
    private final static QName _DatabaseException_QNAME = new QName("http://webservices.events.folixame.ws/", "DatabaseException");
    private final static QName _ReadImagesByEventIdResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "readImagesByEventIdResponse");
    private final static QName _ReadEventsForUsers_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventsForUsers");
    private final static QName _ReadEventsAdvancedSearch_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventsAdvancedSearch");
    private final static QName _CreateCategoryResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "createCategoryResponse");
    private final static QName _ReadAllCategories_QNAME = new QName("http://webservices.events.folixame.ws/", "readAllCategories");
    private final static QName _CreateImage_QNAME = new QName("http://webservices.events.folixame.ws/", "createImage");
    private final static QName _ReadEventsBetweenDatesResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventsBetweenDatesResponse");
    private final static QName _DeleteImagesByIdResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "deleteImagesByIdResponse");
    private final static QName _UpdateCategoryById_QNAME = new QName("http://webservices.events.folixame.ws/", "updateCategoryById");
    private final static QName _ReadEventsByPlace_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventsByPlace");
    private final static QName _ReadImagesByEventId_QNAME = new QName("http://webservices.events.folixame.ws/", "readImagesByEventId");
    private final static QName _ReadEventsForAdministrator_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventsForAdministrator");
    private final static QName _DeleteEventByIdResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "deleteEventByIdResponse");
    private final static QName _DeleteImagesById_QNAME = new QName("http://webservices.events.folixame.ws/", "deleteImagesById");
    private final static QName _ReadEventsByCategory_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventsByCategory");
    private final static QName _ReadEventsForUsersResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventsForUsersResponse");
    private final static QName _DeleteEventById_QNAME = new QName("http://webservices.events.folixame.ws/", "deleteEventById");
    private final static QName _ReadEventsByCategoryResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventsByCategoryResponse");
    private final static QName _UpdateImageByEventId_QNAME = new QName("http://webservices.events.folixame.ws/", "updateImageByEventId");
    private final static QName _DeleteImagesByEventIdResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "deleteImagesByEventIdResponse");
    private final static QName _DeleteCategoryByIdResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "deleteCategoryByIdResponse");
    private final static QName _ReadAllCategoriesResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "readAllCategoriesResponse");
    private final static QName _ReadEventByIdResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventByIdResponse");
    private final static QName _ReadEventsAdvancedSearchResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventsAdvancedSearchResponse");
    private final static QName _DeleteImagesByEventId_QNAME = new QName("http://webservices.events.folixame.ws/", "deleteImagesByEventId");
    private final static QName _UploadImageResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "uploadImageResponse");
    private final static QName _ReadEventsForAdministratorResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventsForAdministratorResponse");
    private final static QName _UploadImage_QNAME = new QName("http://webservices.events.folixame.ws/", "uploadImage");
    private final static QName _CreateCategory_QNAME = new QName("http://webservices.events.folixame.ws/", "createCategory");
    private final static QName _CreateEvent_QNAME = new QName("http://webservices.events.folixame.ws/", "createEvent");
    private final static QName _ReadEventById_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventById");
    private final static QName _UpdateCategoryByIdResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "updateCategoryByIdResponse");
    private final static QName _UpdateImageByEventIdResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "updateImageByEventIdResponse");
    private final static QName _UpdateEventByIdResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "updateEventByIdResponse");
    private final static QName _DeleteCategoryById_QNAME = new QName("http://webservices.events.folixame.ws/", "deleteCategoryById");
    private final static QName _ReadEventsByPlaceResponse_QNAME = new QName("http://webservices.events.folixame.ws/", "readEventsByPlaceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: me.folixa.ws.events
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateEventByIdResponse }
     * 
     */
    public UpdateEventByIdResponse createUpdateEventByIdResponse() {
        return new UpdateEventByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateCategoryByIdResponse }
     * 
     */
    public UpdateCategoryByIdResponse createUpdateCategoryByIdResponse() {
        return new UpdateCategoryByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateImageByEventIdResponse }
     * 
     */
    public UpdateImageByEventIdResponse createUpdateImageByEventIdResponse() {
        return new UpdateImageByEventIdResponse();
    }

    /**
     * Create an instance of {@link ReadEventById }
     * 
     */
    public ReadEventById createReadEventById() {
        return new ReadEventById();
    }

    /**
     * Create an instance of {@link ReadEventsByPlaceResponse }
     * 
     */
    public ReadEventsByPlaceResponse createReadEventsByPlaceResponse() {
        return new ReadEventsByPlaceResponse();
    }

    /**
     * Create an instance of {@link DeleteCategoryById }
     * 
     */
    public DeleteCategoryById createDeleteCategoryById() {
        return new DeleteCategoryById();
    }

    /**
     * Create an instance of {@link ReadAllCategoriesResponse }
     * 
     */
    public ReadAllCategoriesResponse createReadAllCategoriesResponse() {
        return new ReadAllCategoriesResponse();
    }

    /**
     * Create an instance of {@link ReadEventByIdResponse }
     * 
     */
    public ReadEventByIdResponse createReadEventByIdResponse() {
        return new ReadEventByIdResponse();
    }

    /**
     * Create an instance of {@link ReadEventsAdvancedSearchResponse }
     * 
     */
    public ReadEventsAdvancedSearchResponse createReadEventsAdvancedSearchResponse() {
        return new ReadEventsAdvancedSearchResponse();
    }

    /**
     * Create an instance of {@link DeleteCategoryByIdResponse }
     * 
     */
    public DeleteCategoryByIdResponse createDeleteCategoryByIdResponse() {
        return new DeleteCategoryByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteImagesByEventIdResponse }
     * 
     */
    public DeleteImagesByEventIdResponse createDeleteImagesByEventIdResponse() {
        return new DeleteImagesByEventIdResponse();
    }

    /**
     * Create an instance of {@link UpdateImageByEventId }
     * 
     */
    public UpdateImageByEventId createUpdateImageByEventId() {
        return new UpdateImageByEventId();
    }

    /**
     * Create an instance of {@link DeleteEventById }
     * 
     */
    public DeleteEventById createDeleteEventById() {
        return new DeleteEventById();
    }

    /**
     * Create an instance of {@link ReadEventsByCategoryResponse }
     * 
     */
    public ReadEventsByCategoryResponse createReadEventsByCategoryResponse() {
        return new ReadEventsByCategoryResponse();
    }

    /**
     * Create an instance of {@link CreateEvent }
     * 
     */
    public CreateEvent createCreateEvent() {
        return new CreateEvent();
    }

    /**
     * Create an instance of {@link CreateCategory }
     * 
     */
    public CreateCategory createCreateCategory() {
        return new CreateCategory();
    }

    /**
     * Create an instance of {@link UploadImage }
     * 
     */
    public UploadImage createUploadImage() {
        return new UploadImage();
    }

    /**
     * Create an instance of {@link ReadEventsForAdministratorResponse }
     * 
     */
    public ReadEventsForAdministratorResponse createReadEventsForAdministratorResponse() {
        return new ReadEventsForAdministratorResponse();
    }

    /**
     * Create an instance of {@link UploadImageResponse }
     * 
     */
    public UploadImageResponse createUploadImageResponse() {
        return new UploadImageResponse();
    }

    /**
     * Create an instance of {@link DeleteImagesByEventId }
     * 
     */
    public DeleteImagesByEventId createDeleteImagesByEventId() {
        return new DeleteImagesByEventId();
    }

    /**
     * Create an instance of {@link ReadEventsBetweenDatesResponse }
     * 
     */
    public ReadEventsBetweenDatesResponse createReadEventsBetweenDatesResponse() {
        return new ReadEventsBetweenDatesResponse();
    }

    /**
     * Create an instance of {@link CreateImage }
     * 
     */
    public CreateImage createCreateImage() {
        return new CreateImage();
    }

    /**
     * Create an instance of {@link CreateCategoryResponse }
     * 
     */
    public CreateCategoryResponse createCreateCategoryResponse() {
        return new CreateCategoryResponse();
    }

    /**
     * Create an instance of {@link ReadAllCategories }
     * 
     */
    public ReadAllCategories createReadAllCategories() {
        return new ReadAllCategories();
    }

    /**
     * Create an instance of {@link ReadEventsAdvancedSearch }
     * 
     */
    public ReadEventsAdvancedSearch createReadEventsAdvancedSearch() {
        return new ReadEventsAdvancedSearch();
    }

    /**
     * Create an instance of {@link DeleteEventByIdResponse }
     * 
     */
    public DeleteEventByIdResponse createDeleteEventByIdResponse() {
        return new DeleteEventByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteImagesById }
     * 
     */
    public DeleteImagesById createDeleteImagesById() {
        return new DeleteImagesById();
    }

    /**
     * Create an instance of {@link ReadEventsByCategory }
     * 
     */
    public ReadEventsByCategory createReadEventsByCategory() {
        return new ReadEventsByCategory();
    }

    /**
     * Create an instance of {@link ReadEventsForUsersResponse }
     * 
     */
    public ReadEventsForUsersResponse createReadEventsForUsersResponse() {
        return new ReadEventsForUsersResponse();
    }

    /**
     * Create an instance of {@link ReadEventsForAdministrator }
     * 
     */
    public ReadEventsForAdministrator createReadEventsForAdministrator() {
        return new ReadEventsForAdministrator();
    }

    /**
     * Create an instance of {@link ReadImagesByEventId }
     * 
     */
    public ReadImagesByEventId createReadImagesByEventId() {
        return new ReadImagesByEventId();
    }

    /**
     * Create an instance of {@link ReadEventsByPlace }
     * 
     */
    public ReadEventsByPlace createReadEventsByPlace() {
        return new ReadEventsByPlace();
    }

    /**
     * Create an instance of {@link DeleteImagesByIdResponse }
     * 
     */
    public DeleteImagesByIdResponse createDeleteImagesByIdResponse() {
        return new DeleteImagesByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateCategoryById }
     * 
     */
    public UpdateCategoryById createUpdateCategoryById() {
        return new UpdateCategoryById();
    }

    /**
     * Create an instance of {@link UpdateEventById }
     * 
     */
    public UpdateEventById createUpdateEventById() {
        return new UpdateEventById();
    }

    /**
     * Create an instance of {@link ReadEventsBetweenDates }
     * 
     */
    public ReadEventsBetweenDates createReadEventsBetweenDates() {
        return new ReadEventsBetweenDates();
    }

    /**
     * Create an instance of {@link CreateImageResponse }
     * 
     */
    public CreateImageResponse createCreateImageResponse() {
        return new CreateImageResponse();
    }

    /**
     * Create an instance of {@link ReadEventsForUsers }
     * 
     */
    public ReadEventsForUsers createReadEventsForUsers() {
        return new ReadEventsForUsers();
    }

    /**
     * Create an instance of {@link ReadImagesByEventIdResponse }
     * 
     */
    public ReadImagesByEventIdResponse createReadImagesByEventIdResponse() {
        return new ReadImagesByEventIdResponse();
    }

    /**
     * Create an instance of {@link DatabaseException }
     * 
     */
    public DatabaseException createDatabaseException() {
        return new DatabaseException();
    }

    /**
     * Create an instance of {@link CreateEventResponse }
     * 
     */
    public CreateEventResponse createCreateEventResponse() {
        return new CreateEventResponse();
    }

    /**
     * Create an instance of {@link EventsCategories }
     * 
     */
    public EventsCategories createEventsCategories() {
        return new EventsCategories();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "createImageResponse")
    public JAXBElement<CreateImageResponse> createCreateImageResponse(CreateImageResponse value) {
        return new JAXBElement<CreateImageResponse>(_CreateImageResponse_QNAME, CreateImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventsBetweenDates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventsBetweenDates")
    public JAXBElement<ReadEventsBetweenDates> createReadEventsBetweenDates(ReadEventsBetweenDates value) {
        return new JAXBElement<ReadEventsBetweenDates>(_ReadEventsBetweenDates_QNAME, ReadEventsBetweenDates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEventById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "updateEventById")
    public JAXBElement<UpdateEventById> createUpdateEventById(UpdateEventById value) {
        return new JAXBElement<UpdateEventById>(_UpdateEventById_QNAME, UpdateEventById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "createEventResponse")
    public JAXBElement<CreateEventResponse> createCreateEventResponse(CreateEventResponse value) {
        return new JAXBElement<CreateEventResponse>(_CreateEventResponse_QNAME, CreateEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "DatabaseException")
    public JAXBElement<DatabaseException> createDatabaseException(DatabaseException value) {
        return new JAXBElement<DatabaseException>(_DatabaseException_QNAME, DatabaseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadImagesByEventIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readImagesByEventIdResponse")
    public JAXBElement<ReadImagesByEventIdResponse> createReadImagesByEventIdResponse(ReadImagesByEventIdResponse value) {
        return new JAXBElement<ReadImagesByEventIdResponse>(_ReadImagesByEventIdResponse_QNAME, ReadImagesByEventIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventsForUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventsForUsers")
    public JAXBElement<ReadEventsForUsers> createReadEventsForUsers(ReadEventsForUsers value) {
        return new JAXBElement<ReadEventsForUsers>(_ReadEventsForUsers_QNAME, ReadEventsForUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventsAdvancedSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventsAdvancedSearch")
    public JAXBElement<ReadEventsAdvancedSearch> createReadEventsAdvancedSearch(ReadEventsAdvancedSearch value) {
        return new JAXBElement<ReadEventsAdvancedSearch>(_ReadEventsAdvancedSearch_QNAME, ReadEventsAdvancedSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "createCategoryResponse")
    public JAXBElement<CreateCategoryResponse> createCreateCategoryResponse(CreateCategoryResponse value) {
        return new JAXBElement<CreateCategoryResponse>(_CreateCategoryResponse_QNAME, CreateCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readAllCategories")
    public JAXBElement<ReadAllCategories> createReadAllCategories(ReadAllCategories value) {
        return new JAXBElement<ReadAllCategories>(_ReadAllCategories_QNAME, ReadAllCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "createImage")
    public JAXBElement<CreateImage> createCreateImage(CreateImage value) {
        return new JAXBElement<CreateImage>(_CreateImage_QNAME, CreateImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventsBetweenDatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventsBetweenDatesResponse")
    public JAXBElement<ReadEventsBetweenDatesResponse> createReadEventsBetweenDatesResponse(ReadEventsBetweenDatesResponse value) {
        return new JAXBElement<ReadEventsBetweenDatesResponse>(_ReadEventsBetweenDatesResponse_QNAME, ReadEventsBetweenDatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteImagesByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "deleteImagesByIdResponse")
    public JAXBElement<DeleteImagesByIdResponse> createDeleteImagesByIdResponse(DeleteImagesByIdResponse value) {
        return new JAXBElement<DeleteImagesByIdResponse>(_DeleteImagesByIdResponse_QNAME, DeleteImagesByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCategoryById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "updateCategoryById")
    public JAXBElement<UpdateCategoryById> createUpdateCategoryById(UpdateCategoryById value) {
        return new JAXBElement<UpdateCategoryById>(_UpdateCategoryById_QNAME, UpdateCategoryById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventsByPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventsByPlace")
    public JAXBElement<ReadEventsByPlace> createReadEventsByPlace(ReadEventsByPlace value) {
        return new JAXBElement<ReadEventsByPlace>(_ReadEventsByPlace_QNAME, ReadEventsByPlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadImagesByEventId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readImagesByEventId")
    public JAXBElement<ReadImagesByEventId> createReadImagesByEventId(ReadImagesByEventId value) {
        return new JAXBElement<ReadImagesByEventId>(_ReadImagesByEventId_QNAME, ReadImagesByEventId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventsForAdministrator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventsForAdministrator")
    public JAXBElement<ReadEventsForAdministrator> createReadEventsForAdministrator(ReadEventsForAdministrator value) {
        return new JAXBElement<ReadEventsForAdministrator>(_ReadEventsForAdministrator_QNAME, ReadEventsForAdministrator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEventByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "deleteEventByIdResponse")
    public JAXBElement<DeleteEventByIdResponse> createDeleteEventByIdResponse(DeleteEventByIdResponse value) {
        return new JAXBElement<DeleteEventByIdResponse>(_DeleteEventByIdResponse_QNAME, DeleteEventByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteImagesById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "deleteImagesById")
    public JAXBElement<DeleteImagesById> createDeleteImagesById(DeleteImagesById value) {
        return new JAXBElement<DeleteImagesById>(_DeleteImagesById_QNAME, DeleteImagesById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventsByCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventsByCategory")
    public JAXBElement<ReadEventsByCategory> createReadEventsByCategory(ReadEventsByCategory value) {
        return new JAXBElement<ReadEventsByCategory>(_ReadEventsByCategory_QNAME, ReadEventsByCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventsForUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventsForUsersResponse")
    public JAXBElement<ReadEventsForUsersResponse> createReadEventsForUsersResponse(ReadEventsForUsersResponse value) {
        return new JAXBElement<ReadEventsForUsersResponse>(_ReadEventsForUsersResponse_QNAME, ReadEventsForUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEventById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "deleteEventById")
    public JAXBElement<DeleteEventById> createDeleteEventById(DeleteEventById value) {
        return new JAXBElement<DeleteEventById>(_DeleteEventById_QNAME, DeleteEventById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventsByCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventsByCategoryResponse")
    public JAXBElement<ReadEventsByCategoryResponse> createReadEventsByCategoryResponse(ReadEventsByCategoryResponse value) {
        return new JAXBElement<ReadEventsByCategoryResponse>(_ReadEventsByCategoryResponse_QNAME, ReadEventsByCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateImageByEventId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "updateImageByEventId")
    public JAXBElement<UpdateImageByEventId> createUpdateImageByEventId(UpdateImageByEventId value) {
        return new JAXBElement<UpdateImageByEventId>(_UpdateImageByEventId_QNAME, UpdateImageByEventId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteImagesByEventIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "deleteImagesByEventIdResponse")
    public JAXBElement<DeleteImagesByEventIdResponse> createDeleteImagesByEventIdResponse(DeleteImagesByEventIdResponse value) {
        return new JAXBElement<DeleteImagesByEventIdResponse>(_DeleteImagesByEventIdResponse_QNAME, DeleteImagesByEventIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCategoryByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "deleteCategoryByIdResponse")
    public JAXBElement<DeleteCategoryByIdResponse> createDeleteCategoryByIdResponse(DeleteCategoryByIdResponse value) {
        return new JAXBElement<DeleteCategoryByIdResponse>(_DeleteCategoryByIdResponse_QNAME, DeleteCategoryByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readAllCategoriesResponse")
    public JAXBElement<ReadAllCategoriesResponse> createReadAllCategoriesResponse(ReadAllCategoriesResponse value) {
        return new JAXBElement<ReadAllCategoriesResponse>(_ReadAllCategoriesResponse_QNAME, ReadAllCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventByIdResponse")
    public JAXBElement<ReadEventByIdResponse> createReadEventByIdResponse(ReadEventByIdResponse value) {
        return new JAXBElement<ReadEventByIdResponse>(_ReadEventByIdResponse_QNAME, ReadEventByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventsAdvancedSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventsAdvancedSearchResponse")
    public JAXBElement<ReadEventsAdvancedSearchResponse> createReadEventsAdvancedSearchResponse(ReadEventsAdvancedSearchResponse value) {
        return new JAXBElement<ReadEventsAdvancedSearchResponse>(_ReadEventsAdvancedSearchResponse_QNAME, ReadEventsAdvancedSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteImagesByEventId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "deleteImagesByEventId")
    public JAXBElement<DeleteImagesByEventId> createDeleteImagesByEventId(DeleteImagesByEventId value) {
        return new JAXBElement<DeleteImagesByEventId>(_DeleteImagesByEventId_QNAME, DeleteImagesByEventId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "uploadImageResponse")
    public JAXBElement<UploadImageResponse> createUploadImageResponse(UploadImageResponse value) {
        return new JAXBElement<UploadImageResponse>(_UploadImageResponse_QNAME, UploadImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventsForAdministratorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventsForAdministratorResponse")
    public JAXBElement<ReadEventsForAdministratorResponse> createReadEventsForAdministratorResponse(ReadEventsForAdministratorResponse value) {
        return new JAXBElement<ReadEventsForAdministratorResponse>(_ReadEventsForAdministratorResponse_QNAME, ReadEventsForAdministratorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "uploadImage")
    public JAXBElement<UploadImage> createUploadImage(UploadImage value) {
        return new JAXBElement<UploadImage>(_UploadImage_QNAME, UploadImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "createCategory")
    public JAXBElement<CreateCategory> createCreateCategory(CreateCategory value) {
        return new JAXBElement<CreateCategory>(_CreateCategory_QNAME, CreateCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "createEvent")
    public JAXBElement<CreateEvent> createCreateEvent(CreateEvent value) {
        return new JAXBElement<CreateEvent>(_CreateEvent_QNAME, CreateEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventById")
    public JAXBElement<ReadEventById> createReadEventById(ReadEventById value) {
        return new JAXBElement<ReadEventById>(_ReadEventById_QNAME, ReadEventById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCategoryByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "updateCategoryByIdResponse")
    public JAXBElement<UpdateCategoryByIdResponse> createUpdateCategoryByIdResponse(UpdateCategoryByIdResponse value) {
        return new JAXBElement<UpdateCategoryByIdResponse>(_UpdateCategoryByIdResponse_QNAME, UpdateCategoryByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateImageByEventIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "updateImageByEventIdResponse")
    public JAXBElement<UpdateImageByEventIdResponse> createUpdateImageByEventIdResponse(UpdateImageByEventIdResponse value) {
        return new JAXBElement<UpdateImageByEventIdResponse>(_UpdateImageByEventIdResponse_QNAME, UpdateImageByEventIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEventByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "updateEventByIdResponse")
    public JAXBElement<UpdateEventByIdResponse> createUpdateEventByIdResponse(UpdateEventByIdResponse value) {
        return new JAXBElement<UpdateEventByIdResponse>(_UpdateEventByIdResponse_QNAME, UpdateEventByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCategoryById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "deleteCategoryById")
    public JAXBElement<DeleteCategoryById> createDeleteCategoryById(DeleteCategoryById value) {
        return new JAXBElement<DeleteCategoryById>(_DeleteCategoryById_QNAME, DeleteCategoryById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadEventsByPlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.events.folixame.ws/", name = "readEventsByPlaceResponse")
    public JAXBElement<ReadEventsByPlaceResponse> createReadEventsByPlaceResponse(ReadEventsByPlaceResponse value) {
        return new JAXBElement<ReadEventsByPlaceResponse>(_ReadEventsByPlaceResponse_QNAME, ReadEventsByPlaceResponse.class, null, value);
    }

}
