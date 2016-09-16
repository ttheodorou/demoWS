
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _DitBonjourResponse_QNAME = new QName("http://simple.demows.thomas.com/", "ditBonjourResponse");
    private final static QName _DitBonjour_QNAME = new QName("http://simple.demows.thomas.com/", "ditBonjour");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DitBonjourResponse }
     * 
     */
    public DitBonjourResponse createDitBonjourResponse() {
        return new DitBonjourResponse();
    }

    /**
     * Create an instance of {@link DitBonjour }
     * 
     */
    public DitBonjour createDitBonjour() {
        return new DitBonjour();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DitBonjourResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://simple.demows.thomas.com/", name = "ditBonjourResponse")
    public JAXBElement<DitBonjourResponse> createDitBonjourResponse(DitBonjourResponse value) {
        return new JAXBElement<DitBonjourResponse>(_DitBonjourResponse_QNAME, DitBonjourResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DitBonjour }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://simple.demows.thomas.com/", name = "ditBonjour")
    public JAXBElement<DitBonjour> createDitBonjour(DitBonjour value) {
        return new JAXBElement<DitBonjour>(_DitBonjour_QNAME, DitBonjour.class, null, value);
    }

}
