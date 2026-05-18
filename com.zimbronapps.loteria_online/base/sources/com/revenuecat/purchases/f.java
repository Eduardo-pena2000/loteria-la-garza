package com.revenuecat.purchases;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ PostPendingTransactionsHelper a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Qa.l d;

    public /* synthetic */ f(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z, Qa.l lVar) {
        this.a = postPendingTransactionsHelper;
        this.b = str;
        this.c = z;
        this.d = lVar;
    }

    public final void run() {
        PostPendingTransactionsHelper.a(this.a, this.b, this.c, this.d);
    }
}
