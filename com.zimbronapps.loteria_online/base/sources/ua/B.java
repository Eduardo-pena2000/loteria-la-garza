package Ua;

import java.util.Random;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class b extends Ua.a {
    public final a c = new a();

    public static final class a extends ThreadLocal {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    public Random g() {
        Object obj = this.c.get();
        t.f(obj, "get(...)");
        return (Random) obj;
    }
}
