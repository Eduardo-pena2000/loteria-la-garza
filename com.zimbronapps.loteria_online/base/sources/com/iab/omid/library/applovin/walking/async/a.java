package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class a extends b {
    protected final HashSet c;
    protected final JSONObject d;
    protected final long e;

    public a(b.b bVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
