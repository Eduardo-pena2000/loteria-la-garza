package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class w {
    private final v6.d[] zaa;
    private final boolean zab;
    private final int zac;

    public static class a {
        public r a;
        public v6.d[] c;
        public boolean b = true;
        public int d = 0;

        public /* synthetic */ a(g0 g0Var) {
        }

        public static /* bridge */ /* synthetic */ r f(a aVar) {
            return aVar.a;
        }

        public w a() {
            com.google.android.gms.common.internal.t.b(this.a != null, "execute parameter required");
            return new f0(this, this.c, this.b, this.d);
        }

        public a b(r rVar) {
            this.a = rVar;
            return this;
        }

        public a c(boolean z) {
            this.b = z;
            return this;
        }

        public a d(v6.d... dVarArr) {
            this.c = dVarArr;
            return this;
        }

        public a e(int i) {
            this.d = i;
            return this;
        }
    }

    public w() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    public static a builder() {
        return new a(null);
    }

    public abstract void doExecute(a.b bVar, TaskCompletionSource taskCompletionSource);

    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    public final int zaa() {
        return this.zac;
    }

    public final v6.d[] zab() {
        return this.zaa;
    }

    public w(v6.d[] dVarArr, boolean z, int i) {
        this.zaa = dVarArr;
        boolean z2 = false;
        if (dVarArr != null && z) {
            z2 = true;
        }
        this.zab = z2;
        this.zac = i;
    }
}
