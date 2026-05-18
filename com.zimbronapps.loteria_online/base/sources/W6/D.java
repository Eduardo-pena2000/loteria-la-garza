package w6;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class d {
    public final DataHolder a;
    public int b;
    public int c;

    public d(DataHolder dataHolder, int i) {
        this.a = (DataHolder) t.l(dataHolder);
        w(i);
    }

    public boolean b(String str) {
        return this.a.M1(str, this.b, this.c);
    }

    public float d(String str) {
        return this.a.V1(str, this.b, this.c);
    }

    public int i(String str) {
        return this.a.N1(str, this.b, this.c);
    }

    public long j(String str) {
        return this.a.O1(str, this.b, this.c);
    }

    public String l(String str) {
        return this.a.R1(str, this.b, this.c);
    }

    public boolean n(String str) {
        return this.a.T1(str);
    }

    public boolean p(String str) {
        return this.a.U1(str, this.b, this.c);
    }

    public Uri q(String str) {
        String R1 = this.a.R1(str, this.b, this.c);
        if (R1 == null) {
            return null;
        }
        return Uri.parse(R1);
    }

    public final void w(int i) {
        boolean z = false;
        if (i >= 0 && i < this.a.getCount()) {
            z = true;
        }
        t.o(z);
        this.b = i;
        this.c = this.a.S1(i);
    }
}
