// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.opengl.GLES20;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, Pulse3DView

class CommandDepthMask extends CommandBase
{

    static int argTypes[] = {
        2
    };
    boolean flag_;

    CommandDepthMask()
    {
    }

    void execute()
    {
        GLES20.glDepthMask(flag_);
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        boolean flag = false;
        if (aglarg[0].intVal[0] != 0)
        {
            flag = true;
        }
        flag_ = flag;
    }

}
