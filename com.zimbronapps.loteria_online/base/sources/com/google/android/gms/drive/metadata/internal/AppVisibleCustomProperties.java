package com.google.android.gms.drive.metadata.internal;

import K6.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AppVisibleCustomProperties extends y6.a implements ReflectedParcelable, Iterable {
    public static final Parcelable.Creator CREATOR = new K6.a();
    public static final AppVisibleCustomProperties b = new a().b();
    public final List a;

    public static class a {
        public final Map a = new HashMap();

        public final a a(c cVar) {
            t.m(cVar, "property");
            this.a.put(cVar.a, cVar);
            return this;
        }

        public final AppVisibleCustomProperties b() {
            return new AppVisibleCustomProperties(this.a.values());
        }
    }

    public AppVisibleCustomProperties(Collection collection) {
        t.l(collection);
        this.a = new ArrayList(collection);
    }

    public final Map M1() {
        HashMap hashMap = new HashMap(this.a.size());
        for (c cVar : this.a) {
            hashMap.put(cVar.a, cVar.b);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != AppVisibleCustomProperties.class) {
            return false;
        }
        return M1().equals(((AppVisibleCustomProperties) obj).M1());
    }

    public final int hashCode() {
        return r.c(this.a);
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = y6.c.a(parcel);
        y6.c.I(parcel, 2, this.a, false);
        y6.c.b(parcel, a2);
    }
}
