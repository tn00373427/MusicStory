package org.metol.musicstory.model;

import android.support.annotation.Keep;

/**
 * Created by Broccoli.Huang on 2018/1/6.
 */

@Keep
public class Member {
    public String email;
    public String uid;
    public String name;
    public String gender;
    public Integer edm;
    public Integer status;

    public Member(){

    }

    public Member(String email, String uid, String name, String gender, Integer edm, Integer status) {
        this.email = email;
        this.uid = uid;
        this.name = name;
        this.gender = gender;
        this.edm = edm;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getEdm() {
        return edm;
    }

    public void setEdm(Integer edm) {
        this.edm = edm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}