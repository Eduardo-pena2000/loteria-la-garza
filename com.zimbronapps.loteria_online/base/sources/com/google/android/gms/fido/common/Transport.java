package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.fido.zzhu;
import com.google.android.gms.internal.fido.zzhx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable"),
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator CREATOR = new com.google.android.gms.fido.common.a();
    public final String a;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    Transport(String str) {
        this.a = str;
    }

    public static Transport b(String str) {
        if (str.equals("hybrid") && (!zzhu.zzb() || !zzhx.zzb())) {
            return HYBRID;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.a)) {
                return transport;
            }
        }
        throw new a(String.format("Transport %s not supported", new Object[]{str}));
    }

    public static List c(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            if (string != null && !string.isEmpty()) {
                try {
                    hashSet.add(b(string));
                } catch (a unused) {
                    Log.w("Transport", "Ignoring unrecognized transport ".concat(string));
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
    }
}
