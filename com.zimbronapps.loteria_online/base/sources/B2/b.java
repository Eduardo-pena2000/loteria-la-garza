package b2;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b extends Z1.e {
    public static final a e = new a(null);
    public final String d;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, CharSequence charSequence) {
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
