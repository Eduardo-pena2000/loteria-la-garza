package za;

import android.webkit.DownloadListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c0 extends R0 {

    public static class a implements DownloadListener {
        public final c0 a;

        public a(c0 c0Var) {
            this.a = c0Var;
        }

        public static /* synthetic */ Ca.I a(Ca.s sVar) {
            return c(sVar);
        }

        public static /* synthetic */ void b(a aVar, String str, String str2, String str3, String str4, long j) {
            aVar.d(str, str2, str3, str4, j);
        }

        public static /* synthetic */ Ca.I c(Ca.s sVar) {
            return null;
        }

        public final /* synthetic */ void d(String str, String str2, String str3, String str4, long j) {
            this.a.c(this, str, str2, str3, str4, j, new b0());
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            this.a.b().R(new a0(this, str, str2, str3, str4, j));
        }
    }

    public c0(R3 r3) {
        super(r3);
    }

    public DownloadListener e() {
        return new a(this);
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public R3 b() {
        return (R3) super.b();
    }
}
