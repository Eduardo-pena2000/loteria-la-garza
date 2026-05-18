package Q8;

import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class c {
    public final j a;
    public final j b;
    public final boolean c;
    public final f d;
    public final h e;

    public c(f fVar, h hVar, j jVar, j jVar2, boolean z) {
        this.d = fVar;
        this.e = hVar;
        this.a = jVar;
        if (jVar2 == null) {
            this.b = j.d;
        } else {
            this.b = jVar2;
        }
        this.c = z;
    }

    public static c a(f fVar, h hVar, j jVar, j jVar2, boolean z) {
        V8.g.d(fVar, "CreativeType is null");
        V8.g.d(hVar, "ImpressionType is null");
        V8.g.d(jVar, "Impression owner is null");
        V8.g.b(jVar, fVar, hVar);
        return new c(fVar, hVar, jVar, jVar2, z);
    }

    public boolean b() {
        return j.b == this.a;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        V8.c.i(jSONObject, "impressionOwner", this.a);
        V8.c.i(jSONObject, "mediaEventsOwner", this.b);
        V8.c.i(jSONObject, "creativeType", this.d);
        V8.c.i(jSONObject, "impressionType", this.e);
        V8.c.i(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.c));
        return jSONObject;
    }
}
