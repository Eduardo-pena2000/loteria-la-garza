package M2;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u {
    public static final u i = new c().a();
    public static final String j = P2.K.w0(0);
    public static final String k = P2.K.w0(1);
    public static final String l = P2.K.w0(2);
    public static final String m = P2.K.w0(3);
    public static final String n = P2.K.w0(4);
    public static final String o = P2.K.w0(5);
    public final String a;
    public final h b;
    public final h c;
    public final g d;
    public final w e;
    public final d f;
    public final e g;
    public final i h;

    public static final class b {
    }

    public static final class c {
        public String a;
        public Uri b;
        public String c;
        public d.a d;
        public f.a e;
        public List f;
        public String g;
        public t7.r h;
        public Object i;
        public long j;
        public w k;
        public g.a l;
        public i m;

        public /* synthetic */ c(u uVar, a aVar) {
            this(uVar);
        }

        public u a() {
            h hVar;
            P2.a.f(f.a.e(this.e) == null || f.a.f(this.e) != null);
            Uri uri = this.b;
            if (uri != null) {
                hVar = new h(uri, this.c, f.a.f(this.e) != null ? this.e.i() : null, null, this.f, this.g, this.h, this.i, this.j, null);
            } else {
                hVar = null;
            }
            String str = this.a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e g = this.d.g();
            g f = this.l.f();
            w wVar = this.k;
            if (wVar == null) {
                wVar = w.H;
            }
            return new u(str2, g, hVar, f, wVar, this.m, null);
        }

        public c b(String str) {
            this.a = (String) P2.a.e(str);
            return this;
        }

        public c c(String str) {
            this.c = str;
            return this;
        }

        public c d(Object obj) {
            this.i = obj;
            return this;
        }

        public c e(Uri uri) {
            this.b = uri;
            return this;
        }

        public c() {
            this.d = new d.a();
            this.e = new f.a((a) null);
            this.f = Collections.emptyList();
            this.h = t7.r.s();
            this.l = new g.a();
            this.m = i.d;
            this.j = -9223372036854775807L;
        }

        public c(u uVar) {
            f.a aVar;
            this();
            this.d = uVar.f.a();
            this.a = uVar.a;
            this.k = uVar.e;
            this.l = uVar.d.a();
            this.m = uVar.h;
            h hVar = uVar.b;
            if (hVar != null) {
                this.g = hVar.e;
                this.c = hVar.b;
                this.b = hVar.a;
                this.f = hVar.d;
                this.h = hVar.f;
                this.i = hVar.h;
                f fVar = hVar.c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a((a) null);
                }
                this.e = aVar;
                this.j = hVar.i;
            }
        }
    }

    public static class d {
        public static final d h = new a().f();
        public static final String i = P2.K.w0(0);
        public static final String j = P2.K.w0(1);
        public static final String k = P2.K.w0(2);
        public static final String l = P2.K.w0(3);
        public static final String m = P2.K.w0(4);
        public static final String n = P2.K.w0(5);
        public static final String o = P2.K.w0(6);
        public final long a;
        public final long b;
        public final long c;
        public final long d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public static final class a {
            public long a;
            public long b;
            public boolean c;
            public boolean d;
            public boolean e;

            public /* synthetic */ a(d dVar, a aVar) {
                this(dVar);
            }

            public static /* synthetic */ long a(a aVar) {
                return aVar.a;
            }

            public static /* synthetic */ long b(a aVar) {
                return aVar.b;
            }

            public static /* synthetic */ boolean c(a aVar) {
                return aVar.c;
            }

            public static /* synthetic */ boolean d(a aVar) {
                return aVar.d;
            }

            public static /* synthetic */ boolean e(a aVar) {
                return aVar.e;
            }

            public d f() {
                return new d(this, null);
            }

            public e g() {
                return new e(this, null);
            }

            public a() {
                this.b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.a = dVar.b;
                this.b = dVar.d;
                this.c = dVar.e;
                this.d = dVar.f;
                this.e = dVar.g;
            }
        }

        public /* synthetic */ d(a aVar, a aVar2) {
            this(aVar);
        }

        public a a() {
            return new a(this, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g;
        }

        public int hashCode() {
            long j2 = this.b;
            int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            long j3 = this.d;
            return ((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
        }

        public d(a aVar) {
            this.a = P2.K.j1(a.a(aVar));
            this.c = P2.K.j1(a.b(aVar));
            this.b = a.a(aVar);
            this.d = a.b(aVar);
            this.e = a.c(aVar);
            this.f = a.d(aVar);
            this.g = a.e(aVar);
        }
    }

    public static final class e extends d {
        public static final e p = new d.a().g();

        public /* synthetic */ e(d.a aVar, a aVar2) {
            this(aVar);
        }

        public e(d.a aVar) {
            super(aVar, null);
        }
    }

    public static final class f {
        public static final String l = P2.K.w0(0);
        public static final String m = P2.K.w0(1);
        public static final String n = P2.K.w0(2);
        public static final String o = P2.K.w0(3);
        public static final String p = P2.K.w0(4);
        public static final String q = P2.K.w0(5);
        public static final String r = P2.K.w0(6);
        public static final String s = P2.K.w0(7);
        public final UUID a;
        public final UUID b;
        public final Uri c;
        public final t7.s d;
        public final t7.s e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final t7.r i;
        public final t7.r j;
        public final byte[] k;

        public static final class a {
            public UUID a;
            public Uri b;
            public t7.s c;
            public boolean d;
            public boolean e;
            public boolean f;
            public t7.r g;
            public byte[] h;

            public /* synthetic */ a(a aVar) {
                this();
            }

            public static /* synthetic */ boolean a(a aVar) {
                return aVar.d;
            }

            public static /* synthetic */ boolean b(a aVar) {
                return aVar.e;
            }

            public static /* synthetic */ t7.r c(a aVar) {
                return aVar.g;
            }

            public static /* synthetic */ byte[] d(a aVar) {
                return aVar.h;
            }

            public static /* synthetic */ Uri e(a aVar) {
                return aVar.b;
            }

            public static /* synthetic */ UUID f(a aVar) {
                return aVar.a;
            }

            public static /* synthetic */ boolean g(a aVar) {
                return aVar.f;
            }

            public static /* synthetic */ t7.s h(a aVar) {
                return aVar.c;
            }

            public f i() {
                return new f(this, null);
            }

            public /* synthetic */ a(f fVar, a aVar) {
                this(fVar);
            }

            public a() {
                this.c = t7.s.o();
                this.e = true;
                this.g = t7.r.s();
            }

            public a(f fVar) {
                this.a = fVar.a;
                this.b = fVar.c;
                this.c = fVar.e;
                this.d = fVar.f;
                this.e = fVar.g;
                this.f = fVar.h;
                this.g = fVar.j;
                this.h = f.a(fVar);
            }
        }

        public /* synthetic */ f(a aVar, a aVar2) {
            this(aVar);
        }

        public static /* synthetic */ byte[] a(f fVar) {
            return fVar.k;
        }

        public a b() {
            return new a(this, null);
        }

        public byte[] c() {
            byte[] bArr = this.k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && P2.K.c(this.c, fVar.c) && P2.K.c(this.e, fVar.e) && this.f == fVar.f && this.h == fVar.h && this.g == fVar.g && this.j.equals(fVar.j) && Arrays.equals(this.k, fVar.k);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Uri uri = this.c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + (this.f ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + this.j.hashCode()) * 31) + Arrays.hashCode(this.k);
        }

        public f(a aVar) {
            P2.a.f((a.g(aVar) && a.e(aVar) == null) ? false : true);
            UUID uuid = (UUID) P2.a.e(a.f(aVar));
            this.a = uuid;
            this.b = uuid;
            this.c = a.e(aVar);
            this.d = a.h(aVar);
            this.e = a.h(aVar);
            this.f = a.a(aVar);
            this.h = a.g(aVar);
            this.g = a.b(aVar);
            this.i = a.c(aVar);
            this.j = a.c(aVar);
            this.k = a.d(aVar) != null ? Arrays.copyOf(a.d(aVar), a.d(aVar).length) : null;
        }
    }

    public static final class g {
        public static final g f = new a().f();
        public static final String g = P2.K.w0(0);
        public static final String h = P2.K.w0(1);
        public static final String i = P2.K.w0(2);
        public static final String j = P2.K.w0(3);
        public static final String k = P2.K.w0(4);
        public final long a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;

        public static final class a {
            public long a;
            public long b;
            public long c;
            public float d;
            public float e;

            public /* synthetic */ a(g gVar, a aVar) {
                this(gVar);
            }

            public static /* synthetic */ long a(a aVar) {
                return aVar.a;
            }

            public static /* synthetic */ long b(a aVar) {
                return aVar.b;
            }

            public static /* synthetic */ long c(a aVar) {
                return aVar.c;
            }

            public static /* synthetic */ float d(a aVar) {
                return aVar.d;
            }

            public static /* synthetic */ float e(a aVar) {
                return aVar.e;
            }

            public g f() {
                return new g(this, null);
            }

            public a g(long j) {
                this.c = j;
                return this;
            }

            public a h(float f) {
                this.e = f;
                return this;
            }

            public a i(long j) {
                this.b = j;
                return this;
            }

            public a j(float f) {
                this.d = f;
                return this;
            }

            public a k(long j) {
                this.a = j;
                return this;
            }

            public a() {
                this.a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.a = gVar.a;
                this.b = gVar.b;
                this.c = gVar.c;
                this.d = gVar.d;
                this.e = gVar.e;
            }
        }

        public /* synthetic */ g(a aVar, a aVar2) {
            this(aVar);
        }

        public a a() {
            return new a(this, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && this.e == gVar.e;
        }

        public int hashCode() {
            long j2 = this.a;
            long j3 = this.b;
            int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.c;
            int i3 = (i2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
            float f2 = this.d;
            int floatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.e;
            return floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
        }

        public g(a aVar) {
            this(a.a(aVar), a.b(aVar), a.c(aVar), a.d(aVar), a.e(aVar));
        }

        public g(long j2, long j3, long j4, float f2, float f3) {
            this.a = j2;
            this.b = j3;
            this.c = j4;
            this.d = f2;
            this.e = f3;
        }
    }

    public static final class h {
        public static final String j = P2.K.w0(0);
        public static final String k = P2.K.w0(1);
        public static final String l = P2.K.w0(2);
        public static final String m = P2.K.w0(3);
        public static final String n = P2.K.w0(4);
        public static final String o = P2.K.w0(5);
        public static final String p = P2.K.w0(6);
        public static final String q = P2.K.w0(7);
        public final Uri a;
        public final String b;
        public final f c;
        public final List d;
        public final String e;
        public final t7.r f;
        public final List g;
        public final Object h;
        public final long i;

        public /* synthetic */ h(Uri uri, String str, f fVar, b bVar, List list, String str2, t7.r rVar, Object obj, long j2, a aVar) {
            this(uri, str, fVar, bVar, list, str2, rVar, obj, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a.equals(hVar.a) && P2.K.c(this.b, hVar.b) && P2.K.c(this.c, hVar.c) && P2.K.c(null, null) && this.d.equals(hVar.d) && P2.K.c(this.e, hVar.e) && this.f.equals(hVar.f) && P2.K.c(this.h, hVar.h) && P2.K.c(Long.valueOf(this.i), Long.valueOf(hVar.i));
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.c;
            int hashCode3 = (((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 961) + this.d.hashCode()) * 31;
            String str2 = this.e;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f.hashCode()) * 31;
            return (int) (((hashCode4 + (this.h != null ? r1.hashCode() : 0)) * 31) + this.i);
        }

        public h(Uri uri, String str, f fVar, b bVar, List list, String str2, t7.r rVar, Object obj, long j2) {
            this.a = uri;
            this.b = y.t(str);
            this.c = fVar;
            this.d = list;
            this.e = str2;
            this.f = rVar;
            r.a j3 = t7.r.j();
            for (int i = 0; i < rVar.size(); i++) {
                j3.h(k.a.a(((k) rVar.get(i)).a()));
            }
            this.g = j3.k();
            this.h = obj;
            this.i = j2;
        }
    }

    public static final class i {
        public static final i d = new a().d();
        public static final String e = P2.K.w0(0);
        public static final String f = P2.K.w0(1);
        public static final String g = P2.K.w0(2);
        public final Uri a;
        public final String b;
        public final Bundle c;

        public static final class a {
            public Uri a;
            public String b;
            public Bundle c;

            public static /* synthetic */ Uri a(a aVar) {
                return aVar.a;
            }

            public static /* synthetic */ String b(a aVar) {
                return aVar.b;
            }

            public static /* synthetic */ Bundle c(a aVar) {
                return aVar.c;
            }

            public i d() {
                return new i(this, null);
            }
        }

        public /* synthetic */ i(a aVar, a aVar2) {
            this(aVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (P2.K.c(this.a, iVar.a) && P2.K.c(this.b, iVar.b)) {
                if ((this.c == null) == (iVar.c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.b;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
        }

        public i(a aVar) {
            this.a = a.a(aVar);
            this.b = a.b(aVar);
            this.c = a.c(aVar);
        }
    }

    public static final class j extends k {
    }

    public static class k {

        public static final class a {
            public static /* synthetic */ j a(a aVar) {
                return aVar.b();
            }

            public abstract j b();
        }

        public abstract a a();
    }

    public /* synthetic */ u(String str, e eVar, h hVar, g gVar, w wVar, i iVar, a aVar) {
        this(str, eVar, hVar, gVar, wVar, iVar);
    }

    public c a() {
        return new c(this, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return P2.K.c(this.a, uVar.a) && this.f.equals(uVar.f) && P2.K.c(this.b, uVar.b) && P2.K.c(this.d, uVar.d) && P2.K.c(this.e, uVar.e) && P2.K.c(this.h, uVar.h);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h hVar = this.b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + this.e.hashCode()) * 31) + this.h.hashCode();
    }

    public u(String str, e eVar, h hVar, g gVar, w wVar, i iVar) {
        this.a = str;
        this.b = hVar;
        this.c = hVar;
        this.d = gVar;
        this.e = wVar;
        this.f = eVar;
        this.g = eVar;
        this.h = iVar;
    }
}
