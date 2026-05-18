package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class p0 implements Parcelable.Creator {
    public static void a(h hVar, Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, hVar.a);
        y6.c.t(parcel, 2, hVar.b);
        y6.c.t(parcel, 3, hVar.c);
        y6.c.E(parcel, 4, hVar.d, false);
        y6.c.s(parcel, 5, hVar.e, false);
        y6.c.H(parcel, 6, hVar.f, i, false);
        y6.c.j(parcel, 7, hVar.g, false);
        y6.c.C(parcel, 8, hVar.h, i, false);
        y6.c.H(parcel, 10, hVar.i, i, false);
        y6.c.H(parcel, 11, hVar.j, i, false);
        y6.c.g(parcel, 12, hVar.k);
        y6.c.t(parcel, 13, hVar.l);
        y6.c.g(parcel, 14, hVar.m);
        y6.c.E(parcel, 15, hVar.M1(), false);
        y6.c.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        Scope[] scopeArr = h.o;
        Bundle bundle = new Bundle();
        v6.d[] dVarArr = h.p;
        v6.d[] dVarArr2 = dVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    i = y6.b.F(parcel, D);
                    break;
                case 2:
                    i2 = y6.b.F(parcel, D);
                    break;
                case 3:
                    i3 = y6.b.F(parcel, D);
                    break;
                case 4:
                    str = y6.b.q(parcel, D);
                    break;
                case 5:
                    iBinder = y6.b.E(parcel, D);
                    break;
                case 6:
                    scopeArr = (Scope[]) y6.b.t(parcel, D, Scope.CREATOR);
                    break;
                case 7:
                    bundle = y6.b.f(parcel, D);
                    break;
                case 8:
                    account = (Account) y6.b.p(parcel, D, Account.CREATOR);
                    break;
                case 9:
                default:
                    y6.b.L(parcel, D);
                    break;
                case 10:
                    dVarArr = (v6.d[]) y6.b.t(parcel, D, v6.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (v6.d[]) y6.b.t(parcel, D, v6.d.CREATOR);
                    break;
                case 12:
                    z = y6.b.x(parcel, D);
                    break;
                case 13:
                    i4 = y6.b.F(parcel, D);
                    break;
                case 14:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 15:
                    str2 = y6.b.q(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new h(i, i2, i3, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z, i4, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new h[i];
    }
}
