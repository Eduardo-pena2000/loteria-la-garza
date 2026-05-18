package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOptionKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidDeveloperConsentDataSource implements DeveloperConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage publicStorage;

    public AndroidDeveloperConsentDataSource(FlattenerRulesUseCase flattenerRulesUseCase, JsonStorage publicStorage) {
        t.g(flattenerRulesUseCase, "flattenerRulesUseCase");
        t.g(publicStorage, "publicStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.publicStorage = publicStorage;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentOption createDeveloperConsentOption(String str, boolean z) {
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DeveloperConsentOptionKt.Dsl _create = companion._create(newBuilder);
        _create.setType(getDeveloperConsentType(str));
        if (_create.getType() == DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM) {
            _create.setCustomType(str);
        }
        _create.setValue(getDeveloperConsentChoice(Boolean.valueOf(z)));
        return _create._build();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List developerConsentList() {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.json.JSONObject r1 = r9.fetchData()
            java.util.Iterator r2 = r1.keys()
            java.lang.String r3 = "data.keys()"
            kotlin.jvm.internal.t.f(r2, r3)
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.get(r3)
            boolean r5 = r4 instanceof java.lang.Boolean
            java.lang.String r6 = "storedValue"
            java.lang.String r7 = "key"
            if (r5 == 0) goto L3b
            kotlin.jvm.internal.t.f(r3, r7)
            kotlin.jvm.internal.t.f(r4, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption r3 = r9.createDeveloperConsentOption(r3, r4)
            goto L64
        L3b:
            boolean r5 = r4 instanceof java.lang.String
            r8 = 0
            if (r5 == 0) goto L57
            kotlin.jvm.internal.t.f(r4, r6)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "true"
            r6 = 1
            boolean r5 = Za.B.z(r4, r5, r6)
            if (r5 != 0) goto L59
            java.lang.String r5 = "false"
            boolean r5 = Za.B.z(r4, r5, r6)
            if (r5 == 0) goto L57
            goto L59
        L57:
            r3 = r8
            goto L64
        L59:
            kotlin.jvm.internal.t.f(r3, r7)
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption r3 = r9.createDeveloperConsentOption(r3, r4)
        L64:
            if (r3 == 0) goto L12
            r0.add(r3)
            goto L12
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.developerConsentList():java.util.List");
    }

    private final JSONObject fetchData() {
        if (this.publicStorage.getData() == null) {
            return new JSONObject();
        }
        JSONObject flattenJson = new JsonFlattener(this.publicStorage.getData()).flattenJson(".", this.flattenerRulesUseCase.invoke());
        t.f(flattenJson, "flattener.flattenJson(\".… flattenerRulesUseCase())");
        return flattenJson;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentChoice getDeveloperConsentChoice(Boolean bool) {
        return t.c(bool, Boolean.TRUE) ? DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_TRUE : t.c(bool, Boolean.FALSE) ? DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_FALSE : DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DeveloperConsentOuterClass.DeveloperConsentType getDeveloperConsentType(String str) {
        if (str == null) {
            return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
        }
        switch (str.hashCode()) {
            case -1998919769:
                if (str.equals("user.nonbehavioral")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case -1078801183:
                if (str.equals("pipl.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                }
                break;
            case -5454905:
                if (str.equals("user.nonBehavioral")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case 194451659:
                if (str.equals("gdpr.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                }
                break;
            case 519433140:
                if (str.equals("privacy.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                }
                break;
            case 2033752033:
                if (str.equals("privacy.useroveragelimit")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                }
                break;
        }
        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM;
    }

    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DeveloperConsentKt.Dsl _create = companion._create(newBuilder);
        _create.addAllOptions(_create.getOptions(), developerConsentList());
        return _create._build();
    }
}
