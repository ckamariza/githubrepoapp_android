package com.githubrepos.application.data.rest;

import java.util.List;

import io.reactivex.Single;
import com.githubrepos.application.data.model.Repo;

import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface RepoService {

    @GET("users/Google/repos")
    Single<List<Repo>> getRepositories(@Header("User-Agent" )String user_agent);

    @GET("repos/{owner}/{name}")
    Single<Repo> getRepo(@Path("owner") String owner, @Path("name") String name);



}
