package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class DescriptionInputState {
    private final String description;
    private final boolean enabled;
    private final l onDescriptionChange;
    private final Qa.a onSubmit;
    private final boolean showDone;

    public static final class 1 extends u implements Qa.a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public DescriptionInputState(String description, l onDescriptionChange, boolean z, boolean z2, Qa.a onSubmit) {
        t.g(description, "description");
        t.g(onDescriptionChange, "onDescriptionChange");
        t.g(onSubmit, "onSubmit");
        this.description = description;
        this.onDescriptionChange = onDescriptionChange;
        this.enabled = z;
        this.showDone = z2;
        this.onSubmit = onSubmit;
    }

    public static /* synthetic */ DescriptionInputState copy$default(DescriptionInputState descriptionInputState, String str, l lVar, boolean z, boolean z2, Qa.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = descriptionInputState.description;
        }
        if ((i & 2) != 0) {
            lVar = descriptionInputState.onDescriptionChange;
        }
        l lVar2 = lVar;
        if ((i & 4) != 0) {
            z = descriptionInputState.enabled;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = descriptionInputState.showDone;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            aVar = descriptionInputState.onSubmit;
        }
        return descriptionInputState.copy(str, lVar2, z3, z4, aVar);
    }

    public final String component1() {
        return this.description;
    }

    public final l component2() {
        return this.onDescriptionChange;
    }

    public final boolean component3() {
        return this.enabled;
    }

    public final boolean component4() {
        return this.showDone;
    }

    public final Qa.a component5() {
        return this.onSubmit;
    }

    public final DescriptionInputState copy(String description, l onDescriptionChange, boolean z, boolean z2, Qa.a onSubmit) {
        t.g(description, "description");
        t.g(onDescriptionChange, "onDescriptionChange");
        t.g(onSubmit, "onSubmit");
        return new DescriptionInputState(description, onDescriptionChange, z, z2, onSubmit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescriptionInputState)) {
            return false;
        }
        DescriptionInputState descriptionInputState = (DescriptionInputState) obj;
        return t.c(this.description, descriptionInputState.description) && t.c(this.onDescriptionChange, descriptionInputState.onDescriptionChange) && this.enabled == descriptionInputState.enabled && this.showDone == descriptionInputState.showDone && t.c(this.onSubmit, descriptionInputState.onSubmit);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final l getOnDescriptionChange() {
        return this.onDescriptionChange;
    }

    public final Qa.a getOnSubmit() {
        return this.onSubmit;
    }

    public final boolean getShowDone() {
        return this.showDone;
    }

    public int hashCode() {
        return (((((((this.description.hashCode() * 31) + this.onDescriptionChange.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.showDone)) * 31) + this.onSubmit.hashCode();
    }

    public String toString() {
        return "DescriptionInputState(description=" + this.description + ", onDescriptionChange=" + this.onDescriptionChange + ", enabled=" + this.enabled + ", showDone=" + this.showDone + ", onSubmit=" + this.onSubmit + ')';
    }

    public /* synthetic */ DescriptionInputState(String str, l lVar, boolean z, boolean z2, Qa.a aVar, int i, k kVar) {
        this(str, lVar, z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? 1.INSTANCE : aVar);
    }
}
