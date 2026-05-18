package com.revenuecat.purchases.ui.revenuecatui.composables;

import Qa.a;
import Qa.p;
import b0.C0;
import b0.T1;
import b0.U1;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SimpleSheetState {
    public static final int $stable = 0;
    private final C0 backgroundBlur$delegate;
    private final C0 content$delegate;
    private a onDismiss;
    private final C0 visible$delegate;

    public SimpleSheetState() {
        Boolean bool = Boolean.FALSE;
        this.backgroundBlur$delegate = U1.i(bool, (T1) null, 2, (Object) null);
        this.content$delegate = U1.i(ComposableSingletons$SimpleBottomSheetScaffoldKt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release(), (T1) null, 2, (Object) null);
        this.visible$delegate = U1.i(bool, (T1) null, 2, (Object) null);
    }

    private final void setBackgroundBlur(boolean z) {
        this.backgroundBlur$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setContent(p pVar) {
        this.content$delegate.setValue(pVar);
    }

    private final void setVisible(boolean z) {
        this.visible$delegate.setValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ void show$default(SimpleSheetState simpleSheetState, boolean z, p pVar, a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = null;
        }
        simpleSheetState.show(z, pVar, aVar);
    }

    public final /* synthetic */ boolean getBackgroundBlur() {
        return ((Boolean) this.backgroundBlur$delegate.getValue()).booleanValue();
    }

    public final /* synthetic */ p getContent() {
        return (p) this.content$delegate.getValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    public final void hide() {
        setBackgroundBlur(false);
        setVisible(false);
        a aVar = this.onDismiss;
        if (aVar != null) {
            aVar.invoke();
        }
        this.onDismiss = null;
    }

    public final void show(boolean z, p content, a aVar) {
        t.g(content, "content");
        setBackgroundBlur(z);
        setContent(content);
        this.onDismiss = aVar;
        setVisible(true);
    }
}
