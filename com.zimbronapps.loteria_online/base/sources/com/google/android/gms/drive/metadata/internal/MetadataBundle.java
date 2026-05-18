package com.google.android.gms.drive.metadata.internal;

import J6.b;
import K6.f;
import K6.j;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.drive.zzhs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class MetadataBundle extends a implements ReflectedParcelable {
    public final Bundle a;
    public static final k b = new k("MetadataBundle", "");
    public static final Parcelable.Creator CREATOR = new j();

    public MetadataBundle(Bundle bundle) {
        Bundle bundle2 = (Bundle) t.l(bundle);
        this.a = bundle2;
        bundle2.setClassLoader(MetadataBundle.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        for (String str : bundle2.keySet()) {
            if (f.d(str) == null) {
                arrayList.add(str);
                b.k("MetadataBundle", "Ignored unknown metadata field in bundle: %s", str);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.a.remove((String) obj);
        }
    }

    public static MetadataBundle M1(b bVar, Object obj) {
        MetadataBundle Q1 = Q1();
        Q1.P1(bVar, obj);
        return Q1;
    }

    public static MetadataBundle Q1() {
        return new MetadataBundle(new Bundle());
    }

    public final Object N1(b bVar) {
        return bVar.zza(this.a);
    }

    public final void O1(Context context) {
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) N1(zzhs.zzkq);
        if (bitmapTeleporter != null) {
            bitmapTeleporter.M1(context.getCacheDir());
        }
    }

    public final void P1(b bVar, Object obj) {
        if (f.d(bVar.getName()) == null) {
            String valueOf = String.valueOf(bVar.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unregistered field: ".concat(valueOf) : new String("Unregistered field: "));
        }
        bVar.zza(obj, this.a);
    }

    public final MetadataBundle R1() {
        return new MetadataBundle(new Bundle(this.a));
    }

    public final Set S1() {
        HashSet hashSet = new HashSet();
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            hashSet.add(f.d((String) it.next()));
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != MetadataBundle.class) {
            return false;
        }
        MetadataBundle metadataBundle = (MetadataBundle) obj;
        Set<String> keySet = this.a.keySet();
        if (!keySet.equals(metadataBundle.a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!r.b(this.a.get(str), metadataBundle.a.get(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.a.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            i = (i * 31) + this.a.get((String) it.next()).hashCode();
        }
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.j(parcel, 2, this.a, false);
        c.b(parcel, a);
    }
}
