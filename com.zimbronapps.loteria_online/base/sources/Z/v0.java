package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface v0 {
    boolean a();

    long b(q qVar, q qVar2, q qVar3);

    q c(long j, q qVar, q qVar2, q qVar3);

    q e(long j, q qVar, q qVar2, q qVar3);

    default q g(q qVar, q qVar2, q qVar3) {
        return e(b(qVar, qVar2, qVar3), qVar, qVar2, qVar3);
    }
}
