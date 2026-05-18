package androidx.compose.ui.layout;

import androidx.compose.ui.layout.s;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements C {
    public final String b;
    public final C[] c;
    public final s d;
    public final s e;

    public e(String str, C[] cArr) {
        this.b = str;
        this.c = cArr;
        s.a aVar = s.a;
        ArrayList arrayList = new ArrayList(cArr.length);
        for (C c : cArr) {
            arrayList.add(c.a());
        }
        s[] sVarArr = (s[]) arrayList.toArray(new s[0]);
        this.d = t.b(aVar, (s[]) Arrays.copyOf(sVarArr, sVarArr.length));
        s.a aVar2 = s.a;
        C[] cArr2 = this.c;
        ArrayList arrayList2 = new ArrayList(cArr2.length);
        for (C c2 : cArr2) {
            arrayList2.add(c2.b());
        }
        s[] sVarArr2 = (s[]) arrayList2.toArray(new s[0]);
        this.e = t.b(aVar2, (s[]) Arrays.copyOf(sVarArr2, sVarArr2.length));
    }

    public s a() {
        return this.d;
    }

    public s b() {
        return this.e;
    }

    public String toString() {
        String str = this.b;
        return str == null ? Da.r.B0(this.c, (CharSequence) null, "innermostOf(", ")", 0, (CharSequence) null, (Qa.l) null, 57, (Object) null) : str;
    }
}
