package com.google.android.gms.drive.query.internal;

import M6.c;
import M6.e;
import M6.i;
import M6.l;
import M6.n;
import M6.p;
import M6.r;
import M6.t;
import M6.v;
import M6.z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import y6.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class FilterHolder extends a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new i();
    public final c a;
    public final e b;
    public final r c;
    public final v d;
    public final p e;
    public final t f;
    public final n g;
    public final l h;
    public final z i;
    public final L6.a j;

    public FilterHolder(c cVar, e eVar, r rVar, v vVar, p pVar, t tVar, n nVar, l lVar, z zVar) {
        this.a = cVar;
        this.b = eVar;
        this.c = rVar;
        this.d = vVar;
        this.e = pVar;
        this.f = tVar;
        this.g = nVar;
        this.h = lVar;
        this.i = zVar;
        if (cVar != null) {
            this.j = cVar;
            return;
        }
        if (eVar != null) {
            this.j = eVar;
            return;
        }
        if (rVar != null) {
            this.j = rVar;
            return;
        }
        if (vVar != null) {
            this.j = vVar;
            return;
        }
        if (pVar != null) {
            this.j = pVar;
            return;
        }
        if (tVar != null) {
            this.j = tVar;
            return;
        }
        if (nVar != null) {
            this.j = nVar;
        } else if (lVar != null) {
            this.j = lVar;
        } else {
            if (zVar == null) {
                throw new IllegalArgumentException("At least one filter must be set.");
            }
            this.j = zVar;
        }
    }

    public final L6.a M1() {
        return this.j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 1, this.a, i, false);
        y6.c.C(parcel, 2, this.b, i, false);
        y6.c.C(parcel, 3, this.c, i, false);
        y6.c.C(parcel, 4, this.d, i, false);
        y6.c.C(parcel, 5, this.e, i, false);
        y6.c.C(parcel, 6, this.f, i, false);
        y6.c.C(parcel, 7, this.g, i, false);
        y6.c.C(parcel, 8, this.h, i, false);
        y6.c.C(parcel, 9, this.i, i, false);
        y6.c.b(parcel, a);
    }

    public FilterHolder(L6.a aVar) {
        com.google.android.gms.common.internal.t.m(aVar, "Null filter.");
        c cVar = aVar instanceof c ? (c) aVar : null;
        this.a = cVar;
        e eVar = aVar instanceof e ? (e) aVar : null;
        this.b = eVar;
        r rVar = aVar instanceof r ? (r) aVar : null;
        this.c = rVar;
        v vVar = aVar instanceof v ? (v) aVar : null;
        this.d = vVar;
        p pVar = aVar instanceof p ? (p) aVar : null;
        this.e = pVar;
        t tVar = aVar instanceof t ? (t) aVar : null;
        this.f = tVar;
        n nVar = aVar instanceof n ? (n) aVar : null;
        this.g = nVar;
        l lVar = aVar instanceof l ? (l) aVar : null;
        this.h = lVar;
        z zVar = aVar instanceof z ? (z) aVar : null;
        this.i = zVar;
        if (cVar == null && eVar == null && rVar == null && vVar == null && pVar == null && tVar == null && nVar == null && lVar == null && zVar == null) {
            throw new IllegalArgumentException("Invalid filter type.");
        }
        this.j = aVar;
    }
}
