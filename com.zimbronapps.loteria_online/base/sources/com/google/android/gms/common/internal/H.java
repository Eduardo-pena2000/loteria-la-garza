package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class h extends y6.a {
    public static final Parcelable.Creator CREATOR = new p0();
    public static final Scope[] o = new Scope[0];
    public static final v6.d[] p = new v6.d[0];
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account h;
    public v6.d[] i;
    public v6.d[] j;
    public final boolean k;
    public final int l;
    public boolean m;
    public final String n;

    public h(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, v6.d[] dVarArr, v6.d[] dVarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? p : dVarArr;
        dVarArr2 = dVarArr2 == null ? p : dVarArr2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            this.h = iBinder != null ? a.r1(l.a.q1(iBinder)) : null;
        } else {
            this.e = iBinder;
            this.h = account;
        }
        this.f = scopeArr;
        this.g = bundle;
        this.i = dVarArr;
        this.j = dVarArr2;
        this.k = z;
        this.l = i4;
        this.m = z2;
        this.n = str2;
    }

    public String M1() {
        return this.n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        p0.a(this, parcel, i);
    }
}
