package b2;

import Z1.g;
import Z1.h;
import Za.B;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e extends h {
    public static final a e = new a(null);
    public final String d;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final h a(String str, String str2) {
            t.g(str, "type");
            try {
                if (B.N(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, (Object) null)) {
                    return d.g.a(str, str2);
                }
                throw new c2.b();
            } catch (c2.b unused) {
                return new g(str, str2);
            }
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, CharSequence charSequence) {
        super(str, charSequence);
        t.g(str, "type");
        this.d = str;
        if (a().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    public String a() {
        return this.d;
    }
}
