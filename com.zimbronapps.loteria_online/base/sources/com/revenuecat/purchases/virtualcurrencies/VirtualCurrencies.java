package com.revenuecat.purchases.virtualcurrencies;

import Ca.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.M;
import sb.f0;
import sb.t0;
import sb.x0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrencies implements Parcelable {
    private final Map all;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator CREATOR = new Creator();
    private static final b[] $childSerializers = {new M(x0.a, VirtualCurrency$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return VirtualCurrencies$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator {
        public final VirtualCurrencies createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), VirtualCurrency.CREATOR.createFromParcel(parcel));
            }
            return new VirtualCurrencies(linkedHashMap);
        }

        public final VirtualCurrencies[] newArray(int i) {
            return new VirtualCurrencies[i];
        }
    }

    @e
    public /* synthetic */ VirtualCurrencies(int i, Map map, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, VirtualCurrencies$$serializer.INSTANCE.getDescriptor());
        }
        this.all = map;
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ void getAll$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(VirtualCurrencies virtualCurrencies, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, $childSerializers[0], virtualCurrencies.all);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VirtualCurrencies) && t.c(this.all, ((VirtualCurrencies) obj).all);
    }

    public final VirtualCurrency get(String code) {
        t.g(code, "code");
        return (VirtualCurrency) this.all.get(code);
    }

    public final Map getAll() {
        return this.all;
    }

    public int hashCode() {
        return this.all.hashCode();
    }

    public String toString() {
        return "VirtualCurrencies(all=" + this.all + ')';
    }

    public void writeToParcel(Parcel out, int i) {
        t.g(out, "out");
        Map map = this.all;
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            ((VirtualCurrency) entry.getValue()).writeToParcel(out, i);
        }
    }

    @InternalRevenueCatAPI
    public VirtualCurrencies(Map all) {
        t.g(all, "all");
        this.all = all;
    }
}
