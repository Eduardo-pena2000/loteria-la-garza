package k7;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class q2 extends h2 {
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public long h;
    public final long i;
    public final long j;
    public List k;
    public String l;
    public int m;
    public String n;
    public String o;
    public long p;
    public String q;

    public q2(q3 q3Var, long j, long j2) {
        super(q3Var);
        this.p = 0L;
        this.q = null;
        this.i = j;
        this.j = j2;
    }

    public final boolean m() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(1:3)(17:59|60|(1:62)(2:77|(1:79))|63|64|(4:66|(1:68)(1:75)|69|70)|5|(2:7|(2:9|(2:11|(2:13|(2:15|(2:17|(1:19)(1:52))(1:53))(1:54))(1:55))(1:56))(1:57))(1:58)|20|21|22|(1:24)(1:49)|25|(1:27)|29|(2:31|(1:33)(4:40|(3:43|(1:45)(1:46)|41)|47|48))(1:48)|(2:35|36)(2:38|39))|4|5|(0)(0)|20|21|22|(0)(0)|25|(0)|29|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019a, code lost:
    
        r11.a.a().o().c("Fetching Google App Id failed with exception. appId", k7.C2.x(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:22:0x016d, B:25:0x0183, B:27:0x0187), top: B:21:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.q2.n():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k7.n7 o(java.lang.String r50) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.q2.o(java.lang.String):k7.n7");
    }

    public final void p() {
        String format;
        h();
        q3 q3Var = this.a;
        if (q3Var.x().w().o(Z3.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            q3Var.C().q0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        } else {
            q3Var.a().v().a("Analytics Storage consent is not granted");
            format = null;
        }
        q3Var.a().v().a(String.format("Resetting session stitching token to %s", new Object[]{format == null ? "null" : "not null"}));
        this.o = format;
        this.p = q3Var.e().a();
    }

    public final String q() {
        j();
        com.google.android.gms.common.internal.t.l(this.c);
        return this.c;
    }

    public final String r() {
        h();
        j();
        com.google.android.gms.common.internal.t.l(this.n);
        return this.n;
    }

    public final String s() {
        j();
        com.google.android.gms.common.internal.t.l(this.g);
        return this.g;
    }

    public final int t() {
        j();
        return this.e;
    }

    public final long u() {
        return this.j;
    }

    public final int v() {
        j();
        return this.m;
    }

    public final List w() {
        return this.k;
    }

    public final boolean x(String str) {
        String str2 = this.q;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.q = str;
        return z;
    }
}
