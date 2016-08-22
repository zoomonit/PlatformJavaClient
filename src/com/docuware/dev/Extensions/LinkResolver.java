/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.Links;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.multipart.MultiPart;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 *
 * @author weidling
 */
public class LinkResolver {

    URI baseUri;
    Client client;

    public URI getBaseUri() {
        return baseUri;
    }

    public LinkResolver(URI baseUri, Client client) {
        this.baseUri = baseUri;
        this.client = client;
    }

    public static URI getLink(URI baseUri, Links links, String rel) {

        for (Link link : links.getLink()) {
            if (rel.equals(link.getRel())) {
                return baseUri.resolve(link.getHref());
            }
        }
        return null;
    }

    public URI getLink(Links links, String rel) {
        return LinkResolver.getLink(baseUri, links, rel);
    }

    public URI getAbsoluteUri(String uri) {
        return baseUri.resolve(uri);
    }

    <T> Future<DeserializedHttpResponseGen<T>> getAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.get(ClientResponse.class);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }

    <T> T get(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType) {
        WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
        ClientResponse resp = web.get(ClientResponse.class);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    <T, P> T post(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData) {
        ClientResponse resp = client.resource(LinkResolver.getLink(baseUri, links, rel)).type(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).post(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    <T, P> Future<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).post(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }

    <P> String post(IHttpClientProxy proxy, Links links, String rel, P postData) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).type(MediaType.APPLICATION_XML).post(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            return resp.getEntity(String.class);
        }
    }

    <P> Future<DeserializedHttpResponseGen<String>> postAsync(IHttpClientProxy proxy, Links links, String rel, P postData) {
        return CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).post(ClientResponse.class, postData);
            return new DeserializedHttpResponseGen(resp, resp.getEntity(String.class));
        });
    }

    <T, P> T post(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).type(bodyContentType).post(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    <T, P> T postMultipart(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, P postData) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).type(MediaType.MULTIPART_FORM_DATA).post(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    <T, P> Future<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(bodyContentType).post(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }

    <T, P> Future<DeserializedHttpResponseGen<T>> postMultipartAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, P postData) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(MediaType.MULTIPART_FORM_DATA).post(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });

    }

    <T> T post(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, InputStream postData) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).post(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    <T> Future<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, InputStream postData) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.post(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }


    /*
     * public <T> T post(Links links, String rel, Class<T> expectedType) {
     return client.resource(LinkResolver.getLink(baseUri, links, rel)).accept(MediaType.APPLICATION_XML).post(expectedType);
     }
 */
    <T, P> T put(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).type(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).put(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    <T, P> Future<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).put(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });

    }

    <T> T put(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).put(ClientResponse.class);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    <T> Future<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.put(ClientResponse.class);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });

    }

    <P> String put(IHttpClientProxy proxy, Links links, String rel, P postData) {
        ClientResponse resp = client.resource(LinkResolver.getLink(baseUri, links, rel)).put(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            return resp.getEntity(String.class);
        }
    }

    <P> Future<DeserializedHttpResponseGen<String>> putAsync(IHttpClientProxy proxy, Links links, String rel, P postData) {
        return CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.put(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                return new DeserializedHttpResponseGen(resp, resp.getEntity(String.class));
            }
        });
    }

    <T, P> T put(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType) {
        ClientResponse resp = client.resource(LinkResolver.getLink(baseUri, links, rel)).type(bodyContentType).put(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    <T, P> Future<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(bodyContentType).put(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }

    <T> T put(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, InputStream postData) {
        ClientResponse resp = client.resource(LinkResolver.getLink(baseUri, links, rel)).put(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    <T> Future<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, InputStream postData) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.put(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }

    String delete(IHttpClientProxy proxy, Links links, String rel) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).delete(ClientResponse.class);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            return resp.getEntity(String.class);
        }
    }

    Future<DeserializedHttpResponseGen<String>> deleteAsync(IHttpClientProxy proxy, Links links, String rel) {
        return CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.delete(ClientResponse.class);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                return new DeserializedHttpResponseGen(resp, resp.getEntity(String.class));
            }
        });
    }

    static <T, P> CompletableFuture<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy proxy, URI uri, String type, String accept, Class<T> expectedType, Class<P> inputType, String inputTypeString, P data) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().resource(uri);
            JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", inputTypeString), inputType, null, data);
            ClientResponse resp = web.type(type).accept(accept).post(ClientResponse.class, jax);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                return new DeserializedHttpResponseGen<>(resp, resp.getEntity(expectedType));
            }
        });
    }

    static <T> CompletableFuture<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy proxy, URI uri, String type, String accept, Class<T> expectedType, InputStream data) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().resource(uri);
            ClientResponse resp = web.type(type).accept(accept).post(ClientResponse.class, data);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                return new DeserializedHttpResponseGen<>(resp, resp.getEntity(expectedType));
            }
        });
    }

    static <T> CompletableFuture<DeserializedHttpResponseGen<T>> postMultiPartAsync(IHttpClientProxy proxy, URI uri, String accept, Class<T> expectedType, MultiPart data) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().resource(uri);
            ClientResponse resp = web.type(MediaType.MULTIPART_FORM_DATA).accept(accept).post(ClientResponse.class, data);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                return new DeserializedHttpResponseGen<>(resp, resp.getEntity(expectedType));
            }
        });
    }

    static <T, P> CompletableFuture<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy proxy, URI uri, String type, String accept, Class<T> expectedType, Class<P> inputType, String inputTypeString, P data) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().resource(uri);
            JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", inputTypeString), inputType, null, data);
            ClientResponse resp = web.type(type).accept(accept).put(ClientResponse.class, jax);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                return new DeserializedHttpResponseGen<>(resp, resp.getEntity(expectedType));
            }
        });
    }

    static <T> CompletableFuture<DeserializedHttpResponseGen<T>> getAsync(IHttpClientProxy proxy, URI uri, String accept, Class<T> expectedType) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().resource(uri);
            ClientResponse resp = web.accept(accept).get(ClientResponse.class);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                System.out.println("real");
                return new DeserializedHttpResponseGen<>(resp, resp.getEntity(expectedType));
            }
        });
    }
    
    

    static CompletableFuture<DeserializedHttpResponseGen<String>> deleteAsync(IHttpClientProxy proxy, URI uri, String accept) {
        CompletableFuture fut = CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().resource(uri);
            ClientResponse resp = web.accept(accept).delete(ClientResponse.class);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                return new DeserializedHttpResponseGen<>(resp, resp.getEntity(String.class));
            }
        });      
        return fut;
    }
}
