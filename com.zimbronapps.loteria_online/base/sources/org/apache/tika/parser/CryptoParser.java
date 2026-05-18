package org.apache.tika.parser;

import java.io.IOException;
import java.io.InputStream;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import org.apache.tika.exception.EncryptedDocumentException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class CryptoParser extends DelegatingParser {
    private static final long serialVersionUID = -3507995752666557731L;
    private final Provider provider;
    private final String transformation;
    private final Set types;

    public CryptoParser(String str, Provider provider, Set set) {
        this.transformation = str;
        this.provider = provider;
        this.types = set;
    }

    public Set getSupportedTypes(ParseContext parseContext) {
        return this.types;
    }

    public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws IOException, SAXException, TikaException {
        try {
            Provider provider = this.provider;
            Cipher cipher = provider != null ? Cipher.getInstance(this.transformation, provider) : Cipher.getInstance(this.transformation);
            Key key = (Key) parseContext.get(Key.class);
            if (key == null) {
                throw new EncryptedDocumentException("No decryption key provided");
            }
            AlgorithmParameters algorithmParameters = (AlgorithmParameters) parseContext.get(AlgorithmParameters.class);
            SecureRandom secureRandom = (SecureRandom) parseContext.get(SecureRandom.class);
            if (algorithmParameters != null && secureRandom != null) {
                cipher.init(2, key, algorithmParameters, secureRandom);
            } else if (algorithmParameters != null) {
                cipher.init(2, key, algorithmParameters);
            } else if (secureRandom != null) {
                cipher.init(2, key, secureRandom);
            } else {
                cipher.init(2, key);
            }
            super.parse(new CipherInputStream(inputStream, cipher), contentHandler, metadata, parseContext);
        } catch (GeneralSecurityException e) {
            throw new TikaException("Unable to decrypt document stream", e);
        }
    }

    public CryptoParser(String str, Set set) {
        this(str, null, set);
    }
}
