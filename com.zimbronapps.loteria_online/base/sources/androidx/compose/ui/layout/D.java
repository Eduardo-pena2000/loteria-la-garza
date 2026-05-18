package androidx.compose.ui.layout;

import androidx.compose.ui.layout.B;
import androidx.compose.ui.layout.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements s {
    public final s[] b;
    public final B c;
    public final c d;
    public final B e;
    public final c f;

    public d(s[] sVarArr) {
        this.b = sVarArr;
        B.a aVar = B.b;
        int length = sVarArr.length;
        B[] bArr = new B[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = this.b[i].a();
        }
        this.c = aVar.b(bArr);
        c.a aVar2 = c.b;
        int length2 = this.b.length;
        c[] cVarArr = new c[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            cVarArr[i2] = this.b[i2].b();
        }
        this.d = aVar2.a(cVarArr);
        B.a aVar3 = B.b;
        int length3 = this.b.length;
        B[] bArr2 = new B[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            bArr2[i3] = this.b[i3].c();
        }
        this.e = aVar3.c(bArr2);
        c.a aVar4 = c.b;
        int length4 = this.b.length;
        c[] cVarArr2 = new c[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            cVarArr2[i4] = this.b[i4].d();
        }
        this.f = aVar4.b(cVarArr2);
    }

    public B a() {
        return this.c;
    }

    public c b() {
        return this.d;
    }

    public B c() {
        return this.e;
    }

    public c d() {
        return this.f;
    }

    public String toString() {
        return Da.r.B0(this.b, (CharSequence) null, "innermostOf(", ")", 0, (CharSequence) null, (Qa.l) null, 57, (Object) null);
    }
}
