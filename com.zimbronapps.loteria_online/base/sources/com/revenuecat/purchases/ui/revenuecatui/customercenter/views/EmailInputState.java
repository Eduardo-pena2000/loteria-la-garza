package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Qa.l;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class EmailInputState {
    private final String email;
    private final boolean enabled;
    private final l onEmailChange;
    private final l onFocusChanged;
    private final boolean showError;

    public EmailInputState(String email, l onEmailChange, l onFocusChanged, boolean z, boolean z2) {
        t.g(email, "email");
        t.g(onEmailChange, "onEmailChange");
        t.g(onFocusChanged, "onFocusChanged");
        this.email = email;
        this.onEmailChange = onEmailChange;
        this.onFocusChanged = onFocusChanged;
        this.showError = z;
        this.enabled = z2;
    }

    public static /* synthetic */ EmailInputState copy$default(EmailInputState emailInputState, String str, l lVar, l lVar2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailInputState.email;
        }
        if ((i & 2) != 0) {
            lVar = emailInputState.onEmailChange;
        }
        l lVar3 = lVar;
        if ((i & 4) != 0) {
            lVar2 = emailInputState.onFocusChanged;
        }
        l lVar4 = lVar2;
        if ((i & 8) != 0) {
            z = emailInputState.showError;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = emailInputState.enabled;
        }
        return emailInputState.copy(str, lVar3, lVar4, z3, z2);
    }

    public final String component1() {
        return this.email;
    }

    public final l component2() {
        return this.onEmailChange;
    }

    public final l component3() {
        return this.onFocusChanged;
    }

    public final boolean component4() {
        return this.showError;
    }

    public final boolean component5() {
        return this.enabled;
    }

    public final EmailInputState copy(String email, l onEmailChange, l onFocusChanged, boolean z, boolean z2) {
        t.g(email, "email");
        t.g(onEmailChange, "onEmailChange");
        t.g(onFocusChanged, "onFocusChanged");
        return new EmailInputState(email, onEmailChange, onFocusChanged, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailInputState)) {
            return false;
        }
        EmailInputState emailInputState = (EmailInputState) obj;
        return t.c(this.email, emailInputState.email) && t.c(this.onEmailChange, emailInputState.onEmailChange) && t.c(this.onFocusChanged, emailInputState.onFocusChanged) && this.showError == emailInputState.showError && this.enabled == emailInputState.enabled;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final l getOnEmailChange() {
        return this.onEmailChange;
    }

    public final l getOnFocusChanged() {
        return this.onFocusChanged;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public int hashCode() {
        return (((((((this.email.hashCode() * 31) + this.onEmailChange.hashCode()) * 31) + this.onFocusChanged.hashCode()) * 31) + Boolean.hashCode(this.showError)) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "EmailInputState(email=" + this.email + ", onEmailChange=" + this.onEmailChange + ", onFocusChanged=" + this.onFocusChanged + ", showError=" + this.showError + ", enabled=" + this.enabled + ')';
    }
}
