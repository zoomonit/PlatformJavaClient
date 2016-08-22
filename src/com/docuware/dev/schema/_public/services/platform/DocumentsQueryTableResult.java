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
import com.docuware.dev.schema._public.services.platform.DocumentsQueryTableResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateIndexFieldsResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateProcessData;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.Dialog;
import com.docuware.dev.schema._public.services.platform.UserDefinedSearchInfo;
import com.docuware.dev.schema._public.services.platform.ExportSettings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev.schema._public.services.Links;


/**
 * Define table result from document query
 * 
 * <p>Java-Klasse f�r DocumentsQueryTableResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentsQueryTableResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Count" type="{http://dev.docuware.com/schema/public/services/platform}CountPlusValue" minOccurs="0"/>
 *         &lt;element name="Headers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Header" type="{http://dev.docuware.com/schema/public/services/platform}TableResultHeader" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rows">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="R" type="{http://dev.docuware.com/schema/public/services/platform}TableResultRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsQueryTableResult", propOrder = {
"proxy",
    "count",
    "headers",
    "rows",
    "links"
})
public class DocumentsQueryTableResult  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Count")
    protected CountPlusValue count;
    @XmlElement(name = "Headers", required = true)
    protected DocumentsQueryTableResult.Headers headers;
    @XmlElement(name = "Rows", required = true)
    protected DocumentsQueryTableResult.Rows rows;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**
     * Ruft den Wert der count-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountPlusValue }
     *     
     */
    public CountPlusValue getCount() {
        return count;
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountPlusValue }
     *     
     */
    public void setCount(CountPlusValue value) {
        this.count = value;
    }

    /**
     * Ruft den Wert der headers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsQueryTableResult.Headers }
     *     
     */
    public DocumentsQueryTableResult.Headers getHeaders() {
        return headers;
    }

    /**
     * Legt den Wert der headers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsQueryTableResult.Headers }
     *     
     */
    public void setHeaders(DocumentsQueryTableResult.Headers value) {
        this.headers = value;
    }

    /**
     * Ruft den Wert der rows-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsQueryTableResult.Rows }
     *     
     */
    public DocumentsQueryTableResult.Rows getRows() {
        return rows;
    }

    /**
     * Legt den Wert der rows-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsQueryTableResult.Rows }
     *     
     */
    public void setRows(DocumentsQueryTableResult.Rows value) {
        this.rows = value;
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
     * Ruft den Wert der timeStamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Legt den Wert der timeStamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Header" type="{http://dev.docuware.com/schema/public/services/platform}TableResultHeader" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "header"
    })
    public static class Headers {

        @XmlElement(name = "Header")
        protected List<TableResultHeader> header;

        /**
         * Gets the value of the header property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the header property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHeader().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TableResultHeader }
         * 
         * 
         */
        public List<TableResultHeader> getHeader() {
            if (header == null) {
                header = new ArrayList<TableResultHeader>();
            }
            return this.header;
        }

    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="R" type="{http://dev.docuware.com/schema/public/services/platform}TableResultRow" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "r"
    })
    public static class Rows {

        @XmlElement(name = "R")
        protected List<TableResultRow> r;

        /**
         * Gets the value of the r property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the r property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TableResultRow }
         * 
         * 
         */
        public List<TableResultRow> getR() {
            if (r == null) {
                r = new ArrayList<TableResultRow>();
            }
            return this.r;
        }

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
	//if(this.rows!=null) {
    //    for (int i = 0; (i < this.rows.getRow().size()); i = (i + 1)) {
    //        this.rows.getRow().get(i).setProxy(proxy);
    //    }
	//}
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
	* Gets the link by its name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    public String getRelationUri(String relationName) {
	return RelationExtension.getRelationUri(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists.
	* @throws	RuntimeException: The specified Link is not found
	*/
    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }


	/**
	* Determines whether the specified link exists.
	* 
	* @param relationName	Name of the relation
	* @return	 True, if the specified link exists; otherwise, False.
	*/
    public boolean hasRelationUri(String relationName) {
	return RelationExtension.hasRelationUri(this, relationName);
    }

    /**
    * Gets the Uri of the Link for the relation "Next".
    * Returns the Uri of the Link for the relation "Next", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getNextRelationLink() {
        return MethodInvocation.getLink(this, links, "next");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next".
    */
    public DocumentsQueryTableResult getDocumentsQueryTableResultFromNextRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "next", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromNextRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "next", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromNextRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "next", DocumentsQueryTableResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Prev".
    * Returns the Uri of the Link for the relation "Prev", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getPrevRelationLink() {
        return MethodInvocation.getLink(this, links, "prev");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Prev".
    */
    public DocumentsQueryTableResult getDocumentsQueryTableResultFromPrevRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "prev", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Prev" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromPrevRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "prev", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Prev" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromPrevRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "prev", DocumentsQueryTableResult.class, ct);
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
    public DocumentsQueryTableResult getDocumentsQueryTableResultFromSelfRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "self", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromSelfRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "self", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "self", DocumentsQueryTableResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "First".
    * Returns the Uri of the Link for the relation "First", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFirstRelationLink() {
        return MethodInvocation.getLink(this, links, "first");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "First".
    */
    public DocumentsQueryTableResult getDocumentsQueryTableResultFromFirstRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "first", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "First" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromFirstRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "first", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "First" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromFirstRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "first", DocumentsQueryTableResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Feed".
    * Returns the Uri of the Link for the relation "Feed", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFeedRelationLink() {
        return MethodInvocation.getLink(this, links, "feed");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Feed".
    */
    public URI getURIFromFeedRelation() {
        return MethodInvocation.<URI>get(this, links, "feed", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Feed" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromFeedRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "feed", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Feed" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromFeedRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "feed", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Download".
    * Returns the Uri of the Link for the relation "Download", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDownloadRelationLink() {
        return MethodInvocation.getLink(this, links, "download");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Download".
    */
    public DocumentsQueryTableResult getDocumentsQueryTableResultFromDownloadRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "download", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Download" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromDownloadRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "download", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Download" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromDownloadRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "download", DocumentsQueryTableResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "BatchUpdate".
    * Returns the Uri of the Link for the relation "BatchUpdate", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getBatchUpdateRelationLink() {
        return MethodInvocation.getLink(this, links, "batchUpdate");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "BatchUpdate".
    */
    public BatchUpdateIndexFieldsResult postToBatchUpdateRelationForBatchUpdateIndexFieldsResult(BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult,BatchUpdateProcessData>post(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "BatchUpdate" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "BatchUpdate" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcessData data, CancellationToken ct) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "CreateUserDefinedSearch".
    * Returns the Uri of the Link for the relation "CreateUserDefinedSearch", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getCreateUserDefinedSearchRelationLink() {
        return MethodInvocation.getLink(this, links, "createUserDefinedSearch");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CreateUserDefinedSearch".
    */
    public Dialog postToCreateUserDefinedSearchRelationForDialog(UserDefinedSearchInfo data) {
        return MethodInvocation.<Dialog,UserDefinedSearchInfo>post(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CreateUserDefinedSearch" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Dialog>> postToCreateUserDefinedSearchRelationForDialogAsync(UserDefinedSearchInfo data) {
        return MethodInvocation.<Dialog, UserDefinedSearchInfo >postAsync(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CreateUserDefinedSearch" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Dialog>> postToCreateUserDefinedSearchRelationForDialogAsync(UserDefinedSearchInfo data, CancellationToken ct) {
        return MethodInvocation.<Dialog, UserDefinedSearchInfo >postAsync(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ExportDocuments".
    * Returns the Uri of the Link for the relation "ExportDocuments", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getExportDocumentsRelationLink() {
        return MethodInvocation.getLink(this, links, "exportDocuments");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ExportDocuments".
    */
    public String postToExportDocumentsRelationForString(ExportSettings data) {
        return MethodInvocation.<String,ExportSettings>post(this, links, "exportDocuments", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ExportDocuments" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToExportDocumentsRelationForStringAsync(ExportSettings data) {
        return MethodInvocation.<String, ExportSettings >postAsync(this, links, "exportDocuments", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ExportDocuments" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToExportDocumentsRelationForStringAsync(ExportSettings data, CancellationToken ct) {
        return MethodInvocation.<String, ExportSettings >postAsync(this, links, "exportDocuments", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data), ct);
    }



}
