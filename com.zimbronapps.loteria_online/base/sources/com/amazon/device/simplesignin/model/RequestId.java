package com.amazon.device.simplesignin.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class RequestId implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 1();
    private final String id;

    public static class 1 implements Parcelable.Creator {
        public RequestId createFromParcel(Parcel parcel) {
            return new RequestId(parcel.readString());
        }

        public RequestId[] newArray(int i) {
            return new RequestId[i];
        }
    }

    public RequestId(String str) {
        this.id = str;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.id;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
    }

    public RequestId() {
        this.id = UUID.randomUUID().toString();
    }
}
