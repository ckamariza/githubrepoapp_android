package com.githubrepos.application.data.model;

public class Repo {

    public final long id;
    public final String name;
    public final String description;
    public final User owner;
    public final LicenceInfo license;
    public final String pushed_at;
    public final String created_at;
    public final String url;

    public Repo(long id, String name, String description, User owner, String pushed_at, String created_at, String url,LicenceInfo license) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.pushed_at = pushed_at;
        this.created_at = created_at;
        this.url = url;
        this.license=license;
    }
}
