package com.google.android.gms.common.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b extends Exception {

    @Deprecated
    protected final Status mStatus;

    public b(Status status) {
        int O1 = status.O1();
        String P1 = status.P1() != null ? status.P1() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(O1).length() + 2 + String.valueOf(P1).length());
        sb.append(O1);
        sb.append(": ");
        sb.append(P1);
        super(sb.toString());
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.O1();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.P1();
    }
}
