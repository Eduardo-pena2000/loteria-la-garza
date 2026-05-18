package p6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m extends n {
    public m(com.google.android.gms.common.api.h hVar) {
        super(hVar);
    }

    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        i iVar = (i) bVar;
        ((u) iVar.getService()).r1(new l(this), iVar.e());
    }

    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.m createFailedResult(Status status) {
        return status;
    }
}
