package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h7.F;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LocationResult extends a implements ReflectedParcelable {
    public final List a;
    public static final List b = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new F();

    public LocationResult(List list) {
        this.a = list;
    }

    public List M1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.a.size() != this.a.size()) {
            return false;
        }
        Iterator it = locationResult.a.iterator();
        Iterator it2 = this.a.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator it = this.a.iterator();
        int i = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.I(parcel, 1, M1(), false);
        c.b(parcel, a);
    }
}
