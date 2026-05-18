package com.amazon.device.simplesignin.model;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public enum FailureReason {
    UNAUTHORIZED("The user isn’t authorized to do log in."),
    BAD_REQUEST("The request is corrupted."),
    NOT_FOUND("The login page the user is looking for cannot be found."),
    FORBIDDEN("No login opportunity is available."),
    INTERNAL_SERVER_ERROR("Something is wrong with the login.");

    private final String description;

    FailureReason(String str) {
        this.description = str;
    }

    public String toString() {
        return this.description;
    }
}
