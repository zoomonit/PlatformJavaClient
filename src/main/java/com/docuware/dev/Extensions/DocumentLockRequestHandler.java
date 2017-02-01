/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.platform.Document;
import com.docuware.dev.schema._public.services.platform.LockInfo;
import java8.util.concurrent.CompletableFuture;
import java8.util.function.Function;


/**
 *
 * @author Patrick
 */
public class DocumentLockRequestHandler implements IDocumentLockRequestHandler {

    private Document document;

    private int lockIntervalInSeconds = 60;

    public DocumentLockRequestHandler(Document document) {
        // TODO: Complete member initialization
        this.document = document;
    }

    public CompletableFuture<String> sendLock(LockInfo lockInfo) {

        return document.postToLockRelationForStringAsync(lockInfo).<String>thenApply(new Function<DeserializedHttpResponseGen<String>, String>() {
            @Override
            public String apply(DeserializedHttpResponseGen<String> stringDeserializedHttpResponseGen) {
                return stringDeserializedHttpResponseGen.getContent();
            }
        });

    }

    public CompletableFuture<String> deleteLock() {
        return document.deleteLockRelationAsync().<String>thenApply(new Function<DeserializedHttpResponseGen<String>, String>() {
            @Override
            public String apply(DeserializedHttpResponseGen<String> stringDeserializedHttpResponseGen) {
                return stringDeserializedHttpResponseGen.getContent();
            }
        });
    }

    public int getLockInterval() {
        return lockIntervalInSeconds;
    }

    int getLockIntervalInSeconds() {
        return lockIntervalInSeconds;
    }

    void setLockIntervalInSeconds(int value) {
        lockIntervalInSeconds = value;
    }

}
