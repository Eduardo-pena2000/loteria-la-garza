package com.google.android.gms.ads;

import L5.a;
import S5.n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AdRequest {
    public final n1 a;

    public static class Builder extends a {
        public AdRequest o() {
            return new AdRequest(this);
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public Builder e() {
            return this;
        }
    }

    public AdRequest(a aVar) {
        this.a = new n1(aVar.a, null);
    }

    public final n1 a() {
        return this.a;
    }
}
