// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AESFastEngine;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.engines.RC2Engine;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.modes.EAXBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.GOFBBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.modes.OpenPGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.PGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.paddings.ISO10126d2Padding;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.paddings.TBCPadding;
import org.bouncycastle.crypto.paddings.X923Padding;
import org.bouncycastle.crypto.paddings.ZeroBytePadding;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.RC5Parameters;
import org.bouncycastle.jce.spec.GOST28147ParameterSpec;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.jce.provider:
//            WrapCipherSpi, PBE, BouncyCastleProvider, JCEPBEKey

public class JCEBlockCipher extends WrapCipherSpi
    implements PBE
{
    public static class DES extends JCEBlockCipher
    {

        public DES()
        {
            super(new DESEngine());
        }
    }

    public static class DESCBC extends JCEBlockCipher
    {

        public DESCBC()
        {
            super(new CBCBlockCipher(new DESEngine()), 64);
        }
    }

    public static class GOST28147 extends JCEBlockCipher
    {

        public GOST28147()
        {
            super(new GOST28147Engine());
        }
    }

    public static class GOST28147cbc extends JCEBlockCipher
    {

        public GOST28147cbc()
        {
            super(new CBCBlockCipher(new GOST28147Engine()), 64);
        }
    }

    public static class PBEWithAESCBC extends JCEBlockCipher
    {

        public PBEWithAESCBC()
        {
            super(new CBCBlockCipher(new AESFastEngine()));
        }
    }

    public static class PBEWithMD5AndDES extends JCEBlockCipher
    {

        public PBEWithMD5AndDES()
        {
            super(new CBCBlockCipher(new DESEngine()));
        }
    }

    public static class PBEWithMD5AndRC2 extends JCEBlockCipher
    {

        public PBEWithMD5AndRC2()
        {
            super(new CBCBlockCipher(new RC2Engine()));
        }
    }

    public static class PBEWithSHA1AndDES extends JCEBlockCipher
    {

        public PBEWithSHA1AndDES()
        {
            super(new CBCBlockCipher(new DESEngine()));
        }
    }

    public static class PBEWithSHA1AndRC2 extends JCEBlockCipher
    {

        public PBEWithSHA1AndRC2()
        {
            super(new CBCBlockCipher(new RC2Engine()));
        }
    }

    public static class PBEWithSHAAnd128BitRC2 extends JCEBlockCipher
    {

        public PBEWithSHAAnd128BitRC2()
        {
            super(new CBCBlockCipher(new RC2Engine()));
        }
    }

    public static class PBEWithSHAAnd40BitRC2 extends JCEBlockCipher
    {

        public PBEWithSHAAnd40BitRC2()
        {
            super(new CBCBlockCipher(new RC2Engine()));
        }
    }

    public static class PBEWithSHAAndDES2Key extends JCEBlockCipher
    {

        public PBEWithSHAAndDES2Key()
        {
            super(new CBCBlockCipher(new DESedeEngine()));
        }
    }

    public static class PBEWithSHAAndDES3Key extends JCEBlockCipher
    {

        public PBEWithSHAAndDES3Key()
        {
            super(new CBCBlockCipher(new DESedeEngine()));
        }
    }

    public static class PBEWithSHAAndTwofish extends JCEBlockCipher
    {

        public PBEWithSHAAndTwofish()
        {
            super(new CBCBlockCipher(new TwofishEngine()));
        }
    }

    public static class RC2 extends JCEBlockCipher
    {

        public RC2()
        {
            super(new RC2Engine());
        }
    }

    public static class RC2CBC extends JCEBlockCipher
    {

        public RC2CBC()
        {
            super(new CBCBlockCipher(new RC2Engine()), 64);
        }
    }

    private static final class a
        implements c
    {

        private AEADBlockCipher a;

        public final int a(int i1)
        {
            return a.getOutputSize(i1);
        }

        public final int a(byte abyte0[], int i1)
        {
            return a.doFinal(abyte0, i1);
        }

        public final int a(byte abyte0[], int i1, int j1, byte abyte1[], int k1)
        {
            return a.processBytes(abyte0, i1, j1, abyte1, k1);
        }

        public final void a(boolean flag, CipherParameters cipherparameters)
        {
            a.init(flag, cipherparameters);
        }

        public final boolean a()
        {
            return false;
        }

        public final int b(int i1)
        {
            return a.getUpdateOutputSize(i1);
        }

        public final BlockCipher b()
        {
            return a.getUnderlyingCipher();
        }

        a(AEADBlockCipher aeadblockcipher)
        {
            a = aeadblockcipher;
        }
    }

    private static final class b
        implements c
    {

        private BufferedBlockCipher a;

        public final int a(int i1)
        {
            return a.getOutputSize(i1);
        }

        public final int a(byte abyte0[], int i1)
        {
            return a.doFinal(abyte0, i1);
        }

        public final int a(byte abyte0[], int i1, int j1, byte abyte1[], int k1)
        {
            return a.processBytes(abyte0, i1, j1, abyte1, k1);
        }

        public final void a(boolean flag, CipherParameters cipherparameters)
        {
            a.init(flag, cipherparameters);
        }

        public final boolean a()
        {
            return !(a instanceof CTSBlockCipher);
        }

        public final int b(int i1)
        {
            return a.getUpdateOutputSize(i1);
        }

        public final BlockCipher b()
        {
            return a.getUnderlyingCipher();
        }

        b(BlockCipher blockcipher)
        {
            a = new PaddedBufferedBlockCipher(blockcipher);
        }

        b(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
        {
            a = new PaddedBufferedBlockCipher(blockcipher, blockcipherpadding);
        }

        b(BufferedBlockCipher bufferedblockcipher)
        {
            a = bufferedblockcipher;
        }
    }

    private static interface c
    {

        public abstract int a(int i1);

        public abstract int a(byte abyte0[], int i1);

        public abstract int a(byte abyte0[], int i1, int j1, byte abyte1[], int k1);

        public abstract void a(boolean flag, CipherParameters cipherparameters);

        public abstract boolean a();

        public abstract int b(int i1);

        public abstract BlockCipher b();
    }


    private Class e[] = {
        javax/crypto/spec/RC2ParameterSpec, javax/crypto/spec/RC5ParameterSpec, javax/crypto/spec/IvParameterSpec, javax/crypto/spec/PBEParameterSpec, org/bouncycastle/jce/spec/GOST28147ParameterSpec
    };
    private BlockCipher f;
    private c g;
    private ParametersWithIV h;
    private int i;
    private boolean j;
    private PBEParameterSpec k;
    private String l;
    private String m;

    protected JCEBlockCipher(BlockCipher blockcipher)
    {
        i = 0;
        k = null;
        l = null;
        m = null;
        f = blockcipher;
        g = new b(blockcipher);
    }

    protected JCEBlockCipher(BlockCipher blockcipher, int i1)
    {
        i = 0;
        k = null;
        l = null;
        m = null;
        f = blockcipher;
        g = new b(blockcipher);
        i = i1 / 8;
    }

    protected JCEBlockCipher(BufferedBlockCipher bufferedblockcipher)
    {
        i = 0;
        k = null;
        l = null;
        m = null;
        f = bufferedblockcipher.getUnderlyingCipher();
        g = new b(bufferedblockcipher);
        i = 16;
    }

    private static boolean a(String s)
    {
        return "CCM".equals(s) || "EAX".equals(s) || "GCM".equals(s);
    }

    protected int engineDoFinal(byte abyte0[], int i1, int j1, byte abyte1[], int k1)
    {
        int l1 = 0;
        if (j1 != 0)
        {
            l1 = g.a(abyte0, i1, j1, abyte1, k1);
        }
        try
        {
            i1 = g.a(abyte1, k1 + l1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalBlockSizeException(abyte0.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        return l1 + i1;
    }

    protected byte[] engineDoFinal(byte abyte0[], int i1, int j1)
    {
        byte abyte1[] = new byte[engineGetOutputSize(j1)];
        if (j1 != 0)
        {
            i1 = g.a(abyte0, i1, j1, abyte1, 0);
        } else
        {
            i1 = 0;
        }
        try
        {
            j1 = g.a(abyte1, i1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalBlockSizeException(abyte0.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new BadPaddingException(abyte0.getMessage());
        }
        i1 = j1 + i1;
        if (i1 == abyte1.length)
        {
            return abyte1;
        } else
        {
            abyte0 = new byte[i1];
            System.arraycopy(abyte1, 0, abyte0, 0, i1);
            return abyte0;
        }
    }

    protected int engineGetBlockSize()
    {
        return f.getBlockSize();
    }

    protected byte[] engineGetIV()
    {
        if (h != null)
        {
            return h.getIV();
        } else
        {
            return null;
        }
    }

    protected int engineGetKeySize(Key key)
    {
        return key.getEncoded().length * 8;
    }

    protected int engineGetOutputSize(int i1)
    {
        return g.a(i1);
    }

    protected AlgorithmParameters engineGetParameters()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        if (k == null) goto _L4; else goto _L3
_L3:
        try
        {
            c = AlgorithmParameters.getInstance(l, BouncyCastleProvider.a);
            c.init(k);
        }
        catch (Exception exception)
        {
            return null;
        }
_L2:
        return c;
_L4:
        if (h != null)
        {
            String s1 = g.b().getAlgorithmName();
            String s = s1;
            if (s1.indexOf('/') >= 0)
            {
                s = s1.substring(0, s1.indexOf('/'));
            }
            try
            {
                c = AlgorithmParameters.getInstance(s, BouncyCastleProvider.a);
                c.init(h.getIV());
            }
            catch (Exception exception1)
            {
                throw new RuntimeException(exception1.toString());
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void engineInit(int i1, Key key, AlgorithmParameters algorithmparameters, SecureRandom securerandom)
    {
        if (algorithmparameters == null) goto _L2; else goto _L1
_L1:
        int j1 = 0;
_L4:
        if (j1 == e.length)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        Object obj = algorithmparameters.getParameterSpec(e[j1]);
_L5:
        Object obj1;
        obj1 = obj;
        if (obj == null)
        {
            throw new InvalidAlgorithmParameterException((new StringBuilder("can't handle parameter ")).append(algorithmparameters.toString()).toString());
        }
          goto _L3
        obj;
        j1++;
          goto _L4
_L2:
        obj1 = null;
_L3:
        engineInit(i1, key, ((AlgorithmParameterSpec) (obj1)), securerandom);
        c = algorithmparameters;
        return;
        obj = null;
          goto _L5
    }

    protected void engineInit(int i1, Key key, SecureRandom securerandom)
    {
        try
        {
            engineInit(i1, key, ((AlgorithmParameterSpec) (null)), securerandom);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new InvalidKeyException(key.getMessage());
        }
    }

    protected void engineInit(int i1, Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        k = null;
        l = null;
        c = null;
        if (!(key instanceof SecretKey))
        {
            throw new InvalidKeyException((new StringBuilder("Key for algorithm ")).append(key.getAlgorithm()).append(" not suitable for symmetric enryption.").toString());
        }
        if (algorithmparameterspec == null && f.getAlgorithmName().startsWith("RC5-64"))
        {
            throw new InvalidAlgorithmParameterException("RC5 requires an RC5ParametersSpec to be passed in.");
        }
        if (key instanceof JCEPBEKey)
        {
            JCEPBEKey jcepbekey = (JCEPBEKey)key;
            if (jcepbekey.b != null)
            {
                l = jcepbekey.b.e();
            } else
            {
                l = jcepbekey.getAlgorithm();
            }
            if (jcepbekey.g != null)
            {
                key = jcepbekey.g;
                k = new PBEParameterSpec(jcepbekey.getSalt(), jcepbekey.getIterationCount());
            } else
            if (algorithmparameterspec instanceof PBEParameterSpec)
            {
                k = (PBEParameterSpec)algorithmparameterspec;
                key = PBE.Util.a(jcepbekey, algorithmparameterspec, g.b().getAlgorithmName());
            } else
            {
                throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
            }
            if (key instanceof ParametersWithIV)
            {
                h = (ParametersWithIV)key;
            }
        } else
        if (algorithmparameterspec == null)
        {
            key = new KeyParameter(key.getEncoded());
        } else
        if (algorithmparameterspec instanceof IvParameterSpec)
        {
            if (i != 0)
            {
                algorithmparameterspec = (IvParameterSpec)algorithmparameterspec;
                if (algorithmparameterspec.getIV().length != i && !a(m))
                {
                    throw new InvalidAlgorithmParameterException((new StringBuilder("IV must be ")).append(i).append(" bytes long.").toString());
                }
                key = new ParametersWithIV(new KeyParameter(key.getEncoded()), algorithmparameterspec.getIV());
                h = (ParametersWithIV)key;
            } else
            {
                if (m != null && m.equals("ECB"))
                {
                    throw new InvalidAlgorithmParameterException("ECB mode does not use an IV");
                }
                key = new KeyParameter(key.getEncoded());
            }
        } else
        if (algorithmparameterspec instanceof GOST28147ParameterSpec)
        {
            GOST28147ParameterSpec gost28147parameterspec = (GOST28147ParameterSpec)algorithmparameterspec;
            key = new ParametersWithSBox(new KeyParameter(key.getEncoded()), ((GOST28147ParameterSpec)algorithmparameterspec).a());
            if (gost28147parameterspec.b() != null && i != 0)
            {
                key = new ParametersWithIV(key, gost28147parameterspec.b());
                h = (ParametersWithIV)key;
            }
        } else
        if (algorithmparameterspec instanceof RC2ParameterSpec)
        {
            RC2ParameterSpec rc2parameterspec = (RC2ParameterSpec)algorithmparameterspec;
            key = new RC2Parameters(key.getEncoded(), ((RC2ParameterSpec)algorithmparameterspec).getEffectiveKeyBits());
            if (rc2parameterspec.getIV() != null && i != 0)
            {
                key = new ParametersWithIV(key, rc2parameterspec.getIV());
                h = (ParametersWithIV)key;
            }
        } else
        if (algorithmparameterspec instanceof RC5ParameterSpec)
        {
            RC5ParameterSpec rc5parameterspec = (RC5ParameterSpec)algorithmparameterspec;
            key = new RC5Parameters(key.getEncoded(), ((RC5ParameterSpec)algorithmparameterspec).getRounds());
            if (f.getAlgorithmName().startsWith("RC5"))
            {
                if (f.getAlgorithmName().equals("RC5-32"))
                {
                    if (rc5parameterspec.getWordSize() != 32)
                    {
                        throw new InvalidAlgorithmParameterException((new StringBuilder("RC5 already set up for a word size of 32 not ")).append(rc5parameterspec.getWordSize()).append(".").toString());
                    }
                } else
                if (f.getAlgorithmName().equals("RC5-64") && rc5parameterspec.getWordSize() != 64)
                {
                    throw new InvalidAlgorithmParameterException((new StringBuilder("RC5 already set up for a word size of 64 not ")).append(rc5parameterspec.getWordSize()).append(".").toString());
                }
            } else
            {
                throw new InvalidAlgorithmParameterException("RC5 parameters passed to a cipher that is not RC5.");
            }
            if (rc5parameterspec.getIV() != null && i != 0)
            {
                key = new ParametersWithIV(key, rc5parameterspec.getIV());
                h = (ParametersWithIV)key;
            }
        } else
        {
            throw new InvalidAlgorithmParameterException("unknown parameter type.");
        }
_L9:
        if (i == 0 || (key instanceof ParametersWithIV)) goto _L2; else goto _L1
_L1:
        if (securerandom == null)
        {
            algorithmparameterspec = new SecureRandom();
        } else
        {
            algorithmparameterspec = securerandom;
        }
        if (i1 != 1 && i1 != 3) goto _L4; else goto _L3
_L3:
        jcepbekey = new byte[i];
        algorithmparameterspec.nextBytes(jcepbekey);
        key = new ParametersWithIV(key, jcepbekey);
        h = (ParametersWithIV)key;
_L2:
        if (securerandom != null && j)
        {
            key = new ParametersWithRandom(key, securerandom);
        }
        i1;
        JVM INSTR tableswitch 1 4: default 300
    //                   1 1015
    //                   2 1027
    //                   3 1015
    //                   4 1027;
           goto _L5 _L6 _L7 _L6 _L7
_L5:
        try
        {
            throw new InvalidParameterException((new StringBuilder("unknown opmode ")).append(i1).append(" passed").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new InvalidKeyException(key.getMessage());
        }
_L4:
        if (g.b().getAlgorithmName().indexOf("PGPCFB") >= 0) goto _L2; else goto _L8
_L8:
        throw new InvalidAlgorithmParameterException("no IV set when one expected");
_L6:
        g.a(true, key);
        return;
_L7:
        g.a(false, key);
        return;
          goto _L9
    }

    protected void engineSetMode(String s)
    {
        m = Strings.b(s);
        if (m.equals("ECB"))
        {
            i = 0;
            g = new b(f);
            return;
        }
        if (m.equals("CBC"))
        {
            i = f.getBlockSize();
            g = new b(new CBCBlockCipher(f));
            return;
        }
        if (m.startsWith("OFB"))
        {
            i = f.getBlockSize();
            if (m.length() != 3)
            {
                int i1 = Integer.parseInt(m.substring(3));
                g = new b(new OFBBlockCipher(f, i1));
                return;
            } else
            {
                g = new b(new OFBBlockCipher(f, f.getBlockSize() * 8));
                return;
            }
        }
        if (m.startsWith("CFB"))
        {
            i = f.getBlockSize();
            if (m.length() != 3)
            {
                int j1 = Integer.parseInt(m.substring(3));
                g = new b(new CFBBlockCipher(f, j1));
                return;
            } else
            {
                g = new b(new CFBBlockCipher(f, f.getBlockSize() * 8));
                return;
            }
        }
        if (m.startsWith("PGP"))
        {
            boolean flag = m.equalsIgnoreCase("PGPCFBwithIV");
            i = f.getBlockSize();
            g = new b(new PGPCFBBlockCipher(f, flag));
            return;
        }
        if (m.equalsIgnoreCase("OpenPGPCFB"))
        {
            i = 0;
            g = new b(new OpenPGPCFBBlockCipher(f));
            return;
        }
        if (m.startsWith("SIC"))
        {
            i = f.getBlockSize();
            if (i < 16)
            {
                throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
            } else
            {
                g = new b(new BufferedBlockCipher(new SICBlockCipher(f)));
                return;
            }
        }
        if (m.startsWith("CTR"))
        {
            i = f.getBlockSize();
            g = new b(new BufferedBlockCipher(new SICBlockCipher(f)));
            return;
        }
        if (m.startsWith("GOFB"))
        {
            i = f.getBlockSize();
            g = new b(new BufferedBlockCipher(new GOFBBlockCipher(f)));
            return;
        }
        if (m.startsWith("CTS"))
        {
            i = f.getBlockSize();
            g = new b(new CTSBlockCipher(new CBCBlockCipher(f)));
            return;
        }
        if (m.startsWith("CCM"))
        {
            i = f.getBlockSize();
            g = new a(new CCMBlockCipher(f));
            return;
        }
        if (m.startsWith("EAX"))
        {
            i = f.getBlockSize();
            g = new a(new EAXBlockCipher(f));
            return;
        }
        if (m.startsWith("GCM"))
        {
            i = f.getBlockSize();
            g = new a(new GCMBlockCipher(f));
            return;
        } else
        {
            throw new NoSuchAlgorithmException((new StringBuilder("can't support mode ")).append(s).toString());
        }
    }

    protected void engineSetPadding(String s)
    {
        String s1 = Strings.b(s);
        if (s1.equals("NOPADDING"))
        {
            if (g.a())
            {
                g = new b(new BufferedBlockCipher(g.b()));
            }
            return;
        }
        if (s1.equals("WITHCTS"))
        {
            g = new b(new CTSBlockCipher(g.b()));
            return;
        }
        j = true;
        if (a(m))
        {
            throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
        }
        if (s1.equals("PKCS5PADDING") || s1.equals("PKCS7PADDING"))
        {
            g = new b(g.b());
            return;
        }
        if (s1.equals("ZEROBYTEPADDING"))
        {
            g = new b(g.b(), new ZeroBytePadding());
            return;
        }
        if (s1.equals("ISO10126PADDING") || s1.equals("ISO10126-2PADDING"))
        {
            g = new b(g.b(), new ISO10126d2Padding());
            return;
        }
        if (s1.equals("X9.23PADDING") || s1.equals("X923PADDING"))
        {
            g = new b(g.b(), new X923Padding());
            return;
        }
        if (s1.equals("ISO7816-4PADDING") || s1.equals("ISO9797-1PADDING"))
        {
            g = new b(g.b(), new ISO7816d4Padding());
            return;
        }
        if (s1.equals("TBCPADDING"))
        {
            g = new b(g.b(), new TBCPadding());
            return;
        } else
        {
            throw new NoSuchPaddingException((new StringBuilder("Padding ")).append(s).append(" unknown.").toString());
        }
    }

    protected int engineUpdate(byte abyte0[], int i1, int j1, byte abyte1[], int k1)
    {
        try
        {
            i1 = g.a(abyte0, i1, j1, abyte1, k1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ShortBufferException(abyte0.getMessage());
        }
        return i1;
    }

    protected byte[] engineUpdate(byte abyte0[], int i1, int j1)
    {
        byte abyte1[];
        int k1 = g.b(j1);
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        abyte1 = new byte[k1];
        i1 = g.a(abyte0, i1, j1, abyte1, 0);
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        abyte0 = null;
_L4:
        return abyte0;
_L2:
        abyte0 = abyte1;
        if (i1 == abyte1.length) goto _L4; else goto _L3
_L3:
        abyte0 = new byte[i1];
        System.arraycopy(abyte1, 0, abyte0, 0, i1);
        return abyte0;
        g.a(abyte0, i1, j1, null, 0);
        return null;
    }
}
