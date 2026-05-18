package com.google.firebase.remoteconfig.internal;

import w8.s;
import w8.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class f implements s {
    public final long a;
    public final int b;
    public final u c;

    public static class b {
        public long a;
        public int b;
        public u c;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public f a() {
            return new f(this.a, this.b, this.c, null);
        }

        public b b(u uVar) {
            this.c = uVar;
            return this;
        }

        public b c(int i) {
            this.b = i;
            return this;
        }

        public b d(long j) {
            this.a = j;
            return this;
        }

        public b() {
        }
    }

    public /* synthetic */ f(long j, int i, u uVar, a aVar) {
        this(j, i, uVar);
    }

    public static b d() {
        return new b(null);
    }

    public long a() {
        return this.a;
    }

    public u b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public f(long j, int i, u uVar) {
        this.a = j;
        this.b = i;
        this.c = uVar;
    }
}
