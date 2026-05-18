package e5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import kotlin.jvm.internal.t;
import okhttp3.Headers;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final f5.h d;
    public final f5.g e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final Headers j;
    public final r k;
    public final n l;
    public final b m;
    public final b n;
    public final b o;

    public m(Context context, Bitmap.Config config, ColorSpace colorSpace, f5.h hVar, f5.g gVar, boolean z, boolean z2, boolean z3, String str, Headers headers, r rVar, n nVar, b bVar, b bVar2, b bVar3) {
        this.a = context;
        this.b = config;
        this.c = colorSpace;
        this.d = hVar;
        this.e = gVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str;
        this.j = headers;
        this.k = rVar;
        this.l = nVar;
        this.m = bVar;
        this.n = bVar2;
        this.o = bVar3;
    }

    public static /* synthetic */ m b(m mVar, Context context, Bitmap.Config config, ColorSpace colorSpace, f5.h hVar, f5.g gVar, boolean z, boolean z2, boolean z3, String str, Headers headers, r rVar, n nVar, b bVar, b bVar2, b bVar3, int i, Object obj) {
        return mVar.a((i & 1) != 0 ? mVar.a : context, (i & 2) != 0 ? mVar.b : config, (i & 4) != 0 ? mVar.c : colorSpace, (i & 8) != 0 ? mVar.d : hVar, (i & 16) != 0 ? mVar.e : gVar, (i & 32) != 0 ? mVar.f : z, (i & 64) != 0 ? mVar.g : z2, (i & 128) != 0 ? mVar.h : z3, (i & 256) != 0 ? mVar.i : str, (i & 512) != 0 ? mVar.j : headers, (i & 1024) != 0 ? mVar.k : rVar, (i & 2048) != 0 ? mVar.l : nVar, (i & 4096) != 0 ? mVar.m : bVar, (i & 8192) != 0 ? mVar.n : bVar2, (i & 16384) != 0 ? mVar.o : bVar3);
    }

    public final m a(Context context, Bitmap.Config config, ColorSpace colorSpace, f5.h hVar, f5.g gVar, boolean z, boolean z2, boolean z3, String str, Headers headers, r rVar, n nVar, b bVar, b bVar2, b bVar3) {
        return new m(context, config, colorSpace, hVar, gVar, z, z2, z3, str, headers, rVar, nVar, bVar, bVar2, bVar3);
    }

    public final boolean c() {
        return this.f;
    }

    public final boolean d() {
        return this.g;
    }

    public final ColorSpace e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (t.c(this.a, mVar.a) && this.b == mVar.b && ((Build.VERSION.SDK_INT < 26 || t.c(this.c, mVar.c)) && t.c(this.d, mVar.d) && this.e == mVar.e && this.f == mVar.f && this.g == mVar.g && this.h == mVar.h && t.c(this.i, mVar.i) && t.c(this.j, mVar.j) && t.c(this.k, mVar.k) && t.c(this.l, mVar.l) && this.m == mVar.m && this.n == mVar.n && this.o == mVar.o)) {
                return true;
            }
        }
        return false;
    }

    public final Bitmap.Config f() {
        return this.b;
    }

    public final Context g() {
        return this.a;
    }

    public final String h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        ColorSpace colorSpace = this.c;
        int hashCode2 = (((((((((((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g)) * 31) + Boolean.hashCode(this.h)) * 31;
        String str = this.i;
        return ((((((((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode();
    }

    public final b i() {
        return this.n;
    }

    public final Headers j() {
        return this.j;
    }

    public final b k() {
        return this.o;
    }

    public final boolean l() {
        return this.h;
    }

    public final f5.g m() {
        return this.e;
    }

    public final f5.h n() {
        return this.d;
    }

    public final r o() {
        return this.k;
    }
}
