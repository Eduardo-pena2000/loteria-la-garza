package n9;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import da.c;
import da.j;
import da.l;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c implements l {
    public static final a j = new a(null);
    public static final int k = (d.class.hashCode() + 43) & 65535;
    public static final int l = (d.class.hashCode() + 83) & 65535;
    public final Activity a;
    public j.d b;
    public boolean c;
    public boolean d;
    public String e;
    public int f;
    public ArrayList g;
    public c.b h;
    public byte[] i;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final void a(j.d dVar) {
            t.g(dVar, "result");
            dVar.b("already_active", "File picker is already active", (Object) null);
        }

        public final int b() {
            return c.b();
        }

        public final int c() {
            return c.c();
        }

        public a() {
        }
    }

    public c(Activity activity, j.d dVar) {
        t.g(activity, "activity");
        this.a = activity;
        this.b = dVar;
    }

    public static /* synthetic */ void a(c cVar, boolean z) {
        f(cVar, z);
    }

    public static final /* synthetic */ int b() {
        return k;
    }

    public static final /* synthetic */ int c() {
        return l;
    }

    public static final void f(c cVar, boolean z) {
        c.b bVar = cVar.h;
        if (bVar != null) {
            bVar.a(Boolean.valueOf(z));
        }
    }

    public final void d() {
        this.b = null;
    }

    public final void e(boolean z) {
        if (this.h == null || t.c(this.e, "dir")) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new b(this, z));
    }

    public final void g(String str, String str2) {
        t.g(str, "errorCode");
        e(false);
        j.d dVar = this.b;
        if (dVar != null) {
            dVar.b(str, str2, (Object) null);
        }
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            r5.e(r0)
            da.j$d r0 = r5.b
            if (r0 == 0) goto L50
            r1 = 0
            if (r6 == 0) goto L17
            boolean r2 = r6 instanceof java.lang.String
            if (r2 == 0) goto L11
            r2 = r6
            goto L12
        L11:
            r2 = r1
        L12:
            if (r2 != 0) goto L15
            goto L17
        L15:
            r1 = r2
            goto L4a
        L17:
            boolean r2 = r6 instanceof java.util.ArrayList
            if (r2 == 0) goto L1e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            goto L1f
        L1e:
            r6 = r1
        L1f:
            if (r6 == 0) goto L4a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L15
            java.lang.Object r3 = r6.next()
            boolean r4 = r3 instanceof n9.a
            if (r4 == 0) goto L3b
            n9.a r3 = (n9.a) r3
            goto L3c
        L3b:
            r3 = r1
        L3c:
            if (r3 == 0) goto L43
            java.util.HashMap r3 = r3.a()
            goto L44
        L43:
            r3 = r1
        L44:
            if (r3 == 0) goto L2a
            r2.add(r3)
            goto L2a
        L4a:
            r0.a(r1)
            r5.d()
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.c.h(java.lang.Object):void");
    }

    public final Activity i() {
        return this.a;
    }

    public final ArrayList j() {
        return this.g;
    }

    public final String k() {
        return this.e;
    }

    public final boolean l(int i, Intent intent) {
        if (i != -1) {
            if (i != 0) {
                return false;
            }
            h(null);
            return true;
        }
        e(true);
        f fVar = f.a;
        Activity activity = this.a;
        int i2 = this.f;
        boolean z = this.d;
        String str = this.e;
        if (str == null) {
            str = "";
        }
        fVar.y(this, activity, intent, i2, z, str);
        return true;
    }

    public final boolean m(int i, Intent intent) {
        if (i == -1) {
            return o(intent != null ? intent.getData() : null);
        }
        if (i != 0) {
            return false;
        }
        h(null);
        return false;
    }

    public final boolean n() {
        return this.c;
    }

    public final boolean o(Uri uri) {
        if (uri == null) {
            return false;
        }
        e(true);
        try {
            Uri E = f.a.E(this.a, uri, this.i);
            if (E != null) {
                uri = E;
            }
            h(uri.getPath());
            return true;
        } catch (IOException e) {
            Log.e("FilePickerDelegate", "Error while saving file", e);
            g("Error while saving file", e.getMessage());
            return false;
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (i == l) {
            return m(i2, intent);
        }
        if (i == k) {
            return l(i2, intent);
        }
        g("unknown_activity", "Unknown activity error, please file an issue.");
        return false;
    }

    public final void p(ArrayList arrayList) {
        this.g = arrayList;
    }

    public final void q(byte[] bArr) {
        this.i = bArr;
    }

    public final void r(int i) {
        this.f = i;
    }

    public final void s(c.b bVar) {
        this.h = bVar;
    }

    public final void t(boolean z) {
        this.d = z;
    }

    public final void u(boolean z) {
        this.c = z;
    }

    public final boolean v(j.d dVar) {
        t.g(dVar, "result");
        if (this.b != null) {
            return false;
        }
        this.b = dVar;
        return true;
    }

    public final void w(String str) {
        this.e = str;
    }

    public /* synthetic */ c(Activity activity, j.d dVar, int i, k kVar) {
        this(activity, (i & 2) != 0 ? null : dVar);
    }
}
