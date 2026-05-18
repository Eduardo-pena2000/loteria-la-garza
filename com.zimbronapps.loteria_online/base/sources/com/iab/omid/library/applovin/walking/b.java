package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class b implements b.b {
    private JSONObject a;
    private final com.iab.omid.library.applovin.walking.async.c b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.b = cVar;
    }

    public JSONObject a() {
        return this.a;
    }

    public void b() {
        this.b.b(new d(this));
    }

    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }
}
