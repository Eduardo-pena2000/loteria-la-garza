package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Ca.o;
import Qa.l;
import U4.b;
import com.revenuecat.purchases.ui.revenuecatui.composables.ImageSource;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RemoteImageKt$AsyncImage$1$1 extends u implements l {
    final /* synthetic */ l $onError;
    final /* synthetic */ ImageSource $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteImageKt$AsyncImage$1$1(ImageSource imageSource, l lVar) {
        super(1);
        this.$source = imageSource;
        this.$onError = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((b.c.b) obj);
        return I.a;
    }

    public final void invoke(b.c.b it) {
        String str;
        t.g(it, "it");
        ImageSource imageSource = this.$source;
        if (imageSource instanceof ImageSource.Local) {
            str = "Error loading local image: '" + ((ImageSource.Local) this.$source).getResource() + '\'';
        } else {
            if (!(imageSource instanceof ImageSource.Remote)) {
                throw new o();
            }
            str = "Error loading image from '" + ((ImageSource.Remote) this.$source).getUrlString() + '\'';
        }
        Logger.INSTANCE.e(str, it.d().c());
        l lVar = this.$onError;
        if (lVar != null) {
            lVar.invoke(it);
        }
    }
}
