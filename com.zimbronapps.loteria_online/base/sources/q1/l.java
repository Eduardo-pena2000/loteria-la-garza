package Q1;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class l {

    public static class b {
        public final Uri a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;

        public b(Uri uri, int i, int i2, boolean z, int i3) {
            this.a = (Uri) S1.g.h(uri);
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        public static b a(Uri uri, int i, int i2, boolean z, int i3) {
            return new b(uri, i, i2, z, i3);
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    public static class c {
        public abstract void a(int i);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return K1.g.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, k.a(eVar), cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i, boolean z, int i2, Handler handler, c cVar) {
        return d(context, j.a(eVar), i, z, i2, handler, cVar);
    }

    public static Typeface d(Context context, List list, int i, boolean z, int i2, Handler handler, c cVar) {
        Q1.a aVar = new Q1.a(cVar, m.b(handler));
        if (!z) {
            return i.d(context, list, i, null, aVar);
        }
        if (list.size() <= 1) {
            return i.e(context, (e) list.get(0), aVar, i, i2);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {
        public final int a;
        public final List b;

        public a(int i, b[] bVarArr) {
            this.a = i;
            this.b = Collections.singletonList(bVarArr);
        }

        public static a a(int i, List list) {
            return new a(i, list);
        }

        public static a b(int i, b[] bVarArr) {
            return new a(i, bVarArr);
        }

        public b[] c() {
            return (b[]) this.b.get(0);
        }

        public List d() {
            return this.b;
        }

        public int e() {
            return this.a;
        }

        public boolean f() {
            return this.b.size() > 1;
        }

        public a(int i, List list) {
            this.a = i;
            this.b = list;
        }
    }
}
