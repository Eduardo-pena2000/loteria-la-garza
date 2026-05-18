package c7;

import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface g {

    public static final class a {
        public String a;
        public Long b;
        public Long c;
        public BitmapTeleporter d;
        public Uri e;

        public g a() {
            return new h(this.a, this.b, this.d, this.e, this.c);
        }

        public a b(e eVar) {
            this.a = eVar.getDescription();
            this.b = Long.valueOf(eVar.K0());
            this.c = Long.valueOf(eVar.O());
            if (this.b.longValue() == -1) {
                this.b = null;
            }
            Uri b0 = eVar.b0();
            this.e = b0;
            if (b0 != null) {
                this.d = null;
            }
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }
    }

    BitmapTeleporter zza();
}
