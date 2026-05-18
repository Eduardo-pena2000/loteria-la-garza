package T3;

import L3.s;
import O2.a;
import P2.K;
import P2.z;
import android.text.SpannedString;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements s {
    public final z a = new z();

    public static O2.a d(z zVar, int i) {
        SpannedString spannedString = null;
        a.b bVar = null;
        while (i > 0) {
            P2.a.b(i >= 8, "Incomplete vtt cue box header found.");
            int p = zVar.p();
            int p2 = zVar.p();
            int i2 = p - 8;
            String I = K.I(zVar.e(), zVar.f(), i2);
            zVar.U(i2);
            i = (i - 8) - i2;
            if (p2 == 1937011815) {
                bVar = e.o(I);
            } else if (p2 == 1885436268) {
                spannedString = e.q(null, I.trim(), Collections.emptyList());
            }
        }
        if (spannedString == null) {
            spannedString = "";
        }
        return bVar != null ? bVar.o(spannedString).a() : e.l(spannedString);
    }

    public void b(byte[] bArr, int i, int i2, s.b bVar, P2.g gVar) {
        this.a.R(bArr, i2 + i);
        this.a.T(i);
        ArrayList arrayList = new ArrayList();
        while (this.a.a() > 0) {
            P2.a.b(this.a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int p = this.a.p();
            if (this.a.p() == 1987343459) {
                arrayList.add(d(this.a, p - 8));
            } else {
                this.a.U(p - 8);
            }
        }
        gVar.accept(new L3.e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public int c() {
        return 2;
    }
}
