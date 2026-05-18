package S5;

import L5.y;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m2 {
    public Bundle a = new Bundle();
    public List b = new ArrayList();
    public boolean c = false;
    public int d = -1;
    public final Bundle e = new Bundle();
    public final Bundle f = new Bundle();
    public final List g = new ArrayList();
    public int h = -1;
    public String i = null;
    public final List j = new ArrayList();
    public int k = 60000;
    public final int l = y.b.DEFAULT.a();
    public long m = 0;

    public final l2 a() {
        Bundle bundle = this.a;
        Bundle bundle2 = this.e;
        List list = this.b;
        boolean z = this.c;
        int i = this.d;
        int i2 = this.h;
        String str = this.i;
        List list2 = this.j;
        int i3 = this.l;
        return new l2(8, -1L, bundle, -1, list, z, i, false, null, null, null, null, bundle2, this.f, this.g, null, null, false, null, i2, str, list2, this.k, null, i3, this.m, 0L);
    }

    public final m2 b(Bundle bundle) {
        this.a = bundle;
        return this;
    }

    public final m2 c(List list) {
        this.b = list;
        return this;
    }

    public final m2 d(boolean z) {
        this.c = z;
        return this;
    }

    public final m2 e(int i) {
        this.d = i;
        return this;
    }

    public final m2 f(int i) {
        this.h = i;
        return this;
    }

    public final m2 g(String str) {
        this.i = str;
        return this;
    }

    public final m2 h(int i) {
        this.k = i;
        return this;
    }

    public final m2 i(long j) {
        this.m = j;
        return this;
    }
}
