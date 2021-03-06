package com.example.luckychuan.downloaddemo;

import org.litepal.crud.DataSupport;

/**
 * LitePal用到的模型类
 */
public class TaskDB extends DataSupport {

    private String url;
    private String name;
    //文件大小
    private long contentLength;
    //已下载大小
    private long downloadedLength;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContentLength() {
        return contentLength;
    }

    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    public long getDownloadedLength() {
        return downloadedLength;
    }

    public void setDownloadedLength(long downloadedLength) {
        this.downloadedLength = downloadedLength;
    }
}
