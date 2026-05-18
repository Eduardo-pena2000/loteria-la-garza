package com.google.android.gms.common.internal;

import android.content.ComponentName;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q0 {
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;

    public q0(String str, String str2, int i, boolean z) {
        t.f(str);
        this.a = str;
        t.f(str2);
        this.b = str2;
        this.c = null;
        this.d = 4225;
        this.e = z;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final ComponentName c() {
        return this.c;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return r.b(this.a, q0Var.a) && r.b(this.b, q0Var.b) && r.b(this.c, q0Var.c) && this.e == q0Var.e;
    }

    public final int hashCode() {
        return r.c(this.a, this.b, this.c, 4225, Boolean.valueOf(this.e));
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.c;
        t.l(componentName);
        return componentName.flattenToString();
    }
}
