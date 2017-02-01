/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.platform.LockInfo;
import java8.util.concurrent.CompletableFuture;


/**
 *
 * @author Patrick
 */
public interface IDocumentLockRequestHandler {
     CompletableFuture<String> sendLock(LockInfo lockInfo);
        CompletableFuture<String> deleteLock();
        int getLockInterval();
}
