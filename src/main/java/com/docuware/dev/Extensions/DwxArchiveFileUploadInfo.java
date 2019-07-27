/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Patrick
 */
public class DwxArchiveFileUploadInfo implements IFileUploadInfo {

    private File _file;

    public DwxArchiveFileUploadInfo(File file) {
        _file = file;
    }

    public DwxArchiveFileUploadInfo() {
    }

    @Override
    public InputStream createInputStream() {
        try {
            return new FileInputStream(_file);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException("File not Found");
        }
    }

    @Override
    public String getContentType() {
        return "application/vnd.docuware.platform.filescontainer+dwx";
    }

    @Override
    public String getName() {
        return "dwx.dwx";
    }

    @Override
    public long getLength() {
        return _file.length();

    }

    @Override
    public GregorianCalendar getLastWriteTimeUtc() {
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("UTC"));
        GregorianCalendar gc  = new GregorianCalendar();
        gc.setTime(new Date(zdt.toEpochSecond()));
        return gc;
    }

}
