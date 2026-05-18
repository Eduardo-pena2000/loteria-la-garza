package com.google.android.gms.internal.drive;

import H6.p;
import I6.a;
import I6.b;
import I6.d;
import I6.n;
import I6.q;
import I6.s;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzeg extends zzir {
    private final Context zzgw;

    private zzeg(Looper looper, Context context) {
        super(looper);
        this.zzgw = context;
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            zzee.zzai().f("EventCallback", "Don't know how to handle this event in context %s", new Object[]{this.zzgw});
            return;
        }
        Pair pair = (Pair) message.obj;
        b bVar = (n) pair.first;
        s sVar = (d) pair.second;
        int type = sVar.getType();
        if (type == 1) {
            bVar.onChange((a) sVar);
            return;
        }
        if (type == 2) {
            android.support.v4.media.session.b.a(bVar);
            throw null;
        }
        if (type != 3) {
            if (type == 4) {
                android.support.v4.media.session.b.a(bVar);
                throw null;
            }
            if (type != 8) {
                zzee.zzai().k("EventCallback", "Unexpected event: %s", new Object[]{sVar});
                return;
            } else {
                new zze(sVar.M1());
                android.support.v4.media.session.b.a(bVar);
                throw null;
            }
        }
        android.support.v4.media.session.b.a(bVar);
        q qVar = (q) sVar;
        DataHolder O1 = qVar.O1();
        if (O1 != null) {
            new zzeh(new p(O1));
            throw null;
        }
        if (qVar.M1()) {
            qVar.N1();
            throw null;
        }
    }

    public /* synthetic */ zzeg(Looper looper, Context context, zzef zzefVar) {
        this(looper, context);
    }
}
