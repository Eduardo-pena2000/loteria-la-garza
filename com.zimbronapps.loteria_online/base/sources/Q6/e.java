package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e extends y6.a {
    public static final Parcelable.Creator CREATOR = new j();
    public final Bundle a;
    public final List b;
    public final Map c;

    public static class a extends y6.a {
        public static final Parcelable.Creator CREATOR = new g();
        public final byte[] a;
        public final String b;

        public a(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        public byte[] M1() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return r.c(Integer.valueOf(Arrays.hashCode(this.a)));
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = y6.c.a(parcel);
            y6.c.k(parcel, 1, M1(), false);
            y6.c.E(parcel, 2, this.b, false);
            y6.c.b(parcel, a);
        }

        public final String zza() {
            return this.b;
        }
    }

    public e(Bundle bundle, List list) {
        this.a = bundle;
        this.b = list;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            hashMap.put(aVar.zza(), aVar);
        }
        this.c = hashMap;
    }

    public Map M1() {
        return Collections.unmodifiableMap(this.c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.a;
        int a2 = y6.c.a(parcel);
        y6.c.j(parcel, 1, bundle, false);
        y6.c.I(parcel, 2, this.b, false);
        y6.c.b(parcel, a2);
    }
}
