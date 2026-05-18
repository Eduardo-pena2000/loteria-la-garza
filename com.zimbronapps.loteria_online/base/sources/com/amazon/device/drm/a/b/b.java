package com.amazon.device.drm.a.b;

import android.content.Context;
import android.os.Handler;
import com.amazon.a.a.n.a.h;
import com.amazon.a.a.o.f;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.a.d;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b extends com.amazon.a.a.j.a {
    private static final String c = "b";
    private final RequestId d;

    public class 1 implements Runnable {
        final /* synthetic */ Object a;
        final /* synthetic */ LicensingListener b;

        public 1(Object obj, LicensingListener licensingListener) {
            this.a = obj;
            this.b = licensingListener;
        }

        public void run() {
            try {
                Object obj = this.a;
                if (obj instanceof LicenseResponse) {
                    this.b.onLicenseCommandResponse((LicenseResponse) obj);
                } else {
                    com.amazon.device.drm.a.e.b.b(b.f(), "Unknown response type:" + this.a.getClass().getName());
                }
            } catch (Throwable th) {
                com.amazon.device.drm.a.e.b.b(b.f(), "Error in sendResponse: " + th);
            }
        }
    }

    public b(RequestId requestId) {
        this.d = requestId;
    }

    public static /* synthetic */ String f() {
        return c;
    }

    public void a(h hVar) {
        this.b = hVar;
    }

    public void b() {
    }

    public void c() {
    }

    public RequestId d() {
        return this.d;
    }

    public void e() {
        h hVar = this.b;
        if (hVar != null) {
            hVar.l();
        } else {
            b();
        }
    }

    public void a(Object obj) {
        f.a(obj, "response");
        Context c2 = d.d().c();
        LicensingListener b = d.d().b();
        if (c2 != null && b != null) {
            new Handler(c2.getMainLooper()).post(new 1(obj, b));
            return;
        }
        com.amazon.device.drm.a.e.b.a(c, "LicensingListener is not set. Dropping response: " + obj);
    }

    public com.amazon.a.a.j.b a() {
        return this.a;
    }
}
