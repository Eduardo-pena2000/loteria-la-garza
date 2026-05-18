package q6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c extends y6.a {
    public static final Parcelable.Creator CREATOR = new h();
    public final List a;
    public final boolean b;

    public static final class a {
        public List a = new ArrayList();
        public boolean b = false;

        public c a() {
            return new c(this.a, this.b);
        }

        public a b(List list) {
            t.m(list, "Keys cannot be set to null");
            this.a = list;
            return this;
        }
    }

    public c(List list, boolean z) {
        if (z) {
            boolean z2 = true;
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            t.p(z2, "deleteAll was set to true but other constraint(s) was also provided: keys");
        }
        this.b = z;
        this.a = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                t.g(str, "Element in keys cannot be null or empty");
                this.a.add(str);
            }
        }
    }

    public boolean M1() {
        return this.b;
    }

    public List N1() {
        return Collections.unmodifiableList(this.a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = y6.c.a(parcel);
        y6.c.G(parcel, 1, N1(), false);
        y6.c.g(parcel, 2, M1());
        y6.c.b(parcel, a2);
    }
}
