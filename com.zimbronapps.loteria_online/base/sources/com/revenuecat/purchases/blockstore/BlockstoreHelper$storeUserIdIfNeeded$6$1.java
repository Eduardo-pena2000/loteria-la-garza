package com.revenuecat.purchases.blockstore;

import Ca.I;
import Ca.s;
import Ga.e;
import Qa.l;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BlockstoreHelper$storeUserIdIfNeeded$6$1 extends u implements l {
    final /* synthetic */ e $cont;
    final /* synthetic */ String $userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockstoreHelper$storeUserIdIfNeeded$6$1(e eVar, String str) {
        super(1);
        this.$cont = eVar;
        this.$userId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Integer) obj);
        return I.a;
    }

    public final void invoke(Integer num) {
        String str = this.$userId;
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Block store: User ID: " + str + " stored in Block store.");
        }
        e eVar = this.$cont;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(I.a));
    }
}
