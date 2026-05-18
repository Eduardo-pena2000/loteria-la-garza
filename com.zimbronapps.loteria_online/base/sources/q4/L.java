package Q4;

import androidx.work.WorkerParameters;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class l implements Runnable {
    public H4.i a;
    public String b;
    public WorkerParameters.a c;

    public l(H4.i iVar, String str, WorkerParameters.a aVar) {
        this.a = iVar;
        this.b = str;
        this.c = aVar;
    }

    public void run() {
        this.a.m().k(this.b, this.c);
    }
}
