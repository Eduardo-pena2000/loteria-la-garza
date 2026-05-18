package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.p0;
import com.applovin.impl.r2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class r4 extends r2 {
    private final p0.a n;
    private final Context o;
    private final boolean p;

    public r4(p0.a aVar, boolean z, Context context) {
        super(r2.c.RIGHT_DETAIL);
        this.n = aVar;
        this.o = context;
        this.c = new SpannedString(aVar.a());
        this.p = z;
    }

    public SpannedString f() {
        return new SpannedString(this.n.a(this.o));
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        Boolean b = this.n.b(this.o);
        if (b != null) {
            return b.equals(Boolean.valueOf(this.p));
        }
        return false;
    }
}
