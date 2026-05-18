package com.google.android.gms.ads.nativead;

import L5.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final C e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;

    public static final class a {
        public C d;
        public boolean a = false;
        public int b = 0;
        public boolean c = false;
        public int e = 1;
        public boolean f = false;
        public boolean g = false;
        public int h = 0;
        public int i = 1;

        public b a() {
            return new b(this, null);
        }

        public a b(int i, boolean z) {
            this.g = z;
            this.h = i;
            return this;
        }

        public a c(int i) {
            this.e = i;
            return this;
        }

        public a d(int i) {
            this.b = i;
            return this;
        }

        public a e(boolean z) {
            this.f = z;
            return this;
        }

        public a f(boolean z) {
            this.c = z;
            return this;
        }

        public a g(boolean z) {
            this.a = z;
            return this;
        }

        public a h(C c) {
            this.d = c;
            return this;
        }

        public final /* synthetic */ boolean i() {
            return this.a;
        }

        public final /* synthetic */ int j() {
            return this.b;
        }

        public final /* synthetic */ boolean k() {
            return this.c;
        }

        public final /* synthetic */ C l() {
            return this.d;
        }

        public final /* synthetic */ int m() {
            return this.e;
        }

        public final /* synthetic */ boolean n() {
            return this.f;
        }

        public final /* synthetic */ boolean o() {
            return this.g;
        }

        public final /* synthetic */ int p() {
            return this.h;
        }

        public final a q(int i) {
            this.i = i;
            return this;
        }

        public final /* synthetic */ int r() {
            return this.i;
        }
    }

    public /* synthetic */ b(a aVar, byte[] bArr) {
        this.a = aVar.i();
        this.b = aVar.j();
        this.c = aVar.k();
        this.d = aVar.m();
        this.e = aVar.l();
        this.f = aVar.n();
        this.g = aVar.o();
        this.h = aVar.p();
        this.i = aVar.r();
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.b;
    }

    public C c() {
        return this.e;
    }

    public boolean d() {
        return this.c;
    }

    public boolean e() {
        return this.a;
    }

    public final boolean f() {
        return this.f;
    }

    public final int g() {
        return this.h;
    }

    public final boolean h() {
        return this.g;
    }

    public final int i() {
        return this.i;
    }
}
