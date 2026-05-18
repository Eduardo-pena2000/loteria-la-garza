package com.revenuecat.purchases.ui.revenuecatui.composables;

import O0.Y;
import P0.N0;
import Qa.l;
import Qa.p;
import androidx.compose.ui.e;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class PlaceholderElement extends Y {
    private Placeholder placeholder;

    public PlaceholderElement(Placeholder placeholder) {
        t.g(placeholder, "placeholder");
        this.placeholder = placeholder;
    }

    public static /* synthetic */ PlaceholderElement copy$default(PlaceholderElement placeholderElement, Placeholder placeholder, int i, Object obj) {
        if ((i & 1) != 0) {
            placeholder = placeholderElement.placeholder;
        }
        return placeholderElement.copy(placeholder);
    }

    public /* bridge */ /* synthetic */ boolean all(l lVar) {
        return super/*androidx.compose.ui.e.b*/.all(lVar);
    }

    public /* bridge */ /* synthetic */ boolean any(l lVar) {
        return super/*androidx.compose.ui.e.b*/.any(lVar);
    }

    public final Placeholder component1() {
        return this.placeholder;
    }

    public final PlaceholderElement copy(Placeholder placeholder) {
        t.g(placeholder, "placeholder");
        return new PlaceholderElement(placeholder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlaceholderElement) && t.c(this.placeholder, ((PlaceholderElement) obj).placeholder);
    }

    public /* bridge */ /* synthetic */ Object foldIn(Object obj, p pVar) {
        return super/*androidx.compose.ui.e.b*/.foldIn(obj, pVar);
    }

    public /* bridge */ /* synthetic */ Object foldOut(Object obj, p pVar) {
        return super/*androidx.compose.ui.e.b*/.foldOut(obj, pVar);
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        return this.placeholder.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        t.g(n0, "<this>");
        n0.d("placeholder");
        n0.b().c("placeholder", this.placeholder);
        n0.b().c("loadingDescription", "Loading..");
    }

    public final void setPlaceholder(Placeholder placeholder) {
        t.g(placeholder, "<set-?>");
        this.placeholder = placeholder;
    }

    public /* bridge */ /* synthetic */ e then(e eVar) {
        return super/*androidx.compose.ui.e*/.then(eVar);
    }

    public String toString() {
        return "PlaceholderElement(placeholder=" + this.placeholder + ')';
    }

    public PlaceholderNode create() {
        return new PlaceholderNode(this.placeholder);
    }

    public void update(PlaceholderNode node) {
        t.g(node, "node");
        node.setPlaceholder(this.placeholder);
    }
}
