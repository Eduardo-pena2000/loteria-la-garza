package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b extends RevokeAccessRequest.a {
    public List a;
    public Account b;
    public String c;

    public b() {
    }

    public final RevokeAccessRequest a() {
        if (this.a != null && this.b != null) {
            return new RevokeAccessRequest(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" scopes");
        }
        if (this.b == null) {
            sb.append(" account");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final RevokeAccessRequest.a b(Account account) {
        if (account == null) {
            throw new NullPointerException("Null account");
        }
        this.b = account;
        return this;
    }

    public final RevokeAccessRequest.a c(List list) {
        if (list == null) {
            throw new NullPointerException("Null scopes");
        }
        this.a = list;
        return this;
    }

    public final RevokeAccessRequest.a d(String str) {
        this.c = str;
        return this;
    }

    public b(RevokeAccessRequest revokeAccessRequest) {
        this.a = revokeAccessRequest.O1();
        this.b = revokeAccessRequest.N1();
        this.c = revokeAccessRequest.P1();
    }
}
