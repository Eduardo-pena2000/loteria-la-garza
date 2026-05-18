package za;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class g0 extends Y0 {
    public g0(R3 r3) {
        super(r3);
    }

    public String b(f0 f0Var, String str) {
        return f0Var.a(str);
    }

    public f0 d() {
        return c().P();
    }

    public List e(f0 f0Var, String str) {
        try {
            String[] b = f0Var.b(str);
            return b == null ? new ArrayList() : Arrays.asList(b);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public R3 c() {
        return (R3) super.c();
    }
}
