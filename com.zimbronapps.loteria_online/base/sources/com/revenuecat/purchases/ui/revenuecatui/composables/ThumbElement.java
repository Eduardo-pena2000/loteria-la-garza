package com.revenuecat.purchases.ui.revenuecatui.composables;

import E.k;
import O0.H;
import O0.Y;
import P0.N0;
import Qa.l;
import Qa.p;
import androidx.compose.ui.e;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class ThumbElement extends Y {
    private final boolean checked;
    private final k interactionSource;

    public ThumbElement(k interactionSource, boolean z) {
        t.g(interactionSource, "interactionSource");
        this.interactionSource = interactionSource;
        this.checked = z;
    }

    public static /* synthetic */ ThumbElement copy$default(ThumbElement thumbElement, k kVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = thumbElement.interactionSource;
        }
        if ((i & 2) != 0) {
            z = thumbElement.checked;
        }
        return thumbElement.copy(kVar, z);
    }

    public /* bridge */ /* synthetic */ boolean all(l lVar) {
        return super/*androidx.compose.ui.e.b*/.all(lVar);
    }

    public /* bridge */ /* synthetic */ boolean any(l lVar) {
        return super/*androidx.compose.ui.e.b*/.any(lVar);
    }

    public final k component1() {
        return this.interactionSource;
    }

    public final boolean component2() {
        return this.checked;
    }

    public final ThumbElement copy(k interactionSource, boolean z) {
        t.g(interactionSource, "interactionSource");
        return new ThumbElement(interactionSource, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return t.c(this.interactionSource, thumbElement.interactionSource) && this.checked == thumbElement.checked;
    }

    public /* bridge */ /* synthetic */ Object foldIn(Object obj, p pVar) {
        return super/*androidx.compose.ui.e.b*/.foldIn(obj, pVar);
    }

    public /* bridge */ /* synthetic */ Object foldOut(Object obj, p pVar) {
        return super/*androidx.compose.ui.e.b*/.foldOut(obj, pVar);
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final k getInteractionSource() {
        return this.interactionSource;
    }

    public int hashCode() {
        return (this.interactionSource.hashCode() * 31) + Boolean.hashCode(this.checked);
    }

    public void inspectableProperties(N0 n0) {
        t.g(n0, "<this>");
        n0.d("switchThumb");
        n0.b().c("interactionSource", this.interactionSource);
        n0.b().c("checked", Boolean.valueOf(this.checked));
    }

    public /* bridge */ /* synthetic */ e then(e eVar) {
        return super/*androidx.compose.ui.e*/.then(eVar);
    }

    public String toString() {
        return "ThumbElement(interactionSource=" + this.interactionSource + ", checked=" + this.checked + ')';
    }

    public ThumbNode create() {
        return new ThumbNode(this.interactionSource, this.checked);
    }

    public void update(ThumbNode node) {
        t.g(node, "node");
        node.setInteractionSource(this.interactionSource);
        if (node.getChecked() != this.checked) {
            H.b(node);
        }
        node.setChecked(this.checked);
        node.update();
    }
}
