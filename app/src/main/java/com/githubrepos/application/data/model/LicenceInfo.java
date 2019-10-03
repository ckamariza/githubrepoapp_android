package com.githubrepos.application.data.model;

public class LicenceInfo {

    public final String key;
    public final String name;
    public final String spdx_id;
    public final String url;
    public final String node_id;

    public LicenceInfo(String key, String name, String spdx_id, String url, String node_id) {
        this.key = key;
        this.name = name;
        this.spdx_id = spdx_id;
        this.url = url;
        this.node_id = node_id;
    }

}
