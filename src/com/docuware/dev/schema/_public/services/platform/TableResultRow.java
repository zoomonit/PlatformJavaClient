//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.Document;
import java.io.InputStream;
import com.docuware.dev.schema._public.services.platform.DocumentIndexFields;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.UpdateIndexFieldsInfo;
import com.docuware.dev.schema._public.services.platform.SuggestionFields;
import com.docuware.dev.schema._public.services.platform.IntegerList;
import com.docuware.dev.schema._public.services.platform.Sections;
import com.docuware.dev.schema._public.services.platform.Section;
import com.docuware.dev.schema._public.services.platform.LockInfo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev.schema._public.services.Links;


/**
 * Define a row of  the table result from document query
 * 
 * <p>Java-Klasse f�r TableResultRow complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TableResultRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;choice>
 *             &lt;element name="Int" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *             &lt;element name="Decimal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *             &lt;element name="String" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *             &lt;element name="Empty" type="{http://dev.docuware.com/schema/public/services/platform}NullTableResultValue"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/>
 *         &lt;element name="Suggestions" type="{http://dev.docuware.com/schema/public/services/platform}SuggestionFields" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableResultRow", propOrder = {
"proxy",
    "intOrDecimalOrString",
    "links",
    "suggestions"
})
public class TableResultRow  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElements({
        @XmlElement(name = "Int", type = Long.class),
        @XmlElement(name = "Decimal", type = BigDecimal.class),
        @XmlElement(name = "String", type = String.class),
        @XmlElement(name = "DateTime", type = XMLGregorianCalendar.class),
        @XmlElement(name = "Empty", type = NullTableResultValue.class)
    })
    protected List<Object> intOrDecimalOrString;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlElement(name = "Suggestions")
    protected SuggestionFields suggestions;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    /**
     * Gets the value of the intOrDecimalOrString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intOrDecimalOrString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntOrDecimalOrString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * {@link BigDecimal }
     * {@link String }
     * {@link XMLGregorianCalendar }
     * {@link NullTableResultValue }
     * 
     * 
     */
    public List<Object> getIntOrDecimalOrString() {
        if (intOrDecimalOrString == null) {
            intOrDecimalOrString = new ArrayList<Object>();
        }
        return this.intOrDecimalOrString;
    }

    /**
     * Ruft den Wert der links-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Legt den Wert der links-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * Ruft den Wert der suggestions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SuggestionFields }
     *     
     */
    public SuggestionFields getSuggestions() {
        return suggestions;
    }

    /**
     * Legt den Wert der suggestions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestionFields }
     *     
     */
    public void setSuggestions(SuggestionFields value) {
        this.suggestions = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }


	/**
	* Gets the proxy.
	* 
	* @return	The proxy
	*/
    public HttpClientProxy getProxy() {
	return this.proxy;
    }


	/**
	* Sets the HTTP Communication Proxy which is used in futher HTTP communication.
	* 
	* @param proxy	The new proxy
	*/
    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    }


	/**
	* Gets the base URI of the specified relations instance.
	* 
	* @return	The base URI of the specified relations instance.
	*/
    public URI getBaseUri() { 
	return RelationsWithProxyExtensions.getBaseUri(this);
    }

    /**
    * Gets the Uri of the Link for the relation "Self".
    * Returns the Uri of the Link for the relation "Self", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self".
    */
    public Document getDocumentFromSelfRelation() {
        return MethodInvocation.<Document>get(this, links, "self", Document.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> getDocumentFromSelfRelationAsync() {
        return MethodInvocation.<Document>getAsync(this, links, "self", Document.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> getDocumentFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Document>getAsync(this, links, "self", Document.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Self".
    */
    public Document postToSelfRelationForDocument(InputStream data, String bodyContentType) {
        return MethodInvocation.<Document, InputStream>post(this, links, "self", Document.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> postToSelfRelationForDocumentAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "self", Document.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> postToSelfRelationForDocumentAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "self", Document.class, data, bodyContentType, ct);
}

    /**
    * Calls the HTTP Delete Method on the link for the relation "Self".
    */
    public String deleteSelfRelation() {
        return MethodInvocation.delete(this, links, "self");
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> deleteSelfRelationAsync() {
        return MethodInvocation.deleteAsync(this, links, "self");
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> deleteSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.deleteAsync(this, links, "self", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Fields".
    * Returns the Uri of the Link for the relation "Fields", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFieldsRelationLink() {
        return MethodInvocation.getLink(this, links, "fields");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Fields".
    */
    public DocumentIndexFields getDocumentIndexFieldsFromFieldsRelation() {
        return MethodInvocation.<DocumentIndexFields>get(this, links, "fields", DocumentIndexFields.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Fields" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> getDocumentIndexFieldsFromFieldsRelationAsync() {
        return MethodInvocation.<DocumentIndexFields>getAsync(this, links, "fields", DocumentIndexFields.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Fields" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> getDocumentIndexFieldsFromFieldsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentIndexFields>getAsync(this, links, "fields", DocumentIndexFields.class, ct);
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields".
    */
    public DocumentIndexFields putToFieldsRelationForDocumentIndexFields(DocumentIndexFields data) {
        return MethodInvocation.<DocumentIndexFields,DocumentIndexFields>put(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields"), DocumentIndexFields.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> putToFieldsRelationForDocumentIndexFieldsAsync(DocumentIndexFields data) {
        return MethodInvocation.<DocumentIndexFields, DocumentIndexFields >putAsync(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields"), DocumentIndexFields.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> putToFieldsRelationForDocumentIndexFieldsAsync(DocumentIndexFields data, CancellationToken ct) {
        return MethodInvocation.<DocumentIndexFields, DocumentIndexFields >putAsync(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields"), DocumentIndexFields.class, null, data), ct);
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields".
    */
    public DocumentIndexFields putToFieldsRelationForDocumentIndexFields(UpdateIndexFieldsInfo data) {
        return MethodInvocation.<DocumentIndexFields,UpdateIndexFieldsInfo>put(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo"), UpdateIndexFieldsInfo.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> putToFieldsRelationForDocumentIndexFieldsAsync(UpdateIndexFieldsInfo data) {
        return MethodInvocation.<DocumentIndexFields, UpdateIndexFieldsInfo >putAsync(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo"), UpdateIndexFieldsInfo.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> putToFieldsRelationForDocumentIndexFieldsAsync(UpdateIndexFieldsInfo data, CancellationToken ct) {
        return MethodInvocation.<DocumentIndexFields, UpdateIndexFieldsInfo >putAsync(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo"), UpdateIndexFieldsInfo.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Suggestions".
    * Returns the Uri of the Link for the relation "Suggestions", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSuggestionsRelationLink() {
        return MethodInvocation.getLink(this, links, "suggestions");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Suggestions".
    */
    public SuggestionFields getSuggestionFieldsFromSuggestionsRelation() {
        return MethodInvocation.<SuggestionFields>get(this, links, "suggestions", SuggestionFields.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Suggestions" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<SuggestionFields>> getSuggestionFieldsFromSuggestionsRelationAsync() {
        return MethodInvocation.<SuggestionFields>getAsync(this, links, "suggestions", SuggestionFields.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Suggestions" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<SuggestionFields>> getSuggestionFieldsFromSuggestionsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SuggestionFields>getAsync(this, links, "suggestions", SuggestionFields.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ClippedDocuments".
    * Returns the Uri of the Link for the relation "ClippedDocuments", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getClippedDocumentsRelationLink() {
        return MethodInvocation.getLink(this, links, "clippedDocuments");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ClippedDocuments".
    */
    public Document putToClippedDocumentsRelationForDocument(IntegerList data) {
        return MethodInvocation.<Document,IntegerList>put(this, links, "clippedDocuments", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ClippedDocuments" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> putToClippedDocumentsRelationForDocumentAsync(IntegerList data) {
        return MethodInvocation.<Document, IntegerList >putAsync(this, links, "clippedDocuments", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ClippedDocuments" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> putToClippedDocumentsRelationForDocumentAsync(IntegerList data, CancellationToken ct) {
        return MethodInvocation.<Document, IntegerList >putAsync(this, links, "clippedDocuments", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Sections".
    * Returns the Uri of the Link for the relation "Sections", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSectionsRelationLink() {
        return MethodInvocation.getLink(this, links, "sections");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Sections".
    */
    public Sections getSectionsFromSectionsRelation() {
        return MethodInvocation.<Sections>get(this, links, "sections", Sections.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Sections" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Sections>> getSectionsFromSectionsRelationAsync() {
        return MethodInvocation.<Sections>getAsync(this, links, "sections", Sections.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Sections" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Sections>> getSectionsFromSectionsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Sections>getAsync(this, links, "sections", Sections.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Sections".
    */
    public Section postToSectionsRelationForSection(InputStream data, String bodyContentType) {
        return MethodInvocation.<Section, InputStream>post(this, links, "sections", Section.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Sections" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> postToSectionsRelationForSectionAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "sections", Section.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "Sections" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> postToSectionsRelationForSectionAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "sections", Section.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "Thumbnail".
    * Returns the Uri of the Link for the relation "Thumbnail", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getThumbnailRelationLink() {
        return MethodInvocation.getLink(this, links, "thumbnail");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail".
    */
    public URI getURIFromThumbnailRelation() {
        return MethodInvocation.<URI>get(this, links, "thumbnail", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromThumbnailRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "thumbnail", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromThumbnailRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "thumbnail", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Lock".
    * Returns the Uri of the Link for the relation "Lock", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLockRelationLink() {
        return MethodInvocation.getLink(this, links, "lock");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Lock".
    */
    public String postToLockRelationForString(LockInfo data) {
        return MethodInvocation.<String,LockInfo>post(this, links, "lock", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "LockInfo"), LockInfo.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Lock" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToLockRelationForStringAsync(LockInfo data) {
        return MethodInvocation.<String, LockInfo >postAsync(this, links, "lock", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "LockInfo"), LockInfo.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Lock" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToLockRelationForStringAsync(LockInfo data, CancellationToken ct) {
        return MethodInvocation.<String, LockInfo >postAsync(this, links, "lock", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "LockInfo"), LockInfo.class, null, data), ct);
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Lock".
    */
    public String deleteLockRelation() {
        return MethodInvocation.delete(this, links, "lock");
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Lock" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> deleteLockRelationAsync() {
        return MethodInvocation.deleteAsync(this, links, "lock");
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Lock" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> deleteLockRelationAsync(CancellationToken ct) {
        return MethodInvocation.deleteAsync(this, links, "lock", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Rights".
    * Returns the Uri of the Link for the relation "Rights", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getRightsRelationLink() {
        return MethodInvocation.getLink(this, links, "rights");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Rights".
    */
    public Section postToRightsRelationForSection(InputStream data, String bodyContentType) {
        return MethodInvocation.<Section, InputStream>post(this, links, "rights", Section.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Rights" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> postToRightsRelationForSectionAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "rights", Section.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "Rights" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> postToRightsRelationForSectionAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "rights", Section.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "Intellix".
    * Returns the Uri of the Link for the relation "Intellix", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getIntellixRelationLink() {
        return MethodInvocation.getLink(this, links, "intellix");
    }



}
