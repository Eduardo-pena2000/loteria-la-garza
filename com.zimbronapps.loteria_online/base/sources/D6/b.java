package d6;

import com.google.android.gms.ads.AdRequest;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b {
    public final String a;
    public final L5.c b;
    public final AdRequest c;
    public final int d;

    public static class a {
        public final String a;
        public L5.c b;
        public AdRequest c = new AdRequest.Builder().o();
        public int d;

        public a(String str, L5.c cVar) {
            this.a = str;
            this.b = cVar;
        }

        public b a() {
            return new b(this, null);
        }

        public a b(AdRequest adRequest) {
            this.c = adRequest;
            return this;
        }

        public a c(int i) {
            this.d = i;
            return this;
        }

        public final /* synthetic */ String d() {
            return this.a;
        }

        public final /* synthetic */ L5.c e() {
            return this.b;
        }

        public final /* synthetic */ AdRequest f() {
            return this.c;
        }

        public final /* synthetic */ int g() {
            return this.d;
        }
    }

    public /* synthetic */ b(a aVar, byte[] bArr) {
        this.a = aVar.d();
        this.b = aVar.e();
        this.c = aVar.f();
        this.d = aVar.g();
    }

    public L5.c a() {
        L5.c cVar = this.b;
        return cVar == null ? L5.c.INTERSTITIAL : cVar;
    }

    public AdRequest b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public int d() {
        return this.d;
    }
}
