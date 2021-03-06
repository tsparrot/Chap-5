package com.byted.chapter5;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

/**
 * "admin": false,
 * "chapterTops": [],
 * "collectIds": [],
 * "email": "",
 * "icon": "",
 * "id": 58872,
 * "nickname": "wwwsjdajsd",
 * "password": "",
 * "publicName": "wwwsjdajsd",
 * "token": "",
 * "type": 0,
 * "username": "wwwsjdajsd"
 */
class User {
    @SerializedName("nickname")
    public String nickname;

    @NonNull
    @Override
    public String toString() {
        return "User{" +
                "nickname=" + nickname +
                '}';
    }
}
