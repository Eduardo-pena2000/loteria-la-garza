package z1;

import java.util.HashMap;
import y1.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d extends y1.e {
    public float q0;
    public HashMap r0;
    public HashMap s0;
    public HashMap t0;
    public HashMap u0;
    public HashMap v0;
    public g.a w0;

    public d(y1.g gVar, g.d dVar) {
        super(gVar, dVar);
        this.q0 = 0.5f;
        this.r0 = new HashMap();
        this.s0 = new HashMap();
        this.t0 = new HashMap();
        this.w0 = g.a.SPREAD;
    }

    public float A0(String str) {
        HashMap hashMap = this.u0;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.u0.get(str)).floatValue();
    }

    public float B0(String str) {
        if (this.s0.containsKey(str)) {
            return ((Float) this.s0.get(str)).floatValue();
        }
        return 0.0f;
    }

    public float C0(String str) {
        if (this.r0.containsKey(str)) {
            return ((Float) this.r0.get(str)).floatValue();
        }
        return -1.0f;
    }

    public d D0(g.a aVar) {
        this.w0 = aVar;
        return this;
    }

    public void w0(Object obj, float f, float f2, float f3, float f4, float f5) {
        super.s0(obj);
        String obj2 = obj.toString();
        if (!Float.isNaN(f)) {
            this.r0.put(obj2, Float.valueOf(f));
        }
        if (!Float.isNaN(f2)) {
            this.s0.put(obj2, Float.valueOf(f2));
        }
        if (!Float.isNaN(f3)) {
            this.t0.put(obj2, Float.valueOf(f3));
        }
        if (!Float.isNaN(f4)) {
            if (this.u0 == null) {
                this.u0 = new HashMap();
            }
            this.u0.put(obj2, Float.valueOf(f4));
        }
        if (Float.isNaN(f5)) {
            return;
        }
        if (this.v0 == null) {
            this.v0 = new HashMap();
        }
        this.v0.put(obj2, Float.valueOf(f5));
    }

    public d x0(float f) {
        this.q0 = f;
        return this;
    }

    public float y0(String str) {
        HashMap hashMap = this.v0;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.v0.get(str)).floatValue();
    }

    public float z0(String str) {
        if (this.t0.containsKey(str)) {
            return ((Float) this.t0.get(str)).floatValue();
        }
        return 0.0f;
    }
}
