package com.revenuecat.purchases.utils;

import android.os.Parcel;
import kotlin.jvm.internal.t;
import nb.a;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class JSONObjectParceler implements nb.a {
    public static final JSONObjectParceler INSTANCE = new JSONObjectParceler();

    private JSONObjectParceler() {
    }

    public JSONObject create(Parcel parcel) {
        t.g(parcel, "parcel");
        return new JSONObject(parcel.readString());
    }

    public JSONObject[] newArray(int i) {
        return (JSONObject[]) a.a.a(this, i);
    }

    public void write(JSONObject jSONObject, Parcel parcel, int i) {
        t.g(jSONObject, "<this>");
        t.g(parcel, "parcel");
        parcel.writeString(jSONObject.toString());
    }
}
