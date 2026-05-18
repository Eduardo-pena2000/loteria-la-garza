package com.unity3d.scar.adapter.common;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class m implements j {
    protected String _description;
    protected Object[] _errorArguments;
    private Enum _errorCategory;

    public m(Enum r1, String str, Object... objArr) {
        this._errorCategory = r1;
        this._description = str;
        this._errorArguments = objArr;
    }

    public int getCode() {
        return -1;
    }

    public String getDescription() {
        return this._description;
    }

    public abstract String getDomain();

    public Object[] getErrorArguments() {
        return this._errorArguments;
    }

    public Enum getErrorCategory() {
        return this._errorCategory;
    }
}
