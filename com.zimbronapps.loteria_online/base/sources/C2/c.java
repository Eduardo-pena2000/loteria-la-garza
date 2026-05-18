package c2;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final boolean a(String str) {
            t.g(str, "jsonString");
            if (str.length() == 0) {
                return false;
            }
            try {
                new JSONObject(str);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public a() {
        }
    }
}
