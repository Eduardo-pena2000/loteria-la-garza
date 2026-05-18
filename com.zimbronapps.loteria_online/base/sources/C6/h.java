package C6;

import C6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h extends y6.a {
    public static final Parcelable.Creator CREATOR = new i();
    public final int a;
    public final HashMap b;
    public final String c;

    public h(int i, ArrayList arrayList, String str) {
        this.a = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = (f) arrayList.get(i2);
            String str2 = fVar.b;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) t.l(fVar.c)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                g gVar = (g) fVar.c.get(i3);
                hashMap2.put(gVar.b, gVar.c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.b = hashMap;
        this.c = (String) t.l(str);
        O1();
    }

    public final String M1() {
        return this.c;
    }

    public final Map N1(String str) {
        return (Map) this.b.get(str);
    }

    public final void O1() {
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.b.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((a.a) map.get((String) it2.next())).Z1(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            arrayList.add(new f(str, (Map) this.b.get(str)));
        }
        y6.c.I(parcel, 2, arrayList, false);
        y6.c.E(parcel, 3, this.c, false);
        y6.c.b(parcel, a);
    }
}
