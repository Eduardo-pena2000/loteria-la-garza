package com.amazon.device.iap.model;

import com.amazon.a.a.o.f;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class UserDataResponse {
    private static final String REQUEST_ID = "REQUEST_ID";
    private static final String REQUEST_STATUS = "REQUEST_STATUS";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\")";
    private static final String USER_DATA = "USER_DATA";
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final UserData userData;

    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        NOT_SUPPORTED
    }

    public UserDataResponse(UserDataResponseBuilder userDataResponseBuilder) {
        f.a(userDataResponseBuilder.getRequestId(), "requestId");
        f.a(userDataResponseBuilder.getRequestStatus(), "requestStatus");
        this.requestId = userDataResponseBuilder.getRequestId();
        this.requestStatus = userDataResponseBuilder.getRequestStatus();
        this.userData = userDataResponseBuilder.getUserData();
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public UserData getUserData() {
        return this.userData;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("REQUEST_ID", this.requestId);
        jSONObject.put("REQUEST_STATUS", this.requestStatus);
        UserData userData = this.userData;
        jSONObject.put("USER_DATA", userData != null ? userData.toJSON() : "");
        return jSONObject;
    }

    public String toString() {
        String obj = super.toString();
        RequestId requestId = this.requestId;
        RequestStatus requestStatus = this.requestStatus;
        String obj2 = requestStatus != null ? requestStatus.toString() : "null";
        UserData userData = this.userData;
        return String.format("(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\")", new Object[]{obj, requestId, obj2, userData != null ? userData.toString() : "null"});
    }
}
