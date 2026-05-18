package e5;

import android.graphics.Bitmap;
import cb.K;
import i5.c;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d {
    public final androidx.lifecycle.k a;
    public final f5.i b;
    public final f5.g c;
    public final K d;
    public final K e;
    public final K f;
    public final K g;
    public final c.a h;
    public final f5.e i;
    public final Bitmap.Config j;
    public final Boolean k;
    public final Boolean l;
    public final b m;
    public final b n;
    public final b o;

    public d(androidx.lifecycle.k kVar, f5.i iVar, f5.g gVar, K k, K k2, K k3, K k4, c.a aVar, f5.e eVar, Bitmap.Config config, Boolean bool, Boolean bool2, b bVar, b bVar2, b bVar3) {
        this.a = kVar;
        this.b = iVar;
        this.c = gVar;
        this.d = k;
        this.e = k2;
        this.f = k3;
        this.g = k4;
        this.h = aVar;
        this.i = eVar;
        this.j = config;
        this.k = bool;
        this.l = bool2;
        this.m = bVar;
        this.n = bVar2;
        this.o = bVar3;
    }

    public final Boolean a() {
        return this.k;
    }

    public final Boolean b() {
        return this.l;
    }

    public final Bitmap.Config c() {
        return this.j;
    }

    public final K d() {
        return this.f;
    }

    public final b e() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (t.c(this.a, dVar.a) && t.c(this.b, dVar.b) && this.c == dVar.c && t.c(this.d, dVar.d) && t.c(this.e, dVar.e) && t.c(this.f, dVar.f) && t.c(this.g, dVar.g) && t.c(this.h, dVar.h) && this.i == dVar.i && this.j == dVar.j && t.c(this.k, dVar.k) && t.c(this.l, dVar.l) && this.m == dVar.m && this.n == dVar.n && this.o == dVar.o) {
                return true;
            }
        }
        return false;
    }

    public final K f() {
        return this.e;
    }

    public final K g() {
        return this.d;
    }

    public final androidx.lifecycle.k h() {
        return this.a;
    }

    public int hashCode() {
        androidx.lifecycle.k kVar = this.a;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        f5.i iVar = this.b;
        int hashCode2 = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        f5.g gVar = this.c;
        int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        K k = this.d;
        int hashCode4 = (hashCode3 + (k != null ? k.hashCode() : 0)) * 31;
        K k2 = this.e;
        int hashCode5 = (hashCode4 + (k2 != null ? k2.hashCode() : 0)) * 31;
        K k3 = this.f;
        int hashCode6 = (hashCode5 + (k3 != null ? k3.hashCode() : 0)) * 31;
        K k4 = this.g;
        int hashCode7 = (hashCode6 + (k4 != null ? k4.hashCode() : 0)) * 31;
        c.a aVar = this.h;
        int hashCode8 = (hashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        f5.e eVar = this.i;
        int hashCode9 = (hashCode8 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.j;
        int hashCode10 = (hashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.k;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.l;
        int hashCode12 = (hashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        b bVar = this.m;
        int hashCode13 = (hashCode12 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.n;
        int hashCode14 = (hashCode13 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        b bVar3 = this.o;
        return hashCode14 + (bVar3 != null ? bVar3.hashCode() : 0);
    }

    public final b i() {
        return this.m;
    }

    public final b j() {
        return this.o;
    }

    public final f5.e k() {
        return this.i;
    }

    public final f5.g l() {
        return this.c;
    }

    public final f5.i m() {
        return this.b;
    }

    public final K n() {
        return this.g;
    }

    public final c.a o() {
        return this.h;
    }
}
