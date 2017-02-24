package com.docuware.dev.Extensions;

import java.io.InputStream;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

/**
 * Created by David Gautier on 24/02/2017.
 */
public class InputStreamWrapper implements IFileUploadInfo {

    private InputStream inputStream;
    private String name;
    private long length;
    private String contentType;
    private long lastModified;

    private InputStreamWrapper(){}

    public static InputStreamWrapper.Name inpustream(InputStream inputStream){
        return new InputStreamWrapper.Builder(inputStream);
    }

    public interface Name {
        Length name(String name);
    }

    public interface Length {
        ContentType length(long length);
    }

    public interface ContentType {
        LastModified contentType(String contentType);
    }

    public interface LastModified{
        Build lastModified(long lastModified);
    }

    public interface Build{
        InputStreamWrapper build();
    }

    @Override
    public InputStream createInputStream() {
        return inputStream;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getLength() {
        return length;
    }

    @Override
    public GregorianCalendar getLastWriteTimeUtc() {
        ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(lastModified), ZoneId.of("UTC"));
        GregorianCalendar gc = GregorianCalendar.from(zdt);
        return gc;
    }



    public static class Builder implements Name, Length, ContentType, LastModified, Build {
        private InputStreamWrapper instance = new InputStreamWrapper();


        public Builder(InputStream inputStream) {
            instance.inputStream = inputStream;
        }

        @Override
        public Length name(String name) {
            instance.name = name;
            return this;
        }

        @Override
        public ContentType length(long length) {
            instance.length = length;
            return this;
        }

        @Override
        public LastModified contentType(String contentType) {
            instance.contentType = contentType;
            return this;
        }

        @Override
        public Build lastModified(long lastModified) {
            instance.lastModified = lastModified;
            return this;
        }

        @Override
        public InputStreamWrapper build() {
            return instance;
        }
    }
}
